package com.api.mytodo.controllers.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserRequestDTO {

  @NotBlank
  @NotEmpty
  @Email
  private String email;

  @NotBlank
  @NotEmpty
  @Size(min = 6)
  private String password;

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
}
