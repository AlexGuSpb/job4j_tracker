package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Gusev Alexey Vyacheslavovich");
        student.setGroup("Java");
        student.setReceiptDate("02.01.2023.");
        System.out.println("ФИО: " + student.getName() + ", группа: " + student.getGroup() + ", дата зачисления: " + student.getReceiptDate());
    }
}
