package com.zzxw.main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Path("/")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MySmallProjectApplication {

	 @Path("/home") 
	 @GET
     String home() {  
         return "欢迎使用SpringBoot!";  
     }  
	
	public static void main(String[] args) {
		SpringApplication.run(MySmallProjectApplication.class, args);
	}
}
