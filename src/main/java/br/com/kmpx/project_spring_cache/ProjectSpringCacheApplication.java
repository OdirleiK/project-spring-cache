package br.com.kmpx.project_spring_cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
//@EnableScheduling
public class ProjectSpringCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSpringCacheApplication.class, args);
	}

}
