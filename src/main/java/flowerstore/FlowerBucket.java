package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();


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
