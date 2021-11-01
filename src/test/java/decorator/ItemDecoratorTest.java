package decorator;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemDecoratorTest {
    Item item;

    @BeforeEach
    void setUp() {
        Flower rose = new Flower(FlowerType.ROSE);
        rose.setPrice(10);
        item = new ItemDecorator(rose);
    }

    @Test
    void getPrice() {
        assertEquals(item.getPrice(), 10);
    }

    @Test
    void getDescription() {
        assertEquals(item.getDescription(),0);
    }
}