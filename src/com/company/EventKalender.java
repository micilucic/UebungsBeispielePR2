package com.company;

import ar.campus02.emp.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class EventKalender {
    ArrayList<Event> events = new ArrayList<>();

    public Event getByTitle(String title) {
        for (Event e : events) {
            if (e.getTitle().equals(title)) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Event> getByOrt(String ort) {
        ArrayList<Event> eventsInOnePlace = new ArrayList<>();
        for (Event e : events) {
            if (e.getOrt().equals(ort)) {
                eventsInOnePlace.add(e);
            }
        }
        return eventsInOnePlace;
    }

    public ArrayList<Event> getByEintrittsPreis(double min, double max) {
        ArrayList<Event> eventsByPreis = new ArrayList<>();
        for (Event e : events) {
            if (e.getEintrittsPreis() >= min && e.getEintrittsPreis() <= max) {
                eventsByPreis.add(e);
            }
        }
        return eventsByPreis;
    }

    public Event getMostExpensiveByOrt(String ort) {
        double max = 0;
        Event maxE = new Event(null, null, 0);
        for (Event e : events) {
            if (e.getOrt().equals(ort)) {
                if (e.getEintrittsPreis() > max) {
                    max = e.getEintrittsPreis();
                    maxE = e;
                }
            }
        }
        return maxE;
    }

    public double getAvgPreisByOrt(String ort) {
        int counter = 0;
        double sum = 0;
        for (Event e : events) {
            if (e.getOrt() == ort) {
                sum = sum + e.getEintrittsPreis();
                counter++;
            }
        }
        return sum / counter;
    }


    public HashMap<String, Integer> getCountEventsByOrt() {
        HashMap<String, Integer> eventsCount = new HashMap<>();

        for (Event e : events) {
            eventsCount.put(e.getOrt(), 0);
        }
        for (String o : eventsCount.keySet()) {
            int counter = 0;
            for (Event e : events) {
                if (e.getOrt().equals(o)) {
                    eventsCount.put(e.getOrt(), ++counter);
                }
            }
        }
        return eventsCount;
    }

    // UNBEDINGT NOCH EINMAL GENAUER ANSCHAUEN
    public HashMap<String, Double> getSumPriceEventsByOrt() {

        HashMap<String, Double> result = new HashMap<>();

        for (Event e : events) {
            result.put(e.getOrt(), null);
        }

        for (String o : result.keySet()) {
            double sum = 0.0;

            for (Event e : events) {
                if(o.equals(e.getOrt())) {
                    result.put(e.getOrt(), (sum += e.getEintrittsPreis()));
                }
            }
        }

        return result;
    }


    @Override
    public String toString() {
        return "EventKalender{" +
                "events=" + events +
                '}';
    }
}