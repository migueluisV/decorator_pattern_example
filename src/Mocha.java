public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescripcion() {
        return beverage.getDescripcion() + ", Mocha";
    }

    public double costo() {
        return beverage.costo() + 20.55;
    }
}
