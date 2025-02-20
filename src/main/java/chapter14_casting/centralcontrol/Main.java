package chapter14_casting.centralcontrol;
/*
    20250220 수업 예정 부분
    CentralControl.java 파일을 만들건데,
    Computer.java와
    LED.java 파일을 생성해서 -> Power 인터페이스를 구현 받으세요.
 */
public class Main {
    public static void main(String[] args) {
        // 선언한 각 클래스들의 객체를 생성
        Computer computer1 = new Computer();
        LED led1 = new LED();
        Speaker speaker1 = new Speaker();

        CentralControl centralControl = new CentralControl(new Power[4]);   // 빈Power배열을 생성
        // -> centralControl의 field로 삼았네요.

//        centralControl.deviceArray[0] = computer1;    -> deviceArray가 private이므로 불가능
//        -> 메서드를 통해서 Power의 자식 객체들을 추가해야 함.

        centralControl.addDevice(computer1);
        centralControl.addDevice(led1);
        centralControl.addDevice(speaker1);
    }
}
