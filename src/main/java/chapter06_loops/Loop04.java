package chapter06_loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        /*
            별찍기를 통한 for 문 구조 학습
            *                           i = 0이고, j = 0일 때 별이 하나만 찍혀야 함
            **                          i = 1이고, j = 0, 1일 때, 별이 찍혀야 함
            ***                         i = 2, j = 0, 1, 2
            ****                        i = 3, j = 0, 1, 2, 3
            *****                       i = 4, j = 0, 1, 2, 3, 4
            i의 값이 바뀔 때 마다 enter(개행)가 이루어져야 함.
         */

//        for ( int i = 0 ; i < 6 ; i++ ) {
//            System.out.println();
//            for (int j = 0 ; j < i ; j++ ) {
//                System.out.print("*");
//            }
//        }

        // 별이 5줄 찍히는 예시
//        for ( int i = 0 ; i < 5 ; i++ ) {
//            for (int j = 0 ; j < i + 1 ; j++ ) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
            숫자를 입력 받아 그 줄 수 만큼의 별찍기가 이루어질 수 있도록 작성하시오.

            실행 예
            숫자를 입력하세요 >>> 3
            *
            **
            ***
         */
        // 숫자 입력 받아야 하니까 Scanner
//        Scanner scanner = new Scanner(System.in);
//        int row = 0;
//        System.out.print("숫자를 입력하세요 >>> ");
//        row = scanner.nextInt();

        // 이제 반복문 작성하세요.
//        for ( int i = 0 ; i < row ; i++ ) {             // 개행 횟수
//            for (int j = 0 ; j < i + 1 ; j++ ) {        // 별이 어떻게 찍히냐
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
                *****
                ****
                ***
                **
                *
         */
//        for (int i = 5 ; i > 0 ; i-- ) {
//            for ( int j = 0 ; j < i ; j++ ) {
//                System.out.print("🎈");          // window + . 누르면 이모지 창 나옴
//            }
//            System.out.println();
//        }
        /*
                 *
                **
               ***
         */

        for (int i = 0 ; i < 3 ; i++ ) {
            // 공백을 위한 반복문
            // # 1 : j--를 사용한 방식
//            for (int j = 3 ; j > i+1 ; j--) {
//                System.out.print(" ");
//            }

            // # 2 : j++를 사용한 방식
            for (int j = 0 ; j < 3-(i+1) ; j++) {
                System.out.print("  ");
            }

            // 별을 찍는 반복문
            for( int k = 0 ; k < i+1 ; k++) {
                System.out.print("⚽");
            }
            System.out.println(); // 개행을 위한 실행문3
        }



    }
}
