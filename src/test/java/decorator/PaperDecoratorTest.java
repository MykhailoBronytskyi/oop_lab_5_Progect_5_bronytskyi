package decorator;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {

    Item item;

    private FlowerBucket bucket = new FlowerBucket();

    private Flower rose;
    private Flower tulip;
    private Flower chamoline;

    private FlowerPack roses;
    private FlowerPack tulips;
    private FlowerPack chamolines;

    @BeforeEach
    void setUp() {
        rose = new Flower(FlowerType.ROSE);
        tulip = new Flower(FlowerType.TULIP);
        chamoline = new Flower(FlowerType.CHAMOMILE);

        rose.setPrice(10);
        tulip.setPrice(5);
        chamoline.setPrice(3);

        roses = new FlowerPack(rose, 10);
        tulips = new FlowerPack(tulip, 50);
        chamolines = new FlowerPack(chamoline, 30);

        bucket.addFlowerPack(roses);
        bucket.addFlowerPack(tulips);
        bucket.addFlowerPack(chamolines);

        item = new PaperDecorator(bucket);
    }


    @Test
    void getPrice() {
        System.out.println(item.getPrice());
        assertEquals(item.getPrice(), 453);
    }
}