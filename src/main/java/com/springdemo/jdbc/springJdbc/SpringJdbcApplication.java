package com.springdemo.jdbc.springJdbc;

import com.springdemo.jdbcdao.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * THINGS DONE AS A PART OF THIS SETUP
 * 1) Enable h2 console in application.properties
 * 2) create a sql file called data.sql under resources folder. By means of auto-configuration, sprint boot will automatically run the scripts that are a part of this file during server startup
 * 3) Implement the CommandLineRunner interface. the run() available as apart of this interface will be executed everytime the application startsup
 * 4) Use the @Repository on the DAO class which instructs Spring that the class connect and performs CRUD on the DB
 * 5) The SpringJdbc JdbcTemplate class handles connections, executes queries and loops over RS under the hood, making querying much simple
 * 6) Refer https://www.baeldung.com/spring-jdbc-jdbctemplate for advanced usecases of JdbcTemplate
 */
@SpringBootApplication
@ComponentScan("com.springdemo.jdbcdao")
public class SpringJdbcApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	public PersonJdbcDao dao;

	public static void main(String[] args) {

		SpringApplication.run(SpringJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("In the RUN method.....");
		logger.info("Get all Persons -> {}", dao.getAllPerson());

	}
}
