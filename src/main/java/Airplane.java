public class Airplane {
    private static final String AIRPLANE_NAME = "Boeing";
    private String airplaneModel;
    private double airplaneLength;
    private double airplaneWingspan;
    private int airplaneFuelCapacity;
    private int airplaneTakeoffWeight;
    private int airplaneRange;

    Airplane(String airplaneModel, double airplaneLength, double airplaneWingspan, int airplaneFuelCapacity, int airplaneTakeoffWeight, int airplaneRange) {
        this.airplaneModel = airplaneModel;
        this.airplaneLength = airplaneLength;
        this.airplaneWingspan = airplaneWingspan;
        this.airplaneFuelCapacity = airplaneFuelCapacity;
        this.airplaneTakeoffWeight = airplaneTakeoffWeight;
        this.airplaneRange = airplaneRange;
    }

    public String getAirplaneModel() {
        return airplaneModel;
    }

    public void setAirplaneModel(String airplaneModel) {
        this.airplaneModel = airplaneModel;
    }

    public double getAirplaneLength() {
        return airplaneLength;
    }

    public void setAirplaneLength(double airplaneLength) {
        this.airplaneLength = airplaneLength;
    }

    public double getAirplaneWingspan() {
        return airplaneWingspan;
    }

    public void setAirplaneWingspan(double airplaneWingspan) {
        this.airplaneWingspan = airplaneWingspan;
    }

    public int getAirplaneFuelCapacity() {
        return airplaneFuelCapacity;
    }

    public void setAirplaneFuelCapacity(int airplaneFuelCapacity) {
        this.airplaneFuelCapacity = airplaneFuelCapacity;
    }

    public int getAirplaneTakeoffWeight() {
        return airplaneTakeoffWeight;
    }

    public void setAirplaneTakeoffWeight(int airplaneTakeoffWeight) {
        this.airplaneTakeoffWeight = airplaneTakeoffWeight;
    }

    public int getAirplaneRange() {
        return airplaneRange;
    }

    public void setAirplaneRange(int airplaneRange) {
        this.airplaneRange = airplaneRange;
    }

    static class AirplaneType {
        private static final String type = "Passenger";

        public static void printAirplaneType() {
            System.out.println("Airplane type: " + type);
        }
    }

    public void printTechnicalCharacteristics() {
        System.out.println(AIRPLANE_NAME + " " + getAirplaneModel() + " technical characteristics:");
        System.out.println("Airplane length: " + getAirplaneLength() + " m");
        System.out.println("Airplane wingspan: " + getAirplaneWingspan() + " m");
        System.out.println("Airplane fuel capacity: " + getAirplaneFuelCapacity() + " L");
        System.out.println("Airplane takeoff weight: " + getAirplaneTakeoffWeight() + " kg");
        System.out.println("Airplane range: " + getAirplaneRange() + " km");
    }
}
