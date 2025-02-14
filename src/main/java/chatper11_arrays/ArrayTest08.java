package chatper11_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    로또 번호 추첨기를 프로그래밍할 예정입니다.

    1. 1 - 45까지의 숫자를 임의로 생성한 후, lottoNumbers라는 배열에 저장할 예정
    2. 5번의 게임을 할 겁니다.
        - 로또 한 게임을 기준으로 할 때 6개의 번호를 뽑는 것을 5 게임할 예정
    3. nextInt()를 통해서 번호를 뽑게 되면 중복 번호가 생길 수 있습니다.
        -> getter / setter와 같은 파트에서 중복 제거와 관련된 로직을 확인 가능
    4. 배열 완성 후 오름차순을 통해서 숫자들을 정렬하여 출력합니다.

    실행 예
    로또 번호 추첨기에 오신 것을 환영합니다.

    이번 로또 당첨 번호는 다음과 같습니다.
        [ 3, 12, 25, 13, 24, 21 ]
        [ 3, 25, 7, 4, 6, 8 ]
        [ 4, 15, 22, 30, 36, 41 ]
        [ 7, 8, 19,  21, 34, 42 ]
        [ 5, 6, 14, 18, 27, 33 ]
 */
public class ArrayTest08 {
    public static void main(String[] args) {
        // 랜덤 클래스 import
        Random random = new Random();
//        int a = random.nextInt(45);        // random.nextInt(한계값) -> 0 ~ (한계값-1)까지의 int값을 반환
//        System.out.println(a); // 0 ~ 44까지 튀어나온다는 의미겠네요
//        int b = random.nextInt(46); // 이 경우 0번이 나올 수도 있겠네요
        // 중복 제거를 위한 변수 선언
        boolean duplicate = false;
        int[] lottoNumbers = new int[6];

        // 여기서 아셔야 할 점은
//        lottoNumbers[4]가 [1]번지의 숫자와 동일하다면
        // 반복문이 한 번 다시 돌아야 하는데,
        // lottoNumbers[0] != lottoNumbers[4]도 통과해야하고
        // lottoNumbers[1] != lottoNumbers[4]도 통과해야하고
        // lottoNumbers[2] != lottoNumbers[4]도 통과해야하고
        // lottoNumbers[3] != lottoNumbers[4]도 통과해야하고

        // 그리고 lottoNumbers[5]가 중복이 없다는 것을 확인하려면
        // lottoNumbers[0] != lottoNumbers[5]도 통과해야하고
        // lottoNumbers[1] != lottoNumbers[5]도 통과해야하고
        // lottoNumbers[2] != lottoNumbers[5]도 통과해야하고
        // lottoNumbers[3] != lottoNumbers[5]도 통과해야하고
        // lottoNumbers[4] != lottoNumbers[5]도 통과해야하고

        // 위에서 비어있는 배열 선언 했습니다 -> 임의의 숫자 담을 예정
        // 2중 for문 만들어서 이 과정을 다섯 번 돌려버리면
//        for (int i = 0 ; i < lottoNumbers.length ; i++) {
//            lottoNumbers[i] = random.nextInt(45) + 1;
//        }

        // 요소 뽑아서 뭐 연산할거라면 또 반복문써야겠지만
        // 집어넣은거 보기만 할건데 왜 굳이 쓸까요 // 그냥 Arrays.toString()

//        System.out.println(Arrays.toString(lottoNumbers));

        // 그래서 이상의 과정을 5번 반복하기 위해 정리된 코드
        for ( int i = 0 ; i < 5 ; i++) {
            for ( int j = 0 ; j < lottoNumbers.length ; j++ ) {
                lottoNumbers[j] = random.nextInt(45) + 1;
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
        }


    }
}
