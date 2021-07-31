package com.org.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.org.model.Books;
import com.org.service.BooksService;

@RestController
public class BooksController 
{

@Autowired
BooksService booksService;

@GetMapping("/booktable")
private List<Books> getAllBooks() 
{
return booksService.getAllBooks();
}

@GetMapping("/booktable/{BNO}")
private Books getBooks(@PathVariable("BNO") int bookid) 
{
return booksService.getBooksById(bookid);
}

@DeleteMapping("/booktable/{BNO}")
private void deleteBook(@PathVariable("BNO") int bookid) 
{
booksService.delete(bookid);
}

@PostMapping("/booktable")
private int saveBook(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return books.getBookid();
}

@PutMapping("/booktable")
private Books update(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return books;
}
}
