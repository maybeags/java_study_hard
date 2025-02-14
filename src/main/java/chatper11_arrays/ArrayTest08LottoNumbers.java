package chatper11_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest08LottoNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int[] lottoNumbers = new int[6];

    for (int j = 0 ; j < 5 ; j++ ) {
        for (int i = 0 ; i < lottoNumbers.length ; i++) {
            lottoNumbers[i] = random.nextInt(45) + 1;
        }
        Arrays.sort(lottoNumbers);
        System.out.println(Arrays.toString(lottoNumbers));
        }
    }

}
