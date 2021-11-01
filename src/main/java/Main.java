import decorator.PaperDecorator;
import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.FlowerType;
import flowerstore.Item;
import payment.Payment;



public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];

        int[] color = {127, 0, 0};

        for (int i = 0; i < flowers.length; i++){
            flowers[i] = new Flower(FlowerType.ROSE);
            flowers[i].setColor(color);
            flowers[i].setPrice(10);
            System.out.println(flowers[i]);

        }
//        color = new int[]{0,127,0};
        color[1] = 127;

        for (int i = 0; i < flowers.length; i++){
            System.out.println(flowers[i]);
        }

        System.out.println("\n\n\n");

        Item bucket = new FlowerBucket();
        bucket = new PaperDecorator(bucket);

    }
}
