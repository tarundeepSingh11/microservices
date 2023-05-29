package restTemplates2.restTemplates2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplates2Application {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplates2Application.class, args);

	}
   @Bean
	public RestTemplate restTemplate() {
	   return new RestTemplate();
   }

}
