public class CremaBatida extends CondimentDecorator {
    public CremaBatida(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescripcion() {
        return beverage.getDescripcion() + ", Crema batida";
    }

    public double costo() {
        return beverage.costo() + 15.99;
    }
}
