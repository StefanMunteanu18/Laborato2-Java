/**
 * Clasa LectureHall descrie un laborator, clasa mostenita din clasa Room
 */
public class LectureHall extends Room{
    private boolean roomHasProjector;

    /**
     * Constructor cu parametri de initializat
     * @param name numele laboratorului
     * @param capacity capacitatea
     */

    public LectureHall(String name, int capacity) {
        this.setName(name);
        this.setCapacity(capacity);
    }

    public boolean isRoomHasProjector() {
        return roomHasProjector;
    }

    public void setRoomHasProjector(boolean roomHasProjector) {
        this.roomHasProjector = roomHasProjector;
    }
}
