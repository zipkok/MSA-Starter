package board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class PerfectBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerfectBoardApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner runner() {
		return (a) -> {
			System.out.println("Runnable Jar running");
		};
	}
}



