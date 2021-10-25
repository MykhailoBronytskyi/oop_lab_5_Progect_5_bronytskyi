package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {

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
    }

    @Test
    void getPrice() {
        System.out.println(roses);
        assertEquals(100, roses.getPrice());

    }

    @Test
    void getFlower() {
        System.out.println(tulips.getFlower());
        assertEquals(tulip, tulips.getFlower());
    }

    @Test
    void getAmount() {
        System.out.println(chamolines.getAmount());
        assertEquals(30, chamolines.getAmount());
    }
}