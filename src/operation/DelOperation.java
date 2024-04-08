package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOPeration {
    public void work(BookList bookList){
        System.out.println("删除图书！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要删除的图书");
        String name = scanner.nextLine();

        int pos = -1;

        int currentSize = bookList.getUsedSize();
        int i = 0;
        for (;i<currentSize;i++){
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                pos = i;
                break;
            }
        }

        if(i == currentSize){
            System.out.println("没有你要删除的图书");
            return;
        }

        // 开始删除
        int j = pos;
        for(;j<currentSize-1;++j){
            Book book = bookList.getBook(j+1);
            bookList.setBook(j,book);
        }
        bookList.setBook(j,null);
        bookList.setUsedSize(currentSize-1);
    }
}
