package lesson_9;

public class Payment {

    public void calculateTheTotalCost(Product[] products) {
        System.out.println("Список продуктов:");
        for (Product prod : products) {
            System.out.println(prod.toString());
        }
        int totalCost = 0;
        for (Product prod : products) {
            totalCost += prod.getPrice();
        }
        System.out.println("Итоговая стоимость: " + totalCost);
    }

    public class Product {

        private String name;
        private int price;

        public int getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
