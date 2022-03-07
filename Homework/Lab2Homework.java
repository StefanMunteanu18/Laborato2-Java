public class Lab2Homework {
    public static void main(String []args) {
        Event event = new Event("C1", 100, 8,10);
        Event event1 = new Event("C2", 100, 10,12);
        Event event2 = new Event("L1", 30, 8,10);
        Event event3 = new Event("L2", 30, 8,10);
        Event event4 = new Event("L3", 30, 10,12);
        System.out.println(event);
        System.out.println(event1);

        ComputerLab room = new ComputerLab("401", 30);
        ComputerLab room1 = new ComputerLab("403", 30);
        ComputerLab room2 = new ComputerLab("405", 30);
        LectureHall room3 = new LectureHall("309", 100);


        System.out.println(room);
        System.out.println(room1);

        Event[] events = new Event[5];
        Room[] rooms = new Room[4];
        events[0] = event;
        events[1] = event1;
        events[2] = event2;
        events[3] = event3;
        events[4] = event4;
        rooms[0] = room;
        rooms[1] = room1;
        rooms[2] = room2;
        rooms[3] = room3;


        Problem problem = new Problem(events, rooms);
        System.out.println(problem);
        Algorithm greedy = new Algorithm();
        System.out.println(greedy.solve(problem));
    }
}
