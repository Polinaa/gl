package org.gl.procamp.florestry;

import org.gl.procamp.florestry.model.flowers.Flower;

import java.util.List;

public interface Bouquet {
    List<Flower> getFlowersByFreshness();
    List<Flower> getFlowersByStemLength(double minLength, double maxLength);
}
