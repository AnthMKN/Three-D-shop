package com.acadproyect.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.acadproyect.springboot.app.models.service.IUploadFileService;

@SpringBootApplication
public class Proyect3DshopApplication implements CommandLineRunner{
	
	@Autowired
	IUploadFileService uploadFileService;

	public static void main(String[] args) {
		SpringApplication.run(Proyect3DshopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		uploadFileService.deleteAll();
		uploadFileService.init();
		
	}
}
