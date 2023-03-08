package com.example.apihubclientsdk;

import com.example.apihubclientsdk.client.APIHUBClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("apihub.client")
@Data
@ComponentScan
public class APIHUBClientConfig {

	private String accessKey;

	private String secretKey;

	@Bean
	public APIHUBClient apihubClient(){
		return new APIHUBClient(accessKey, secretKey);
	}

}
