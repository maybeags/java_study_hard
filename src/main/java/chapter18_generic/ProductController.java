package chapter18_generic;

public class ProductController {
    public static void main(String[] args) {
        Product<String> product1 = new Product<>("Laptop", "Intel i7, 16GB RAM, 512GB SSD");
        Product<Double> product2 = new Product<>("Smartphone", 799.99);
        Product<Boolean> product3 = new Product<>("Available", true);

        // @AllAgsConstructor를 이용해서 전부 한꺼번에 값을 넣는 방법
        // @Setter 사용해서 집어넣어도 될거고
        // @ToString

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
//        Product(productName=Laptop, productInfo=Intel i7, 16GB RAM, 512GB SSD)
//        Product(productName=Smartphone, productInfo=799.99)
//        Product(productName=Available, productInfo=true)
    }
}
