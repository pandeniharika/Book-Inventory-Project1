package net.codejava.BookREST;



import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	private Integer barcode;
	private String title;
	private String author;
	private Integer no_of_pages;
	private Boolean read_status;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer barcode, String title, String author, Integer no_of_pages, Boolean read_status) {
		this.barcode = barcode;
		this.title = title;
		this.author = author;
		this.no_of_pages = no_of_pages;
		this.read_status = read_status;
	}
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getBarcode() {
		return barcode;
	}

	public void setBarcode(Integer barcode) {
		this.barcode = barcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getno_of_pages() {
		return no_of_pages;
	}

	public void setno_of_pages(Integer no_of_pages) {
		this.no_of_pages = no_of_pages;
	}

	public Boolean getread_status() {
		return read_status;
	}

	public void setread_status(Boolean read_status) {
		this.read_status = read_status;
	}

}
