public class Main {
    public static void getRetreat(){
        System.out.println();
    }
    public static void main(String[] args) {
        Transport car = new Car("Car1",4);
        Transport car2 = new Car("Car2",4);

        Transport truck = new Truck("truck1",6);
        Transport truck2 = new Truck("truck2",8);

        Transport bicycle = new Bicycle("bicycle1",2);
        Transport bicycle2 = new Bicycle("bicycle2",2);

        Transport transports[] = {car, car2, truck, truck2, bicycle, bicycle2};


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
    }
}