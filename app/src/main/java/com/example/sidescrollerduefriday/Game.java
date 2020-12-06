package com.example.sidescrollerduefriday;

public class Game {
    String description;
    int drawableID;
    public Game(String description, int drawableID)
    {
        this.description = description;
        this.drawableID = drawableID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDrawableID() {
        return drawableID;
    }

    public void setDrawableID(int drawableID) {
        this.drawableID = drawableID;
    }
}
