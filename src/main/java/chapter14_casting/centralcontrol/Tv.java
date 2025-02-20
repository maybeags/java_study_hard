package chapter14_casting.centralcontrol;

public class Tv implements Power {
    @Override
    public void on() {
        System.out.println("Tv의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("Tv의 전원을 끕니다.");
    }
}
