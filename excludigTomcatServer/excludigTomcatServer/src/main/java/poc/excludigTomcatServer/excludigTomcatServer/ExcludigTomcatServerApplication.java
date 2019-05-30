package poc.excludigTomcatServer.excludigTomcatServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/greeting")
public class ExcludigTomcatServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcludigTomcatServerApplication.class, args);
	}
	
	@GetMapping("/welcome")
	public String greeting() {
		return "WelCome;";
	}

}
