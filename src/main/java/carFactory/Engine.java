package carFactory;

public enum Engine {
    DIESEL("diesel"), GASOLINE("gas"), LPG("lpg"), HYBRID("hybrid"), ELECTRIC("electric"), DIFFERENT(" ");

    String name;

    Engine(String name) {
        this.name = name;
    }

    public static Engine getEngine(String name) {
        for (Engine engine : Engine.values()) {
            if (engine.equals(name)) {
                return engine;
            }
        }
        return DIFFERENT;
    }

}
