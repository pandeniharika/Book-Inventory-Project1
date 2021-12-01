package net.codejava.BookREST;

import java.security.GeneralSecurityException;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy.Content;
import org.springframework.expression.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import aj.org.objectweb.asm.Type;

@RestController
public class BookController {
	@Autowired
	private BookService service;
	
	public void setBookService(BookService service) {
		this.service = service;
	}

	@GetMapping("/books")
	public List<Book> list() {
		return service.listAll();
	}

	
	@GetMapping("/books/{barcode}")
	public ResponseEntity<Book> get(@PathVariable Integer barcode) {
		try {
			Book book = service.get(barcode);
			return new ResponseEntity<Book>(book, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);

		}

	}
	@PostMapping(
			consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
			path = "/books")
	public void add(@RequestBody Book book) {
		
		service.save(book); 
	}

	
	@PutMapping("/books/{barcode}")
	public ResponseEntity<?> update(@RequestBody Book book, @PathVariable Integer barcode) {
	    try {
	        Book existBook = service.get(barcode);
	        service.save(book);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@DeleteMapping("/books/{barcode}")
	public void delete(@PathVariable Integer barcode) {
	    service.delete(barcode);
	}

}
