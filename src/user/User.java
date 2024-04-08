package user;

import book.BookList;
import operation.IOPeration;

// 不管是普通用户还是管理员用户，它本身
public abstract class User {
    protected String name; // 不写成public，只想user相关的东西在user包下用，在同一包中和子类中可访问
    protected IOPeration[] ioPerations;
    public User(String name) { // 给一个构造函数，没问题
        this.name = name;
    }
    public abstract int menu();
    public void doOperation(int choice, BookList bookList){
        ioPerations[choice].work(bookList);
    }
}
