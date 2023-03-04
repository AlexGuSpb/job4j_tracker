package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Clean code", 100);
        Book book1 = new Book("Kolobok", 10);
        Book book2 = new Book("Code clean", 33);
        Book book3 = new Book("Empty", 0);

        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " " + bk.getPages());
        }
        System.out.println();
        books[0] = book3;
        books[3] = book;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " " + bk.getPages());
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + " " + bk.getPages());
            }
        }
    }
}