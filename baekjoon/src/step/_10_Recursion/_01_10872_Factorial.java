package step._10_Recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-07-31 (토)
 * author : develiberta
 * number : 10872
 *
 * [단계]
 * 10. 재귀
 * 재귀함수를 다뤄 봅시다.
 * [제목]
 * 01. 팩토리얼 (10872)
 * 팩토리얼은 단순 for문으로도 구할 수 있지만, 학습을 위해 재귀를 써 봅시다.
 * [문제]
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
 * [출력]
 * 첫째 줄에 N!을 출력한다.
 * (예제 입력 1)
 * 10
 * (예제 출력 1)
 * 3628800
 * (예제 입력 2)
 * 0
 * (예제 출력 2)
 * 1
 */
public class _01_10872_Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(factorial(N)));

        br.close();

        bw.flush();
        bw.close();
    }

    private static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
}