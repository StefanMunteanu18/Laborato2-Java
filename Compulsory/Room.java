import java.util.Objects;

public class Room {


    public enum RoomType {
        LECTURE_HALL,
        COMPUTER_LAB;
    }

    private String name;
    private int capacity;
    private RoomType type;

    //constructor with parameters
    public Room(String name, RoomType type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public RoomType getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Room)) {
            return false;
        }
        Room other = (Room) obj;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", type=" + type +
                '}';
    }
}
