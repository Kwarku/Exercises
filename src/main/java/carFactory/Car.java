package carFactory;

public abstract class Car implements Factory {
    private final String brandName;
    private String model;
    private long vin;
    private Engine engine;


    public Car(String brandName) {
        this.brandName = brandName;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setVin(long vin) {
        this.vin = vin;
    }

    public long getVin() {
        return vin;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public void modifyCar(String model, long vin, Engine engine) {
        this.model = model;
        this.vin = vin;
        this.engine = engine;
    }
}
