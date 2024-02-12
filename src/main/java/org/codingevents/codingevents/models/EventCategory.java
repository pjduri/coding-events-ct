package org.codingevents.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;

@Entity
public class EventCategory extends AbstractEntity {

    @Size(min=3, message="Name must contain at least three characters")
    private String name;

    public EventCategory() { }

    public EventCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
