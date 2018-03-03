package org.gl.procamp.florestry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Product {
    private double price;

    public double countPrice() {
        return getPrice();
    }
}
