package com.aliction.springcolorsserver;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ColorObject {

    private int id;
    private int squareId;
    private UUID boardId;
    private String color;

    public ColorObject(){

    }

    public ColorObject(int id, int squareId, UUID boardId, String color) {
        this.id = id;
        this.squareId = squareId;
        this.boardId = boardId;
        this.color = color;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSquareId() {
        return squareId;
    }
    public void setSquareId(int squareId) {
        this.squareId = squareId;
    }
    public UUID getBoardId() {
        return boardId;
    }
    public void setBoardId(UUID boardId) {
        this.boardId = boardId;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    
}
