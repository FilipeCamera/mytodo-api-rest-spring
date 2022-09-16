package com.api.mytodo.controllers;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.mytodo.controllers.dto.UserRequestDTO;
import com.api.mytodo.models.User;
import com.api.mytodo.services.RoleService;
import com.api.mytodo.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;
  
  @Autowired
  private RoleService roleService;

  @PostMapping
  public ResponseEntity<Object> create(@RequestBody @Valid UserRequestDTO userRequestDTO) {

    if(userService.findByEmail(userRequestDTO.getEmail()).isEnabled()) {
      return ResponseEntity.badRequest().body("Usuário já existe!");
    }

    User user = new User();

    BeanUtils.copyProperties(userRequestDTO, user);

    user.setRoles(Arrays.asList(roleService.findByName("USER")));

    userService.save(user);
    
    return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
  }
}
