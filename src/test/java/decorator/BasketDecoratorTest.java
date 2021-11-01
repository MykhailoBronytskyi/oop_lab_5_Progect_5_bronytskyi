package decorator;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {

    Item item;

    @BeforeEach
    void setUp() {
        Flower rose = new Flower(FlowerType.ROSE);
        rose.setPrice(10);
        item = new BasketDecorator(rose);
    }

    @Test
    void getPrice() {
        assertEquals(item.getPrice(), 14);
    }
}