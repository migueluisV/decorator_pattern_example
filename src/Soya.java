public class Soya extends CondimentDecorator {
    public Soya(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescripcion() {
        return beverage.getDescripcion() + ", Soya";
    }

    public double costo() {
        return beverage.costo() + 10.99;
    }
}
