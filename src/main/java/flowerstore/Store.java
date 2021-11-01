package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class Store {

    private FlowerBucket flowerBucket;

    public Store(FlowerBucket newflowerBucket){
        this.flowerBucket = newflowerBucket;
    }


    public boolean Search(FlowerType whatFlower, int how_many){

        List<FlowerPack> flowerPacks = flowerBucket.getFlowerPacks();
        for (int i = 0; i < flowerPacks.size(); i++) {

            FlowerPack flowerPack = flowerPacks.get(i);
            Flower flower = flowerPack.getFlower();
            FlowerType flowerType = flower.getFlowerType();

            if (flowerType.equals(whatFlower)){
                System.out.println("We have your flowers");

                int flowersAmount = flowerPack.getAmount();

                if (flowersAmount >= how_many){
                    System.out.println("There are " + flowersAmount + " " + flowerType
                                                        + " for your " + how_many + "\n");
                    return true;
                }
                System.out.println("But not enough : " + flowersAmount + " " + flowerType
                                                        + " for your " + how_many + "\n");
            }
        }
        System.out.println("There are no flowers that you want\n");
        return false;
    }



}
