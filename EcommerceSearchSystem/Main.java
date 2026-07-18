public class Main {

    public static void main(String[] args) {

        Product[] products = {

            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mouse", "Electronics"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Shoes", "Fashion"),
            new Product(105, "Watch", "Accessories")

        };

        System.out.println("Linear Search:");

        Product result1 = LinearSearch.search(products, 104);

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product not found");

        System.out.println();

        System.out.println("Binary Search:");

        Product result2 = BinarySearch.search(products, 104);

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product not found");
    }
}
