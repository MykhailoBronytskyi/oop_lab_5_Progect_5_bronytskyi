package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {

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
    }

    @Test
    void getPrice() {
        assertEquals(100, bucket.getPrice());
    }

    @Test
    void addFlowerPack() {
        assertEquals(roses.toString(), bucket.getFlowerPacks().get(0).toString());
    }

    @Test
    void length() {
        bucket.addFlowerPack(tulips);
        bucket.addFlowerPack(chamolines);
        System.out.println();
        assertEquals(3, bucket.getFlowerPacks().size());
    }

    @Test
    void getPriceBig() {
        bucket.addFlowerPack(tulips);
        bucket.addFlowerPack(chamolines);
        assertEquals(440, bucket.getPrice());
    }
}