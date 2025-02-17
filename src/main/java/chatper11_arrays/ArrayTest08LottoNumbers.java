package chatper11_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest08LottoNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int totalGame = 5;
        int[] lottoNumbers = new int[6];
        boolean duplicate;
        // 배열에 집어넣기 전에 중복인지 확인할 수 있을만한 임시 변수 하나 선언
        int number;

        for (int j = 0; j < totalGame; j++) {                // 게임 전체 반복을 돌리는 반복문
            for (int i = 0; i < lottoNumbers.length; i++) {   // 난수를 생성해서 대입하는 반복문
                duplicate = false;                                                          // 여기서 초기화했습니다 -> 예를 들어 직전 반복에서 true가 떴다고 가정했을 때 계속해서 반복이 돌겠네요
                number = random.nextInt(45) + 1;            // 난수 대입
                // 여기서 반복을 돌릴건데                          // 완전히 확정 짓기 전에 중복을 체크
                for (int k = 0; k < i; k++) {
                    if (lottoNumbers[k] == number) {            // 배열에 있는 숫자가 방금 막 대입한
                        duplicate = true;                       // number와 겹치는 부분이 있다면 실행
                    }   // 위의 boolean 변수가 true가 되었다면 -> 다시 한 번 더 난수 대입을 해야 합니다.
                }

                if (!duplicate) {
                    lottoNumbers[i] = number;       // 중복이 없기 때문에 배열에 대입
                } else {
                    i--;                            // 반복 횟수를 한 번 까서 한 번 더 난수 대입이 되게끔
                }                                   // 작성함
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
        }


    }
}
