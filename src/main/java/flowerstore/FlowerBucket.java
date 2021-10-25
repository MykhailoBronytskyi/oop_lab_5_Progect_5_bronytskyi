package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class FlowerBucket {
    List<FlowerPack> flowerPacks = new ArrayList<>();


    public void addFlowerPack(FlowerPack flowerpack){
        flowerPacks.add(flowerpack);
    }

    public double getPrice() {

        double price = 0;
        for (FlowerPack pack : flowerPacks) {
            price += pack.getPrice();
        }
        return price;
    }

}
