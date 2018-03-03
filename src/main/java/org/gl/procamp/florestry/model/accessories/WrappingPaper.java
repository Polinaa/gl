package org.gl.procamp.florestry.model.accessories;

public class WrappingPaper extends org.gl.procamp.florestry.model.accessories.Accessory {

    private double length;

    public WrappingPaper(double price, double length) {
        super(price);
        this.length = length;
    }

    @Override
    public double countPrice(){
        return length * getPrice();
    }
}
