package org.gl.procamp.florestry;

import org.gl.procamp.florestry.model.accessories.Accessory;
import org.gl.procamp.florestry.model.flowers.Flower;
import org.gl.procamp.florestry.util.ExceptionMessages;

import java.util.List;
import java.util.stream.Collectors;

public class BouquetImpl extends Product implements Bouquet {

    private List<Flower> flowers;
    private List<Accessory> accessories;

    public BouquetImpl(List<Flower> flowers, List<Accessory> accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
        setPrice(countPrice());
    }

    public List<Flower> getFlowersByFreshness() {
        return flowers.stream()
                .sorted((f1, f2) -> f2.getDate().compareTo(f1.getDate()))
                .collect(Collectors.toList());
    }

    public List<Flower> getFlowersByStemLength(double minLength, double maxLength) {
        if (minLength > maxLength) {
            throw new IllegalArgumentException(ExceptionMessages.STEM_LENGTH_EXCEPTION);
        }
        return flowers.stream()
                .filter(f -> f.getStemLength() >= minLength && f.getStemLength() <= maxLength)
                .collect(Collectors.toList());
    }

    @Override
    public double countPrice() {
        return
                flowers.stream().mapToDouble(f -> f.getPrice()).sum()
                +
                accessories.stream().mapToDouble(a -> a.getPrice()).sum();
    }
}
