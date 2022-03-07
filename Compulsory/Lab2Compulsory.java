public class Lab2Compulsory {
    public static void main(String []args) {
        Event event = new Event("aaa", 10, 1,2);
        Event event1 = new Event("aaa", 10, 1,2);
        System.out.println(event);
        System.out.println(event1);

        Room room = new Room("BBB", Room.RoomType.LECTURE_HALL, 33);
        Room room1 = new Room("BBB", Room.RoomType.LECTURE_HALL, 33);
        System.out.println(room);
        System.out.println(room1);
    }
}
