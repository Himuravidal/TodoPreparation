package com.example.adacher.todopreparation.models;

import com.orm.SugarRecord;

/**
 * Created by adacher on 24-04-17.
 */

public class Pending extends SugarRecord {

    private String name, description;
    private boolean done;


    public Pending() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
