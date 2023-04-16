public class Car extends Transport implements TransportService{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку у машины");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }
}

