package carFactory;

public class ToytoaGroup extends Car {

    public ToytoaGroup(String model, long vin, Engine engine) {
        super(ToytoaGroup.class.getSimpleName().substring(0, ToytoaGroup.class.getSimpleName().length() - 5));
        setModel(model);

        setVin(vin);
        setEngine(engine);
    }
}
