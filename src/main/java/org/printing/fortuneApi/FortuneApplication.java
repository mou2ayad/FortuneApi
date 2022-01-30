package org.printing.fortuneApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.printing.fortuneApi")
public class FortuneApplication {
	public static void main(String[] args) {
		SpringApplication.run(FortuneApplication.class, args);
	}

}
