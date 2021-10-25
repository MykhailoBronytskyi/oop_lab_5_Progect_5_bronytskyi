package flowerstore;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(10);
        flower.setSepalLength(7);
        flower.setColor(new int[] {1,2,3});

    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flower.getFlowerType());
    }

    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(7, flower.getSepalLength());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        assertArrayEquals(new int[] {1,2,3}, flower.getColor());
    }
}