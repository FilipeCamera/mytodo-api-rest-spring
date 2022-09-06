package com.api.mytodo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
  
  @PostMapping
  public ResponseEntity<Object> create() {
    return ResponseEntity.ok().build();
  }
}
