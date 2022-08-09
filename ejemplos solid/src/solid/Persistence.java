package solid;

interface Persistence {

    void save(Product product, PaymentType paymentType);

    public static class Product {

        public Product() {
        }
    }

}