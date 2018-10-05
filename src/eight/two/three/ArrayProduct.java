package eight.two.three;
import java.util.Scanner;

public class ArrayProduct {
    public static void main(String[] args) {

        Product[] products = new Product[3];

        for (int i = 0; i < products.length; i++) {
            Product p = createProduct(); {
                if(contains(products, p)) {
                    i--; //cofniecie o jeden krok
                } else {
                    products[i] = p;
                }
            }
        }
    }

    private static Product createProduct() {
        Scanner scan = new Scanner(System.in);
        System.out.println("nazwa");
        String name = scan.nextLine();
        System.out.println("cena");
        double price = scan.nextDouble();
        scan.nextLine();

        Product prod = new Product(name, price);
        return prod;
    }

    private static boolean contains(Product[] products, Product product) {
        for (Product p : products) {
            if (product.equals(p))
                return true;
        }
        return false;
    }
}

//1. klasa produkt
//2. tworzymy tablice
//3. tworzymy obiekt produkt
//4. sprawdzamy czy obiekt istnieje
//4.1 tak - wracamy do punktu 3
//4.2 nie - wstawiamy do tablicy, powrot od pkt 3

