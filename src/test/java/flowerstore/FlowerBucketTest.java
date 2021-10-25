package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {

    private FlowerBucket bucket = new FlowerBucket();

    private Flower rose = new Flower(FlowerType.ROSE);
    private Flower tulip = new Flower(FlowerType.TULIP);
    private Flower chamoline = new Flower(FlowerType.CHAMOMILE);

    private FlowerPack roses = new FlowerPack(rose, 10);
    private FlowerPack tulips = new FlowerPack(tulip, 50);
    private FlowerPack chamolines = new FlowerPack(chamoline, 30);

    @BeforeEach
    void setUp() {
        rose.setPrice(10);
        tulip.setPrice(5);
        chamoline.setPrice(3);

        bucket.addFlowerPack(roses);
    }

    @Test
    void getPrice() {
        assertEquals(0, bucket.getPrice());
    }

    @Test
    void addFlowerPack() {
        assertEquals(roses, bucket.flowerPacks.get(0));
    }
    @Test
    void length() {
        bucket.addFlowerPack(tulips);
        bucket.addFlowerPack(chamolines);
        System.out.println();
        assertEquals(1, bucket.flowerPacks.size());
    }

    @Test
    void getPriceBig() {
        bucket.addFlowerPack(tulips);
        bucket.addFlowerPack(chamolines);
        assertEquals(440, bucket.getPrice());
    }
}