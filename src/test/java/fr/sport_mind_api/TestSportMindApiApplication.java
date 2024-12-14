package fr.sport_mind_api;

import org.springframework.boot.SpringApplication;

public class TestSportMindApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(SportMindApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
