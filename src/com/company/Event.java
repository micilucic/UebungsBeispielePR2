package com.company;

public class Event {
    private String title;
    private String ort;
    private double eintrittsPreis;

    public Event(String title, String ort, double eintrittsPreis) {
        this.title = title;
        this.ort = ort;
        this.eintrittsPreis = eintrittsPreis;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", ort='" + ort + '\'' +
                ", eintrittsPreis=" + eintrittsPreis +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getEintrittsPreis() {
        return eintrittsPreis;
    }

    public void setEintrittsPreis(double eintrittsPreis) {
        this.eintrittsPreis = eintrittsPreis;
    }
}
