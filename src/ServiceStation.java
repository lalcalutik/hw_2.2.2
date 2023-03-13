public class ServiceStation {
    public void check(Car car) {
            Mechanic mechanic = new Mechanic();
            mechanic.checkWheelable(car);
            mechanic.checkEnginable(car);
    }
    public void check(Bicycle bicycle) {
            Mechanic mechanic = new Mechanic();
            mechanic.checkWheelable(bicycle);
        }
    public void check(Truck truck) {
            Mechanic mechanic = new Mechanic();
            mechanic.checkWheelable(truck);
            mechanic.checkEnginable(truck);
            mechanic.checkTrailerable(truck);
    }

    private void checkWheels(WheeledTransport wheeledTransport){
        System.out.println("Обслуживаем " + wheeledTransport.getModelName());
        for (int i = 0; i < wheeledTransport.getWheelsCount(); i++) {
            wheeledTransport.updateTyre();
        }
    }
    private void checkEngine(Enginable enginable){
        enginable.checkEngine();

    }
}
