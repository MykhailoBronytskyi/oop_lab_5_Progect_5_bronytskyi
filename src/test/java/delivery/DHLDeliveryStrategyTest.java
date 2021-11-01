package delivery;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {

    private DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
    private List<Item> items = new ArrayList<>();


    @BeforeEach
    void setUp() {
        Flower flower = new Flower(FlowerType.TULIP);
        flower.setPrice(15);

        FlowerPack pack = new FlowerPack(flower , 10);

        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(pack);



        items.add(flower);
        items.add(flowerBucket);
    }

    @Test
    void deliver() {
        assertEquals(delivery.deliver(items),"The items will be delivered by DHL Express");
    }
}