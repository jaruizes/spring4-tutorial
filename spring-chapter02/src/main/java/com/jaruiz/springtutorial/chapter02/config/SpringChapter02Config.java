package com.jaruiz.springtutorial.chapter02.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@EnableAutoConfiguration
@ComponentScan("com.jaruiz.springtutorial.chapter02")
@EntityScan("com.jaruiz.springtutorial.chapter02.entities")
@EnableJpaRepositories("com.jaruiz.springtutorial.chapter02.repositories")
public class SpringChapter02Config {
	
	@Bean
	public DataSource dataSource() {
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.H2) //.H2 or .DERBY
			//.addScript("db/dev/create-db.sql")
			//.addScript("db/dev/insert-data.sql")
			.build();
		return db;
	}
}
