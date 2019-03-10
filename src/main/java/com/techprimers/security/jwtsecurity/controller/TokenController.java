package com.techprimers.security.jwtsecurity.controller;

import com.techprimers.security.jwtsecurity.model.JwtUser;
import com.techprimers.security.jwtsecurity.security.JwtGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

  private JwtGenerator jwtGenerator;

  @Autowired
  public TokenController(JwtGenerator jwtGenerator) {
    this.jwtGenerator = jwtGenerator;
  }

  @PostMapping
  public String generate(@RequestBody final JwtUser jwtUser) {
    return jwtGenerator.generate(jwtUser);
  }
}
