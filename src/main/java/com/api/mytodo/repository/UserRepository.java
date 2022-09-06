package com.api.mytodo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.mytodo.models.User;

@Repository
interface UserRepository extends JpaRepository<User, UUID> {
  
}
