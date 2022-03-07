import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clasa Algorithm are o singura metoda "solve" pe care o folosim pentru a rezolva problema specificata prin parametrul "problem"
 */

public class Algorithm {
    /**
     * Metoda "solve"
     * @param problem este un obiect de tip Problem care contine doua liste cu datele problemei: Rooms si Events
     * @return este un obiect de tip Solution care contine evennimentele si clasele asignate acestora. Daca un evenimet are asignat null, inseamna ca nu s-a putut gasi o sala pentru acesta
     */
    public Solution solve(Problem problem){
        Solution solution = new Solution();
        HashMap <Integer, ArrayList<Room>> schedule = new HashMap<Integer, ArrayList<Room>>();
        ArrayList<Room> rooms = problem.getRooms();
        ArrayList<Event> events = problem.getEvents();

        for(int i = 0; i < 24; i++){
            schedule.put(i, new ArrayList<>(rooms));
        }


        for(int i = 0; i < events.size(); i++){
            int start = events.get(i).getStart();
            int end = events.get(i).getEnd();
            ArrayList<Room> availableRooms = new ArrayList<>();
            for(int j = 0; j < schedule.get(start).size(); j++){
                if(schedule.get(start).get(j).getCapacity() >= events.get(i).getSize()){
                    boolean addToAvailableRooms = true;

                    for(int k = start+1; k < end; k++){
                        if(schedule.get(k).indexOf(schedule.get(start).get(j)) == -1) {
                            addToAvailableRooms = false;
                        }
                    }

                    if(addToAvailableRooms == true){
                        availableRooms.add(schedule.get(start).get(j));
                        for(int k = end - 1; k >= start; k--){
                            schedule.get(k).remove(schedule.get(k).indexOf(schedule.get(start).get(j)));
                        }
                    }
                }
            }
            int minRoomCapacity = 10000;
            int minRoomCapacityIndex = 0;
            for(int j = 0; j < availableRooms.size(); j++){
                if(availableRooms.get(j).getCapacity() < minRoomCapacity){
                    minRoomCapacity = availableRooms.get(j).getCapacity();
                    minRoomCapacityIndex = j;
                }
            }
            if(availableRooms.isEmpty()) {
                solution.setAssignment(events.get(i), null);
            }
            else{
                solution.setAssignment(events.get(i), availableRooms.get(minRoomCapacityIndex));
            }
        }
        return solution;
    }
}
