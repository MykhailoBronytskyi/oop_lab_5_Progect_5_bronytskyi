package delivery;

import flowerstore.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{

    @Override
    public String deliver(List<Item> items) {
        System.out.println("The items will be delivered by DHL Express");
        return "The items will be delivered by DHL Express";
    }
}
