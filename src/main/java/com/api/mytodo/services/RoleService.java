package com.api.mytodo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.mytodo.models.Role;
import com.api.mytodo.repository.RoleRepository;

@Service
public class RoleService {
  
  @Autowired
  private RoleRepository roleRepository;

  public Role findByName(String name) {
    return this.roleRepository.findByName(name);
  }
}
