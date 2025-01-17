
package com.QuanLyThuVien.service;

import com.QuanLyThuVien.dao.BookDao;
import com.QuanLyThuVien.model.Book;
import java.util.List;

public class BookService {
    private BookDao bookDao;

    public BookService() {
        bookDao = new BookDao();
    }
    
    public List<Book> getAllBook(){
        return bookDao.getAllBook();
    }
    public List<Book> getAllUniqueBookByAuthor(){
        return bookDao.getAllUniqueBookByAuthor();
    }
    public void addBook(Book book){
        bookDao.addBook(book);
    }
    
    public Book getBookById(int book_id){
        return bookDao.getBookById(book_id);
    }
    
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }
    
    public List<Book> searchBookFromTitle(String title){
        return bookDao.searchBookFromTitle(title);
    }
    
    public List<Book> searchBookFromAuthor(String author){
        return bookDao.searchBookFromAuthor(author);
    }
    
    public List<Book> searchBookFromCategory(String category){
        return bookDao.searchBookFromCategory(category);
    }
    public void deleteBook(int book_id){
        bookDao.deleteBook(book_id);
    }
}
