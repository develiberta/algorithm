package step._05_OneDimensionArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-07-07 (수)
 * author : develiberta
 * number : 02577
 *
 * [단계]
 * 05. 1차원 배열
 * 배열을 사용해 봅시다.
 * [제목]
 * 03. 숫자의 개수 (02577)
 * 각 숫자가 몇 번 나왔는지 저장하기 위해 일차원 배열을 만드는 문제
 * [문제]
 * 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 * 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
 * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 * [입력]
 * 첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.
 * [출력]
 * 첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다.
 * 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
 * (예제 입력 1)
 * 150
 * 266
 * 427
 * (예제 출력 1)
 * 3
 * 1
 * 0
 * 2
 * 0
 * 0
 * 0
 * 2
 * 0
 * 0
 */
public class _03_02577_CountOfNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[10];

        int multiple = 1;

        for (int i=0; i<3; i++) {
            multiple *= Integer.parseInt(br.readLine());
        }

        while (multiple != 0) {
            array[multiple % 10]++;
            multiple /= 10;
        }

        for (int i=0; i<array.length; i++) {
            bw.write(array[i] + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
