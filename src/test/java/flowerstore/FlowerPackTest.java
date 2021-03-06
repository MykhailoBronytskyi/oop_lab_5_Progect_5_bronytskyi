package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {

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
    }

    @Test
    void getPrice() {
        System.out.println(roses);
        assertEquals(100, roses.getPrice());
    }

    @Test
    void getFlower() {
//        ResultSet.getDouble(tulips.getFlower().getSepalLength());
        System.out.println(tulips.toString());
        System.out.println(tulips.getFlower().toString());
        assertEquals(tulip.toString(), tulips.getFlower().toString());
    }

    @Test
    void getAmount() {
        System.out.println(chamolines.getAmount());
        assertEquals(30, chamolines.getAmount());
    }
}