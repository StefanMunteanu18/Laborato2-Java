import java.util.HashMap;

/**
 * Clasa Solution retine solutia unei probleme date intr-un format HashMap(Event, Room). Fiecarui eveniment ii este ascignata o sala
 */

public class Solution {
    HashMap<Event, Room> assignment;

    public Solution() {
        this.assignment = new HashMap<Event, Room>();
    }

    public HashMap<Event, Room> getAssignment() {
        return assignment;
    }

    public void setAssignment(Event event, Room room){
        this.assignment.put(event, room);
    }

    @Override
    public String toString() {
        return "Solution{" +
                "assignment=" + assignment +
                '}';
    }
}
