package com.company;

public class EventManager {
    public static void main(String[] args) {
        Event loveFestival = new Event("LoveFest", "Salzburg", 85);
        Event exit = new Event("ExitFest", "Novi Sad", 60);
        Event springFest = new Event("SpringFest", "Graz", 90);
        Event farbenFest = new Event("FarbenFest", "Graz", 20);

        EventKalender juni = new EventKalender();

        juni.events.add(loveFestival);
        juni.events.add(exit);
        juni.events.add(springFest);
        juni.events.add(farbenFest);

        System.out.println(juni.getByTitle("ExitFest"));
        System.out.println(juni.getAvgPreisByOrt("Graz"));
        System.out.println(juni.getByOrt("Graz"));
        System.out.println(juni.getByEintrittsPreis(70,90));
        System.out.println(juni.getMostExpensiveByOrt("Graz"));
        System.out.println(juni.getSumPriceEventsByOrt());

    }
}
