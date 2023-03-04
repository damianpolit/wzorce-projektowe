public class FactoryMethodExample {

    public static void main(String[] args) {
        Creator creator = new CreatorA();
        Product product = creator.factoryMethod();
        product.doSomething();
    }

    // Abstract product class
    public abstract static class Product {
        public abstract void doSomething();
    }

    // Concrete product class A
    public static class ProductA extends Product {
        public void doSomething() {
            System.out.println("ProductA created");
        }
    }

    // Abstract creator class
    public abstract static class Creator {
        public abstract Product factoryMethod();
    }

    // Concrete creator class A
    public static class CreatorA extends Creator {
        public Product factoryMethod() {
            return new ProductA();
        }
    }
}
