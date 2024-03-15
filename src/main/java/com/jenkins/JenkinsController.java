package com.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
@GetMapping("/getjen")
public String get() {
	return "jenkins";
}
}
