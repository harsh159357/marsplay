package com.harsh.marsplayassignment.models;

public class EventObject {

    private final int id;
    private final Object object;


    public EventObject(int id, Object object) {
        this.id = id;
        this.object = object;
    }

    public int getId() {
        return id;
    }

    public Object getObject() {
        return object;
    }
}
