package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben on 1/18/17.
 */
public class Status {
    private List<User> scores;
    private int current;

    public Status() {
        scores = new ArrayList<>();
    }

    public Status(List<User> scores, int current) {
        this.scores = scores;
        this.current = current;
    }

    public List<User> getScores() {
        return scores;
    }

    public void setScores(List<User> scores) {
        this.scores = scores;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
}
