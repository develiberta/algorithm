package step._11_BruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-08-04 (수)
 * author : develiberta
 * number : 02231
 *
 * [단계]
 * 11. 브루트 포스
 * 가장 간단한 알고리즘인, 모든 경우의 수를 검사하는 브루트 포스 알고리즘을 배워 봅시다.
 * [제목]
 * 02. 분해합 (02231)
 * 모든 경우를 시도하여 N의 생성자를 구하는 문제
 * [문제]
 * 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다.
 * 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다.
 * 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다.
 * 따라서 245는 256의 생성자가 된다.
 * 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다.
 * 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
 * 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
 * [출력]
 * 첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
 * (예제 입력 1)
 * 216
 * (예제 출력 1)
 * 198
 */
public class _02_02231_Decomposition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int N = Integer.parseInt(input);
        int result = 0;
        int init = N - 9 * input.length();
        for (int i=init>0?init:0; i<N; i++) {
            if (i + sumOfDisit(i) == N) {
                result = i;
                break;
            }
        }

        bw.write(String.valueOf(result));

        br.close();

        bw.flush();
        bw.close();
    }

    private static int sumOfDisit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}