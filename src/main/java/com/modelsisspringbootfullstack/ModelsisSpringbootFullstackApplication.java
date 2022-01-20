package com.modelsisspringbootfullstack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.modelsisspringbootfullstack.dto.request.UserDtoRequest;
import com.modelsisspringbootfullstack.dto.response.UserDtoResponse;
import com.modelsisspringbootfullstack.iservice.IUserService;

@SpringBootApplication
public class ModelsisSpringbootFullstackApplication implements CommandLineRunner{
    @Autowired
	private IUserService iUserService;
	public static void main(String[] args) {
		SpringApplication.run(ModelsisSpringbootFullstackApplication.class, args);
	}
	@Bean
	public BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}
	@Override
	public void run(String... args) throws Exception {
		UserDtoResponse user=iUserService.se_connecter("bollky.nana@gmail.com", "bollky.nana@gmail.com");
		if(user == null) {
			iUserService.login_up( new UserDtoRequest("NANA","bollky.nana@gmail.com","bollky.nana@gmail.com",
					"bollky.nana@gmail.com",null,null));	
		}
		
	}
    
}
