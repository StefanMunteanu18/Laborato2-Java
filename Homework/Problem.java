import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * clasa Problem contine datele problemei reprezentate in doua liste: Rooms, respectiv Events
 */
public class Problem {
    private ArrayList<Event> events;
    private ArrayList<Room> rooms;

    /**
     * Constructorul clasei transforma obiectele de tip Array date ca parameti in HashSet-uri pentru a ne asigura ca nu exista un eveniment introdus de doua ori, apoi sunt transformate in obiecte de tip ArrayList
     * @param events lista evenimentelor
     * @param rooms lista camerelor
     */
    public Problem(Event[] events, Room[] rooms) {
        this.events = new ArrayList<Event>();
        this.rooms = new ArrayList<Room>();
        this.rooms.addAll(new HashSet<>(Arrays.asList(rooms)));
        this.events.addAll(new HashSet<>(Arrays.asList(events)));
    }


    @Override
    public String toString() {
        return "Problem{" +
                "events=" + events.toString() +
                ", rooms=" + rooms.toString() +
                '}';
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
