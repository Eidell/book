package operation;

import book.BookList;

public interface IOPeration { // 接口提供了一种规范，让不同的类可以实现相同的接口, 接口可以包含常量和抽象方法的声明
    void work(BookList bookList);
}
