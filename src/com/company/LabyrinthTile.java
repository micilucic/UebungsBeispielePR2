package com.company;

public class LabyrinthTile {
    private Direction entry;
    private Direction exit;

    public LabyrinthTile(Direction entry, Direction exit) {
        this.entry = entry;
        this.exit = exit;
    }

    public Direction getEntry() {
        return entry;
    }

    public void setEntry(Direction entry) {
        this.entry = entry;
    }

    public Direction getExit() {
        return exit;
    }

    public void setExit(Direction exit) {
        this.exit = exit;
    }
}
