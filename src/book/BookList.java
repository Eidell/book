package book;

import book.Book;
// 不同用户对书架有不同的操作
public class BookList {
    private Book[] books = new Book[10]; // 定义能容纳十个对象的数组
    private int usedSize; // 当前书架实际存放的书的数量

    public BookList() {
        this.books = books;
        this.books[0] = new Book("三国演义","罗贯中",10,"小说");
        this.books[1] = new Book("西游记","吴承恩",9,"小说");
        this.books[2] = new Book("红楼梦","曹雪芹",19,"小说");
        this.usedSize = 3;
    }

    public int getUsedSize() { // 获取当前书架实际存放的书的数量
        return usedSize;
    }

    public void setUsedSize(int usedSize) {// 修改当前书架实际存放的书的数量
        this.usedSize = usedSize;
    }
    public Book getBook(int pos){ // 获取某个位置的书
        return books[pos];
    }
    public void setBook(int pos, Book book){ // 修改某个位置的书
        books[pos] = book;
    }

    public Book[] getBooks(){
        return books;
    }






}
