package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/book")
public class SpringBootAwsApplication {
	
	@Autowired
	private BookRepository bookRepository;

	@PostMapping
	public Book saveBook(@RequestBody Book book) {
		return bookRepository.save(book);

	}

	@GetMapping
	public List<Book> findBook() {
		return bookRepository.findAll();

	}
	/*
	 * @SneakyThrows
	 * 
	 * @GetMapping("{/id}") public Book findBook(@PathVariable int id) { Book
	 * book=bookRepository.findById(id).orElseThrow(() - > new Exception("Book");
	 * return book; }
	 */
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsApplication.class, args);
	}

}
