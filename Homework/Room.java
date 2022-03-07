import java.util.Objects;

/**
 * Clasa abstracta care descrie o sala
 */

public abstract class Room {

    private String name;
    private int capacity;


    //default constructor
    public Room() {
        this.name = new String();
        this.capacity = 0;
    }


    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    //getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
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
                '}';
    }
}
