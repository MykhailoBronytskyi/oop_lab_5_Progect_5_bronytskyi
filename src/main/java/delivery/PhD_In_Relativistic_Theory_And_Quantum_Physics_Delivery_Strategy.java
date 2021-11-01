package delivery;

import flowerstore.Item;

import java.util.List;

public class PhD_In_Relativistic_Theory_And_Quantum_Physics_Delivery_Strategy implements Delivery{
    @Override
    public String deliver(List<Item> items) {
        System.out.println("The items will be delivered by post teleportation or antimatter warpdrive\n" +
                "You should know about thermonuclear danger of those methods of delivery");
        return "The items will be delivered by post teleportation or antimatter warpdrive\n" +
                "You should know about thermonuclear danger of those methods of delivery";
    }
}
