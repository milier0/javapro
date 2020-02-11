package com.neuedu.test;

/**
 * Created by hy on 2020/2/10.
 */
public class Mybook {
    //书名
    private String name;
    //价格
    private double price;
    //出版社
    private String press;
    //作者
    private String author;
    //书的ISBN号
    private String bookISBN;

    public Mybook(String name, double price, String press, String author, String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
        this.bookISBN = bookISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    @Override
    public String toString() {
        return "Mybook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                '}';
    }
}
