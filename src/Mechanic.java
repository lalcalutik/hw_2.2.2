public class Mechanic {

    public void checkWheelable(WheeledTransport wheeledTransport) {
        System.out.println("Обслуживаем " + wheeledTransport.getModelName());
        for (int i = 0; i < wheeledTransport.getWheelsCount(); i++) {
            wheeledTransport.updateTyre();
        }
    }

    public void checkEnginable(Enginable enginable) {
        enginable.checkEngine();
    }

    public void checkTrailerable(Trailerable trailerable) {
        trailerable.checkTrailer();
    }


}