-- We can create H2 tables using hibernate itself. Ideally data.sql should be used only for populating data. But in case we do need to create DB table despite addeding @Entity
-- Create a schema.sql file with create table script and disable auto tabe creation by adding spring.jpa.hibernate.ddl-auto=none in application.properties
-- In this sample project we have only created a model with no annotations so creating the table in data.sql itself works
-- Database Initialization works only for H2 and HSQLDB. To make it work for other DB add "spring-datasource-initialization-mode=always"
-- In case of multiple database vendors, use data-h2.sql, data-mysql.sql
-- If scripts need to be divided into separate files we can use "spring.datasource,data=classpath:personaldetails.sql" if the sql lies in the resouces folder, else give file:ABSOLUTE FILE PATH
create table person(
    person_id integer NOT NULL,
    person_name varchar(50),
    location varchar(100),
    birth_date timestamp,
    primary key(person_id)
);
INSERT INTO person (person_id, person_name, location, birth_date) VALUES(
1001, 'RAJ', 'INDIA', sysdate()
);
INSERT INTO person (person_id, person_name, location, birth_date) VALUES(
1002, 'ROB', 'UNITED KINGDOM', sysdate()
);
INSERT INTO person (person_id, person_name, location, birth_date) VALUES(
1002, 'CLAIRE', 'CANADA', sysdate()
);
