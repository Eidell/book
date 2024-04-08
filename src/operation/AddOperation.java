package operation;
import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOPeration{// 把所有对书架的操作单拎出来
    public void work(BookList bookList){
        // 每个类都有一个对书架操作的方法,相当于方法名一样，内容不一样
        System.out.println("新增图书！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名");
        String name = scanner.nextLine();
        System.out.println("请输入作者");
        String author = scanner.nextLine();

        System.out.println("请输入类型");
        String type = scanner.nextLine();
        System.out.println("请输入价格");
        int price = scanner.nextInt();

        Book book = new Book(name,author,price,type);
        // 检查数组中有无这本书
        int currentSize = bookList.getUsedSize();
        for(int i = 0;i < currentSize;++i){
            Book book1 = bookList.getBook(i);
            if(book1.getName().equals(book)){
                System.out.println("有这本书");
                return ;
            }
        }
        // 检查数组是否满了
        if(currentSize == bookList.getBooks().length){
            System.out.println("暑假满了");
        }else{
            bookList.setBook(currentSize, book);
            bookList.setUsedSize(currentSize + 1);
        }

    }
}
