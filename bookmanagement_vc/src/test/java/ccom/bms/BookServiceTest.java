package ccom.bms;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.bms.Entity.Book;
import com.bms.Exception.BookException;
import com.bms.Service.BookService;


class BookServiceTest {
	
	BookService bookService;

	@BeforeEach
	void setUp()  {
		bookService=new BookService();
	}

	@AfterEach
	void cleanUp()  {
		bookService=null;
		System.out.println("object is garbage collected");
	}

	@Test
	@DisplayName("Test for addBook method")
	public void addBookTest() {
		
		bookService.addBook(101, "Java", "J.Gosling", 200, "abc");
		bookService.addBook(102, "C++", "D.Ritchie", 300, "xyz");
		
		assertEquals(2, bookService.lengthOfList());
		
	}
	
	@Test
	@DisplayName("Test for displayAll method")
	public void displayAllTest()
	{
		bookService.addBook(101, "Java", "J.Gosling", 200, "abc");
		bookService.addBook(102, "C++", "D.Ritchie", 300, "xyz");
		
		assertThat(bookService.displayAll()).isNotNull();
		
	}
	
	@Test
	@DisplayName("Test for displayBookById method")
	public void displayBookByIdTest()throws BookException
	{
		bookService.addBook(101, "Java", "J.Gosling", 200, "abc");
		bookService.addBook(102, "C++", "D.Ritchie", 300, "xyz");
		
		Book b=bookService.displayBookById(101);
		assertThat(b.getBookName()).isEqualTo("Java");
//		assertEquals("Java", b.getBookName());
		
	}
	
	@Test
	@DisplayName("Test for updateBookById method")
	public void updateBookById()throws BookException
	{
		bookService.addBook(101, "Java", "J.Gosling", 200, "abc");
		bookService.addBook(102, "C++", "D.Ritchie", 300, "xyz");
		
		Book b=bookService.updateById(101);
		assertEquals("Python", b.getBookName());
		
	}
	
	@Test
	@DisplayName("Test for deleteBookById method")
	public void deleteBookByIdTest()throws BookException
	{
		bookService.addBook(101, "Java", "J.Gosling", 200, "abc");
		bookService.addBook(102, "C++", "D.Ritchie", 300, "xyz");
		
		bookService.deleteBookById(101);
		assertEquals(1, bookService.lengthOfList());
	}
	
	

}
