package chapter06_loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        /*
            n에 숫자를 입력하여 몇 번 반복할지 결정하고
            1부터 n까지 표시하는 반복문을 작성하시오.
         */

        // 1. Scanner import
        Scanner scanner = new Scanner(System.in);
        // 2. 사용할 변수 선언
        int n = 0;


        System.out.print("1부터 얼마까지 숫자를 표기하시겠습니까? >>> ");
        n = scanner.nextInt();

        // for 반복문을 작성하여 완성하시오.
        /*
            실행 예
            1 2 3 4 5 ... n

            1부터 n 까지의 합 = xx
         */
        // i = 0부터 시작
        int sum = 0;
        for(int i = 0 ; i < n ; i++) {
            System.out.print(i+1 + " ");
            //제가 의도한 답
//            sum += i+1;
            // 수강생분들의 기발한 답
            sum += i;
        }
        System.out.println();
        System.out.println("강사가 의도한 1부터 n까지의 합 : " + sum);
        System.out.println("수강생분이 작성한 기발한 1부터 n까지의 합 : " + (sum+n));

        // i = 1부터 시작 -> 시작값 뿐만 아니라 종료값도 수정해야 함.
//        for(int i = 1 ; i < n + 1 ; i++) {
//            System.out.println(i);
//        }

    }
}
