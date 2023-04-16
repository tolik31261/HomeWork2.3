public abstract class Transport {
    private final int wheelsCount;
    private final String modelName;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
    }
    public void checkEngine() {
    }
    public void checkTrailer() {

    }

}
