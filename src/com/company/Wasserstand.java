package com.company;

public class Wasserstand {
    private int id;
    private String gewaesserName;
    private String ort;
    private double messWert;
    private double messWertFuerAlarmierung;
    private int Zeitpunkt;

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", gewaesserName='" + gewaesserName + '\'' +
                ", ort='" + ort + '\'' +
                ", messWert=" + messWert +
                ", messWertFuerAlarmierung=" + messWertFuerAlarmierung +
                ", Zeitpunkt=" + Zeitpunkt +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGewaesserName() {
        return gewaesserName;
    }

    public void setGewaesserName(String gewaesserName) {
        this.gewaesserName = gewaesserName;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getMessWert() {
        return messWert;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public double getMessWertFuerAlarmierung() {
        return messWertFuerAlarmierung;
    }

    public void setMessWertFuerAlarmierung(double messWertFuerAlarmierung) {
        this.messWertFuerAlarmierung = messWertFuerAlarmierung;
    }

    public int getZeitpunkt() {
        return Zeitpunkt;
    }

    public void setZeitpunkt(int zeitpunkt) {
        Zeitpunkt = zeitpunkt;
    }
}
