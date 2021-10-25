package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter @Setter @ToString
public class Flower {
    private double price;
    private double sepalLength;
    private int[] color;
    private  FlowerType flowerType;

    public void setColor(int[] color){
        this.color = Arrays.copyOf(color, color.length);
    }

    //Add constructor with FlowerType
    //FlowerPack
    //FlowerBucket
    public Flower(FlowerType flowerType){
        this.flowerType = flowerType;
    }
}
