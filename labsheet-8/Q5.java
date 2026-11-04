class ProductPair5<T, U> {
    T productId;
    U productPrice;

    ProductPair5(T productId, U productPrice) {
        this.productId = productId;
        this.productPrice = productPrice;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Price: " + productPrice);
    }

    public static void main(String[] args) {
        ProductPair5<Integer, Double> p1 =
            new ProductPair5<>(101, 250.50);

        ProductPair5<Integer, Double> p2 =
            new ProductPair5<>(102, 450.75);

        ProductPair5<Integer, Double> p3 =
            new ProductPair5<>(103, 600.00);

        p1.display();
        p2.display();
        p3.display();
    }
}
