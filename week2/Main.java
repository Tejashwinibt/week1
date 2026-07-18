public class Main {

    public static void main(String[] args) {

        Order[] orders = {

            new Order(101, "Alice", 4500),
            new Order(102, "Bob", 2500),
            new Order(103, "Charlie", 7000),
            new Order(104, "David", 3200),
            new Order(105, "Eva", 5600)

        };

        System.out.println("Before Sorting:");

        for (Order order : orders)
            System.out.println(order);

        BubbleSort.sort(orders);

        System.out.println("\nAfter Bubble Sort:");

        for (Order order : orders)
            System.out.println(order);

        Order[] orders2 = {

            new Order(101, "Alice", 4500),
            new Order(102, "Bob", 2500),
            new Order(103, "Charlie", 7000),
            new Order(104, "David", 3200),
            new Order(105, "Eva", 5600)

        };

        QuickSort.quickSort(orders2, 0, orders2.length - 1);

        System.out.println("\nAfter Quick Sort:");

        for (Order order : orders2)
            System.out.println(order);
    }
}
