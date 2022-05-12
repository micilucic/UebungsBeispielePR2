package com.company;

import java.util.ArrayList;

public class WasserstandManager {
    private ArrayList<Wasserstand> ws = new ArrayList<>();

    public void add(Wasserstand w) {
        ws.add(w);
    }

    public Wasserstand findById(int id) {
        for (Wasserstand w : ws) {
            if (id == w.getId()) {
                return w;
            }
        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName) {
        ArrayList<Wasserstand> newWassertand = new ArrayList<>();
        for (Wasserstand w : ws) {
            if (gewaesserName.equals(w.getGewaesserName())) {
                newWassertand.add(w);
            }
        }
        return newWassertand;
    }

    public Wasserstand findLastWasserstand(String gewaesserName) {
        double newestWasserstand = 0;
        Wasserstand result = new Wasserstand();
        for (Wasserstand w : ws) {
            if (gewaesserName.equals(w.getGewaesserName()) && w.getZeitpunkt() > newestWasserstand) {
                newestWasserstand = w.getZeitpunkt();
                result = w;
            }
        }
        return result;
    }

    public ArrayList<Wasserstand> findForAlarmierung() {
        ArrayList<Wasserstand> alarmList = new ArrayList<>();
        for (Wasserstand w : ws) {
            if (w.getMessWert() >= w.getMessWertFuerAlarmierung()) {
                alarmList.add(w);
            }
        }
        return alarmList;
    }

    public double calcMittlererWasserstand(String gewaesserName, String ort) {
        double avgWs = 0;
        double counter = 0;
        for (Wasserstand w : ws) {
            if (w.getGewaesserName().equals(gewaesserName) && w.getOrt().equals(ort)) {
                avgWs = avgWs + w.getMessWert();
                counter++;
            }
        }
        return avgWs / counter;
    }

    public ArrayList<Wasserstand> findByZeitpunkt (int von, int bis, String gewaesserName, String ort) {
        ArrayList<Wasserstand> newWS = new ArrayList<>();
        for (Wasserstand w : ws) {
            if (w.getGewaesserName().equals(gewaesserName) && w.getOrt().equals(ort)) {
                if (von >= w.getZeitpunkt() && bis <= w.getZeitpunkt()) {
                    newWS.add(w);
                }
            }
        } return newWS;
    }
}
