package step._09_Basic_Math_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-07-30 (금)
 * author : develiberta
 * number : 04948
 *
 * [단계]
 * 09. 기본 수학 2
 * 소수와 기하를 다뤄 봅시다.
 * [제목]
 * 05. 베르트랑 공준 (04948)
 * 소수 응용 문제 1
 * [문제]
 * 베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
 * 이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
 * 예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17, 19, 23)
 * 자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
 * [입력]
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하는 한 줄로 이루어져 있다.
 * 입력의 마지막에는 0이 주어진다.
 * [출력]
 * 각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
 * [제한]
 * 1 ≤ n ≤ 123,456
 * (예제 입력 1)
 * 1
 * 10
 * 13
 * 100
 * 1000
 * 10000
 * 100000
 * 0
 * (예제 출력 1)
 * 1
 * 4
 * 3
 * 21
 * 135
 * 1033
 * 8392
 */
public class _05_04948_BertrandsPostulate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            bw.write(countPrimeGreaterThanNAndLessThanEqual2N(n) + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }

    private static int countPrimeGreaterThanNAndLessThanEqual2N(int n) {
        int count = 0;

        boolean[] isNotPrime = new boolean[2 * n + 1];
        isNotPrime[0] = true;
        isNotPrime[1] = true;

        for (int i=2; i<Math.sqrt(isNotPrime.length); i++) {
            if (isNotPrime[i] == true) {
                continue;
            }
            for (int j=i*i; j<isNotPrime.length; j+=i) {
                isNotPrime[j] = true;
            }
        }

        for (int i=n+1; i<=2*n; i++) {
            if (isNotPrime[i] == false) {
                count++;
            }
        }

        return count;
    }

}