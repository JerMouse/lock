package com.yiyun.lockcontroller.view.select_calendar_view;


import java.util.List;

class Events {

    private final List<Event> events;
    private final long timeInMillis;

    Events(long timeInMillis, List<Event> events) {
        this.timeInMillis = timeInMillis;
        this.events = events;
    }

    long getTimeInMillis() {
        return timeInMillis;
    }

    List<Event> getEvents() {
        return events;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Events event = (Events) o;

        return timeInMillis == event.timeInMillis && (events != null ? events.equals(event.events) : event.events == null);

    }

    @Override
    public int hashCode() {
        int result = events != null ? events.hashCode() : 0;
        result = 31 * result + (int) (timeInMillis ^ (timeInMillis >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Events{" +
                "events=" + events +
                ", timeInMillis=" + timeInMillis +
                '}';
    }
}
