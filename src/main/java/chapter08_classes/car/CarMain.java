package chapter08_classes.car;
/*
    1. Car의 인스턴스인 myCar 객체를 생성하세요.
    2. color에 "빨강" 대입하고, 콘솔창에 출력하세요.
    3. speed에 100을 대입하고, 콘솔창에 출력하세요.
    4. yourCar 객체를 생성하세요.
    5. color에 "노랑" 대입하고, speed에 140을 대입하고, 둘 다 출력하세요.
    6. myCar는 drive() 메서드 호출, yourCar는 stop() 메서드를 호출하세요.
 */
public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car yourCar = new Car();

        myCar.color = "빨강";
        yourCar.color = "노랑";
        myCar.speed = 100;
        yourCar.speed = 140;

        System.out.println(myCar.color);
        System.out.println(yourCar.color);
        System.out.println(myCar.speed);
        System.out.println(yourCar.speed);

        myCar.drive();
        yourCar.stop();

        /*
            constructor 패키지
            Constructor.java
            ConstructorMain.java

         */
    }
}
