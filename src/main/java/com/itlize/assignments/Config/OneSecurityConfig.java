package com.itlize.assignments.Config;

import com.itlize.assignments.Filters.JwtRequestFilter;
import com.itlize.assignments.Service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebSecurity
public class OneSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    MyUserDetailsService myUserDetailsService;
    @Autowired
    private JwtRequestFilter jwtRequestFilter;


    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Autowired
    //Authentication
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        // Configure database-based user password query.
        // Password uses BCryptEncoder (combined with random salt and encryption algorithm) that comes with security.
        //Override the userDetailsService class
        auth.userDetailsService(myUserDetailsService)
                //Override the default password verification class
                .passwordEncoder(passwordEncoder());
    }


    @Bean
    public PasswordEncoder passwordEncoder (){
        return new BCryptPasswordEncoder();
    }


    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {


        httpSecurity.csrf().disable()
                //Cross-origin-resource-sharing
                .cors().and()
                .authorizeRequests()
                .antMatchers("/authenticate", "/register").permitAll()// Allow authenticate method and register method accessed without logging in
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()// others need to be accessed after authentication
                .and()
                .logout().permitAll()
                // redirect to the login page
                .logoutRequestMatcher(new AntPathRequestMatcher("Users/logout","POST"))
//                .and()
//                .formLogin().loginPage("/users/login")
                .and()
                .exceptionHandling().and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        httpSecurity.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);

    }


    @Bean
    public WebMvcConfigurer corsConfigure() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
            }
        };
    }



}
