import java.util.Objects;

/**
 * Clasa Event descrie un eveniment
 */

public class Event {
    private String name;
    private int size;
    private int start;
    private int end;


    /**
     * default consturctor
     */
    public Event(){
        name = "NoName";
        size = 0;
        start = 0;
        end = 0;
    }

    /**
     * Constructo cu parametri de initializat
     * @param argName numele evenimentului
     * @param argSize numarul de participanti la eveniment
     * @param argStart ora de incepere
     * @param argEnd ora de incheiere
     */
    public Event(String argName, int argSize, int argStart, int argEnd){
        name = argName;
        size = argSize;
        start = argStart;
        end = argEnd;
    }


    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setStart(int start){
        this.start = start;
    }
    public void setEnd(int end){
        this.end = end;
    }

    //getters
    public String getName(){
        return name;
    }
    public int getSize(){
        return size;
    }
    public int getStart(){
        return start;
    }
    public int getEnd(){
        return end;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Event)) {
            return false;
        }
        Event other = (Event) obj;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + '(' +
                "size=" + size +
                ", start=" + start +
                ", end=" + end +
                ')';
    }

}
