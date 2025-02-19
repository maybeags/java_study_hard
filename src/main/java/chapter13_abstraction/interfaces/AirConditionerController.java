package chapter13_abstraction.interfaces;

public class AirConditionerController {
    // field 선언
    private PowerButton powerButton;
    private TemparatureDownButton temparatureDownButton;
    private TemparatureUpButton temparatureUpButton;
    // 생성자

    public AirConditionerController(PowerButton powerButton, TemparatureDownButton temparatureDownButton, TemparatureUpButton temparatureUpButton) {
        this.powerButton = powerButton;
        this.temparatureDownButton = temparatureDownButton;
        this.temparatureUpButton = temparatureUpButton;
    }

    // 메서드 정의
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedTemparatureDownButton() {
        temparatureDownButton.onPressed();
    }

    public void onDownTemparatureDownButton() {
        temparatureDownButton.onDown();
    }

    public void onPressedTemparatureUpButton() {
        temparatureUpButton.onPressed();
    }

    public void onUpTemparatureUpButton() {
        temparatureUpButton.onUp();
    }
}
