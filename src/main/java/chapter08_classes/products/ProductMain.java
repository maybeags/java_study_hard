package chapter08_classes.products;

public class ProductMain {
    public static void main(String[] args) {
        // 객체 생성 파트
        Product product1 = new Product();
        Product product2 = new Product(987654);
        Product product3 = new Product("USB-C 케이블");
        Product product4 = new Product(951753, "GFlip6");

        // 속성 대입 파트
        product1.productNum = 123456;
        product1.productName = "LG엘패드";

        product2.productName = "다이소충전기";

        product3.productNum = 159357;

        // 메서드 호출 파트
        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();
    }
}
