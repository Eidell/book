import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static User login(){
        System.out.println("请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); // nextLine()方法会读取整行输入，包括空格在内的所有字符，直到遇到换行符为止。
        System.out.println("请输入你的身份, 1:管理员   2：普通用户");
        int choice = scanner.nextInt(); // nextInt()方法会读取下一个整数，但不会读取换行符，它会将换行符留在输入流中。\
        if(choice == 1){
            return new AdminUser(name);
        }else{
            return new NormalUser(name);

        }
    }



    // 创建书架、进行登录、
    public static void main(String[] args) {
        BookList bookList = new BookList();
        // 根据输入决定是哪个对象
        User user = login(); // 发生了向上转型
        while(true){
            int choice = user.menu(); //父类对象不能调用子类独有的方法，所以要将父类也给一个方法，子类的方法变成重写方法，父类变成抽象类
            // 根据输入决定是哪种操作
            System.out.println("choice :" + choice);
            user.doOperation(choice, bookList);
        }

    }
}
