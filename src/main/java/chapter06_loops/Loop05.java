package chapter06_loops;

public class Loop05 {
    public static void main(String[] args) {
        /*
             *
             **
             ***
             ****
             *****
             *****
             ****
             ***
             **
             *

             *
             **
             ***
             ****
             *****
             ****
             ***
             **
             *
         */

        // 별이 늘어나는 반복문
        for ( int i = 0 ; i < 6 ; i++ ) {
            for (int j = 0 ; j < i ; j++ ) {
                System.out.print("🎃");
            }
            System.out.println();
        }

        // 별이 줄어드는 반복문
        for (int i = 5 ; i > 0 ; i-- ) {
            for ( int j = 0 ; j < i ; j++ ) {
                System.out.print("🎃");          // window + . 누르면 이모지 창 나옴
            }
            System.out.println();
        }


        for ( int i = 0 ; i < 5 ; i++ ) {
            for (int j = 0 ; j < i ; j++ ) {
                System.out.print("🎃");
            }
            System.out.println();
        }


        for (int i = 5 ; i > 0 ; i-- ) {
            for ( int j = 0 ; j < i ; j++ ) {
                System.out.print("🎃");          // window + . 누르면 이모지 창 나옴
            }
            System.out.println();
        }
    }
}
