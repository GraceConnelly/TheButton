package com.example;

/**
 * Created by Ben on 1/18/17.
 */
public class User {
    private String name;
    private int score;

    public User() {
    }

    public User(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
