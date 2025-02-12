package chapter05_condition;

import java.util.Scanner;

public class Condition04BmiUpgraded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height = 0;
        double weight = 0;
        int bmi = 0;
        String grade = "";      // 이번에 추가한 부분

        System.out.print("당신의 키(cm)를 입력하세요 >>> ");
        height = scanner.nextDouble();
        height = height / 100;

        System.out.print("당신의 몸무게(kg)를 입력하세요 >>> ");
        weight = scanner.nextDouble();

        bmi = (int)(weight / (height*height));

        if (bmi < 0) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            if (bmi > 18) {
                grade = "정상체중";
            } else if (bmi > 23) {
                grade = "과체중";
            } else if (bmi > 25) {
                grade = "비만";
            } else {
                grade = "저체중";
            }
        }

        System.out.println("당신의 bmi지수는 " + bmi + "이고, " + grade + "입니다.");

        // String grade를 선언했을 때 생겨나는 문제점 중에 하나가 다음과 같은 상황입니다.
        // bmi가 음수가 돼서 grade에 아무런 값을 대입하지 못한다고 하더라도
        // 37라인에 있는 sout문장이 실행된다는 점.

        /*
                음수면 잘못입력되었습니다.가 출력될 것.
                18 초과면 정상체중
                23 초과면 과체중
                25 초과면 비만

                실행 예
                당신의 bmi 지수는 23이고, 정상체중입니다.
         */
    }
}
