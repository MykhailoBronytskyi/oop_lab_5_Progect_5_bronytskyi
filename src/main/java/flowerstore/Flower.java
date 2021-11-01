package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter @Setter @ToString
public class Flower extends Item{
    private double price = 0;
    private double sepalLength = 0;
    private int[] color;
    private FlowerType flowerType;

    public void setColor(int[] color){
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flowerType){
        this.flowerType = flowerType;
    }

    public Flower copy(){

        Flower flower_copy = new Flower(flowerType);
        flower_copy.setPrice(price);
        flower_copy.setSepalLength(sepalLength);

        if (color != null){
            flower_copy.setColor(color);
        }
        return flower_copy;
    }

    @Override
    public double getDescription() {
        return 0;
    }
}
