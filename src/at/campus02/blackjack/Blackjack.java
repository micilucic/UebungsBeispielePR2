package at.campus02.blackjack;

import java.util.HashMap;
import java.util.Map;

public class Blackjack {
    private Map<Player, Integer> players = new HashMap<>();

    public boolean add(Player player) {
        if (players.containsKey(player)) {
            return false;
        } else {
            players.put(player, 0);
            return true;
        }
    }

    public boolean addCard(Player player, Integer cardValue) {

        if (!(players.containsKey(player))) {
            return false;
        }

        Integer mappedValue = players.get(player);
        mappedValue += cardValue;
        players.put(player, mappedValue);
        return true;
    }

    public Integer getValue(Player player) {
        Integer mappedValue = players.get(player);
        if (!(players.containsKey(player))) {
            return null;
        }
        return mappedValue;
    }


}

