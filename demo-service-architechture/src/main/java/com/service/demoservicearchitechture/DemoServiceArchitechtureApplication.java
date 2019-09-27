package com.service.demoservicearchitechture;

import java.util.List;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.service.demoservicearchitechture.config.Service;
import com.service.demoservicearchitechture.config.MultiService;

@SpringBootApplication
public class DemoServiceArchitechtureApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceArchitechtureApplication.class, args);
	}
	
	//To be used for single data fetch type from Yaml
	/*@Bean
	ApplicationRunner applicationRunner(Service serviceConfig)
	{
		return args->{System.out.println(serviceConfig);};
	}*/
	
	//To be used for multiple data fetch type from Yaml
	@Bean
	ApplicationRunner applicationRunner(List<MultiService> serviceConfig)
	{
		return args->{System.out.println(serviceConfig);};
	}
	
	@Bean
	@ConfigurationProperties("service")
	public Service service(){
		return new Service();
	}
	
	@Bean
	@ConfigurationProperties("multi-service")
	public MultiService service2(){
		return new MultiService();
	}

}
