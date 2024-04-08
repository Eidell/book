package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ExitOperation implements IOPeration {
    public void work(BookList bookList){
        System.out.println("退出系统！");
        System.exit(0);

    }
}
