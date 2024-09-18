package com.springbootproject.couse.Repositories;

import com.springbootproject.couse.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
