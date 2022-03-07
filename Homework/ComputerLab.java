/**
 * Clasa ComputerLab descrie un laborator, clasa mostenita din clasa Room
 */

public class ComputerLab extends Room{
    private String operatingSystem;

    /**
     * Constructor cu parametri de initializat
     * @param name numele laboratorului
     * @param capacity capacitatea
     */
    public ComputerLab(String name, int capacity) {
        this.setName(name);
        this.setCapacity(capacity);
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
