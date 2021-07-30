package step._09_Basic_Math_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* date : 2021-07-28 (수)
 * author : develiberta
 * number : 01978
 *
 * [단계]
 * 09. 기본 수학 2
 * 소수와 기하를 다뤄 봅시다.
 * [제목]
 * 01. 소수 찾기 (01978)
 * 2부터 X-1까지 모두 나눠서 X가 소수인지 판별하는 문제 1
 * [문제]
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * [출력]
 * 주어진 수들 중 소수의 개수를 출력한다.
 * (예제 입력 1)
 * 4
 * 1 3 5 7
 * (예제 출력 1)
 * 3
 */
public class _01_01978_FindPrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = 0;

        for (int i=0; i<N; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (isPrime(x) == true) {
                count++;
            }
        }

        bw.write(String.valueOf(count));

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