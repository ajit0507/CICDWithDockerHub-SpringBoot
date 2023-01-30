package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdWithDockerHubSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdWithDockerHubSpringBootApplication.class, args);
	}

}


//echo "# CICDWithDockerHub-SpringBoot" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/ajit0507/CICDWithDockerHub-SpringBoot.git
//git push -u origin main