public class MyAirplane {
    public static void main(String[] args) {
        Airplane.AirplaneType type = new Airplane.AirplaneType();
        Airplane airplane1 = new Airplane("737-800", 39.48, 35.79, 26035, 79015, 5449);
        airplane1.printTechnicalCharacteristics();
        type.printType();

        System.out.println("");

        Airplane airplane2 = new Airplane("737 MAX 7", 35.50, 35.90, 25816, 80285, 7130);
        airplane2.printTechnicalCharacteristics();
        type.printType();
    }
}
