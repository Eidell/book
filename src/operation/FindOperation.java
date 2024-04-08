package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOPeration {
    public void work(BookList bookList){
        System.out.println("查找图书！");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedSize();
        for(int i = 0; i < currentSize; i++){
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println("找到了这本书，信息如下：");
                System.out.println(book);
                return;
            }
        }

    }

}
