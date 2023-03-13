package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void toGo() {
        System.out.println(getClass().getSimpleName() + " движется по маршруту СПб - Москва");
    }

    @Override
    public void passengers(int numbers) {
        System.out.println(getClass().getSimpleName() + " количество пассажиров " + numbers);
    }

    @Override
    public int toRefuel(int liter) {
        return liter;
    }
}