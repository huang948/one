package com.itlize.assignments.Repository;

import com.itlize.assignments.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
