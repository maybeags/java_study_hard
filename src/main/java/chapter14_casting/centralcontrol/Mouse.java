package chapter14_casting.centralcontrol;

public class Mouse implements Power{
    @Override
    public void on() {
        System.out.println("마우스의 전원이 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("마우스의 전원이 꺼졌습니다.");
    }
}
