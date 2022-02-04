package com.example.bizprofile.dao;

import com.example.bizprofile.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
