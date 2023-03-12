package ru.job4j.poly;

public class Show {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle minibus = new Minibus();
        Vehicle[] vehicles = new Vehicle[] {plane, train, minibus};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
