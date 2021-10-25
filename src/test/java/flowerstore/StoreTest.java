package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private FlowerBucket bucket = new FlowerBucket();
    private Store store = new Store(bucket);

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
    void search() {
        assertEquals(true, store.Search(FlowerType.ROSE, 10));
        assertNotEquals(true, store.Search(FlowerType.ROSE, 20));

        assertNotEquals(true, store.Search(FlowerType.TULIP, 20));

        store.getFlowerBucket().addFlowerPack(tulips);
        assertEquals(true, store.Search(FlowerType.TULIP, 20));

        store.getFlowerBucket().addFlowerPack(chamolines);
        assertEquals(true, store.Search(FlowerType.CHAMOMILE, 20));
        System.out.println(store);
    }
}