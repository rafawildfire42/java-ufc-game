package Event;

public class Event {
    private int number;
    public enum EventType {
        UFC_FIGHT_NIGHT,
        UFC_NUMBERED,
    }
    public EventType eventType;

    public Event(int number, EventType eventType) {
        this.number = number;
        this.eventType = eventType;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        EventType eventType = getEventType();

        if (eventType == EventType.UFC_FIGHT_NIGHT) {
            return "UFC Fight Night";
        } else {
            return "UFC " + this.number;
        }

    }
}
