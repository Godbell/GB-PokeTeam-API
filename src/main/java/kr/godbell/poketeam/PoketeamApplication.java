package kr.godbell.poketeam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="kr.godbell")
public class PoketeamApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoketeamApplication.class, args);
	}

}
