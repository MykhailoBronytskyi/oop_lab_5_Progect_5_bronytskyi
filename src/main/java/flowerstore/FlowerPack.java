package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower.copy();
        this.amount = amount;

    }
    public double getPrice(){
        return flower.getPrice() * amount;
    }

    public FlowerPack copy(){
        FlowerPack new_pack = new FlowerPack(flower, amount);
        return new_pack;
    }
}
