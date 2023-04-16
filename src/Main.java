public class Main {
    public static void getRetreat(){
        System.out.println();
    }
    public static void main(String[] args) {
        Car car = new Car("Car1",4);
        Car car2 = new Car("Car2",4);

        Truck truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);

        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);


        ServiceStation station = new ServiceStation();
        getRetreat();
        station.check(car);
        getRetreat();
        station.check(car2);
        getRetreat();

        station.check(truck);
        getRetreat();
        station.check(truck2);
        getRetreat();
        station.check(bicycle);
        getRetreat();
        station.check(bicycle2);
        getRetreat();
        getRetreat();
    }
}