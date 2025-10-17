package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Configuration
public class AppConfig {


	//spring bean => memory life cycle -> singleton 
	@Bean
	PasswordEncoder getBcrypt() {
		return new BCryptPasswordEncoder(); 
	}

	
	//@Autowired 
	@Bean
	Cloudinary getCloudinary()
	{
		return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dzko8yjs6",
                "api_key", "812235955324293",
                "api_secret", "myUUXHnsXifcK0DyinTVjQKan_U",
                "secure", true
        ));	}

}
