package com.api.mytodo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.mytodo.models.Role;

public interface RoleRepository extends JpaRepository<Role, UUID> {
  public Role findByName(String name);
}
