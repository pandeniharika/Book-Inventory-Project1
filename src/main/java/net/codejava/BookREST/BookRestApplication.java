package net.codejava.BookREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@SpringBootApplication
public class BookRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookRestApplication.class, args);
	}
	

}
