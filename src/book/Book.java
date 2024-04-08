package book;

public class Book {
    // 包含属性：书名、作者、价格、类型、是否被借出
    private String name; // private 表示只有在声明它的类内部才能访问， 只能通过类内部提供的公共方法（getter和setter方法）来访问和修改
    private String author;
    private int price;
    private String type;
    private boolean isBorrowed;

    public Book(String name, String author, int price, String type) { // 不要忘了构造函数
        this.name = name; // this 表示当前对象的引用，用于区分同名的成员变量和局部变量
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() { // 重写对象的toString()方法来实现打印对象时输出自定义的信息
        return "book.Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ((isBorrowed == true)?"已经借出":"未被借出") +
                '}';
    }
}
