public class ServiceStation {
    public void check(TransportService vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());

            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }

            vehicle.checkEngine();
            vehicle.checkTrailer();
        }
    }
}
