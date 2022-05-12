package com.company;

public class CrazyLabyrinth {

    public boolean checkPathConsistency(LabyrinthTile[] path) {
        boolean consistency = true;
        for (int i = 0; i < path.length - 1; i++) {
            if ((path[i].getExit() == (Direction.UP)) && (path[i + 1].getEntry() == (Direction.DOWN))) {

            } else if (path[i].getExit() == Direction.DOWN && (path[i].getEntry() == (Direction.UP))) {

            } else if (path[i].getExit() == (Direction.LEFT) && (path[i].getEntry() == (Direction.RIGHT))) {

            } else if (path[i].getExit() == (Direction.RIGHT) && (path[i].getEntry() == (Direction.LEFT))) {

            } else {
                consistency = false;
            }
        }
        return consistency;
    }
}

