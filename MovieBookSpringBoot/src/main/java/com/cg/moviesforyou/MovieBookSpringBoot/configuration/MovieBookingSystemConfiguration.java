package com.cg.moviesforyou.MovieBookSpringBoot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class MovieBookingSystemConfiguration {
	
	
	@Bean
	public AuditorAware<String> auditorProvider(){
		return new AuditorAwareImpl();
	}

}
