package com.cts.gto.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.cts.gto.dockerdemo")
public class DockerdemoApplication {

	public static void main(String[] args) {
	System.out.println("-----this mis my springboot application------");
		SpringApplication.run(DockerdemoApplication.class, args);
	}
}
