package carFactory;

public class FiatGroup extends Car {


    public FiatGroup(String model, long vin, Engine engine) {
        super(FiatGroup.class.getSimpleName().substring(0, FiatGroup.class.getSimpleName().length() - 5));
        setModel(model);
        setVin(vin);
        setEngine(engine);

    }
}
