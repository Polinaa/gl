package org.gl.procamp.florestry.model.accessories;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ribbon extends org.gl.procamp.florestry.model.accessories.Accessory {

    private double length;

    public Ribbon(double price, double length) {
        super(price);
        this.length = length;
    }

    @Override
    public double countPrice(){
        return length * getPrice();
    }
}
