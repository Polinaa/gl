package org.gl.procamp.florestry.model.flowers;

import lombok.Getter;
import lombok.Setter;
import org.gl.procamp.florestry.Product;

import java.time.LocalDate;

@Getter
@Setter
public abstract class Flower extends Product {

    private LocalDate date;
    private double stemLength;

    public Flower(double price, LocalDate date, double stemLength) {
        super(price);
        this.date = date;
        this.stemLength = stemLength;
    }
}
