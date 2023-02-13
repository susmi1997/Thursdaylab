package com.bms.Service;

import java.util.ArrayList;
import java.util.List;
import com.bms.Entity.Book;
import com.bms.Exception.BookException;

public class BookService {
	
	private List<Book> book=new ArrayList<>();
	
	public void addBook(long id, String bName, String authorName, double price, String publisher )
	{
		book.add(new Book(id, bName, authorName, price, publisher));
		
	}
	
	public int lengthOfList()
	{
		return book.size();
	}
	
	public List<Book> displayAll()
	{
		return book;
	}
	
	public Book displayBookById(long id)throws BookException
	{
		int i;
		for(i=0;i<book.size();i++)
		{
			if(book.get(i).getBookId()==id)
				return book.get(i);
			
		}
		if(i==book.size())
			throw new BookException("book not found");
		
		return null;
	}
	
	public Book updateById(long id)throws BookException
	{
		int i;
		for(i=0;i<book.size();i++)
		{
			if(book.get(i).getBookId()==id)
			{
				book.get(i).setBookName("Python");
				book.get(i).setAuthorName("pqr");
				book.get(i).setPrice(500);
				book.get(i).setPublisher("ABC");
				return book.get(i);
			}
		}
		if(i==book.size())
			throw new BookException("book not flound");
		return null;
	}
	
	public List<Book> deleteBookById(long id)throws BookException
	{
		int i;
		for(i=0;i<book.size();i++)
		{
			if(book.get(i).getBookId()==id)
			{
				book.remove(i);
				return book;
			}
		}
		if(i==book.size())
			throw new BookException("book not flound");
		return null;
	}

}
