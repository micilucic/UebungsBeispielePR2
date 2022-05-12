package com.company;

public class CrazyLabyrinthApp {
    public static void main(String[] args) {
        LabyrinthTile lt = new LabyrinthTile(Direction.UP, Direction.DOWN);
        LabyrinthTile[] path = new LabyrinthTile[] {lt};
        CrazyLabyrinth cl = new CrazyLabyrinth();

        System.out.println(cl.checkPathConsistency(path));
    }
}
