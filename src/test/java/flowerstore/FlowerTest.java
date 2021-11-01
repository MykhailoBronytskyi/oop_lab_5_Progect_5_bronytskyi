package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(10);
        flower.setSepalLength(7);
        flower.setColor(new int[] {1,2,3});

    }

    @Test
    void getPrice() {
        System.out.println(flower.getSepalLength());
        assertEquals(10, flower.getPrice());
    }

    @Test
    void getFlowerType() {
        System.out.println(flower.getFlowerType());
        assertEquals(FlowerType.CHAMOMILE, flower.getFlowerType());
    }

    @Test
    void getSepalLength() {
        assertEquals(7, flower.getSepalLength());
    }

    @Test
    void getColor() {
        assertArrayEquals(new int[] {1,2,3}, flower.getColor());
    }

    @Test
    void copy(){
        Flower second_flower = flower.copy();
        System.out.println(second_flower+"\n"+flower);
    }
}