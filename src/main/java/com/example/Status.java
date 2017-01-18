package com.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Ben on 1/18/17.
 */
public class Status {
    private HashMap<String, Integer> scores = new HashMap<>();
    private int current;

    public Status() {
    }

    public Status(HashMap<String, Integer> scores, int current) {
        this.scores = scores;
        this.current = current;
    }

    @JsonIgnore
    public HashMap<String, Integer> getScores() {
        return scores;
    }

    @JsonProperty("scores")
    public Set<Map.Entry<String, Integer>> getScoresList() {
        return scores.entrySet();
    }

    public void setScores(HashMap<String, Integer> scores) {
        this.scores = scores;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
}
