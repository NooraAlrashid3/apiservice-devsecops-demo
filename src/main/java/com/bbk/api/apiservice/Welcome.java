package com.bbk.api.apiservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
 @GetMapping("Welcome")
 public String welcome() {
	 return "Welcome to DevSecOps class";
 }
}
