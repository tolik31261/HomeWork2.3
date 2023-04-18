public class ServiceStation {

    public void checkAll(TransportService[] transportServices) {
        for (TransportService transportService : transportServices) {
            transportService.service();
        }
    }
    public void check(TransportService transportService) {
        transportService.service();

    }
}
