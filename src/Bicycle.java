public class Bicycle extends Transport implements TransportService{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }
}
