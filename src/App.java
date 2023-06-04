import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(1, "Lays", "чипсы", 59);
        item1.setPrice(98);

        Product item2 = new Bottle(2, "Cola", "Water", 70, 500);
        Product item3 = new HotDrink(0, null, null, 0)

        System.out.println(item1.toString());
        System.out.println(item2.toString());
        System.out.println(item3.toString());
    }
}
