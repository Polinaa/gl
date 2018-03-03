package org.gl.procamp.florestry;

import junit.framework.Assert;
import org.gl.procamp.florestry.model.accessories.Ribbon;
import org.gl.procamp.florestry.model.accessories.WrappingPaper;
import org.gl.procamp.florestry.model.flowers.Chamomile;
import org.gl.procamp.florestry.model.flowers.Flower;
import org.gl.procamp.florestry.model.flowers.Rose;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

public class BouquetTest {

    private Bouquet bouquet;

    @Mock
    private Rose mockRose;

    @Mock
    private Chamomile mockChamomile;

    @Mock
    private Ribbon mockRibbon;

    @Mock
    WrappingPaper mockWrappingPaper;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Before
    public void createBouquet() {
        when(mockRose.getStemLength()).thenReturn(2.2);
        when(mockChamomile.getStemLength()).thenReturn(4.2);
        when(mockRose.getDate()).thenReturn(LocalDate.of(2018, 1, 4));
        when(mockChamomile.getDate()).thenReturn(LocalDate.of(2018, 3, 1));
        bouquet = new BouquetImpl(Arrays.asList(mockRose, mockChamomile), Arrays.asList(mockRibbon, mockWrappingPaper));
    }

    @Test
    public void findByStemLengthTest() {
        List<Flower> flowers = bouquet.getFlowersByStemLength(1, 3);
        Assert.assertEquals(1, flowers.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void findByStemLengthNegativeTest() {
        bouquet.getFlowersByStemLength(4, 3);
    }


    @Test
    public void sortByFreshnessTest() {
        List<Flower> flowers = bouquet.getFlowersByFreshness();
        Assert.assertEquals(flowers.get(0), mockChamomile);
    }
}
