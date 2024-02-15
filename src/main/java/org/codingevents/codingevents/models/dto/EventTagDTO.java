package org.codingevents.codingevents.models.dto;

import jakarta.validation.constraints.NotNull;
import org.codingevents.codingevents.models.Event;
import org.codingevents.codingevents.models.Tag;

public class EventTagDTO {

    @NotNull
    private Event event;

    @NotNull
    private Tag tag;

    public EventTagDTO() {}

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
