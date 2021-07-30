package step._05_OneDimensionArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-07-07 (수)
 * author : develiberta
 * number : 03052
 *
 * [단계]
 * 05. 1차원 배열
 * 배열을 사용해 봅시다.
 * [제목]
 * 04. 나머지 (03052)
 * 위와 비슷한 문제
 * [문제]
 * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
 * [출력]
 * 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
 * (예제 입력 1)
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * (예제 출력 1)
 * 10
 */
public class _04_03052_Remainder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer[] array = new Integer[10];
        boolean[] result = new boolean[42];

        for (int i=0; i<array.length; i++) {
            array[i] = Integer.parseInt(br.readLine()) % 42;
            result[array[i]] = true;
        }

//        bw.write(String.valueOf(Stream.of(array).distinct().count()));

        int count = 0;

        for (int i=0; i<result.length; i++) {
            if (result[i] == true) count++;
        }

        bw.write("" + count);

        br.close();

        bw.flush();
        bw.close();
    }
}
