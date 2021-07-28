package step._09_Basic_Math_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* date : 2021-07-28 (수)
 * author : develiberta
 * number : 01929
 *
 * [단계]
 * 09. 기본 수학 2
 * [제목]
 * 04. 소수 구하기 (01929)
 * [문제]
 * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다.
 * (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
 * [출력]
 * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 * (예제 입력 1)
 * 3 16
 * (예제 출력 1)
 * 3
 * 5
 * 7
 * 11
 * 13
 */
public class _04_01929_FindPrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i=M; i<=N; i++) {
            if (isPrime(i) == true) {
                bw.write(i + "\n");
            }
        }

        br.close();

        bw.flush();
        bw.close();
    }

    private static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i=2; i<=Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime && num != 1;
    }
}