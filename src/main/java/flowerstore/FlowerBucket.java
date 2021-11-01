package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class FlowerBucket extends Item{

    @Getter @Setter
    private List<FlowerPack> flowerPacks = new ArrayList<>();


    public void addFlowerPack(FlowerPack flowerpack){
        flowerPacks.add(flowerpack.copy());
    }

    public double getPrice() {

        double price = 0;
        for (FlowerPack pack : flowerPacks) {
            price += pack.getPrice();
        }
        return price;
    }


    public FlowerBucket copy(){

        FlowerBucket new_bucket = new FlowerBucket();

        for (FlowerPack pack: flowerPacks){
            new_bucket.addFlowerPack(pack);
        }
        return new_bucket;
    }


    public int searchFlower(FlowerType flowerType){
        int flowerPacksSize = flowerPacks.size();

        if (flowerPacksSize == 0){
            System.out.println("Flower not found in Backed");
            return -1;
        }
        for (int idx= 0; idx < flowerPacksSize; idx++){
            if (flowerPacks.get(idx).equals(flowerType)){
                return idx;
            }
        }
        System.out.println("Flower not found in Backed");
        return -1;
    }

    @Override
    public double getDescription() {
        return 0;
    }

}
