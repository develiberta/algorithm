package step._06_Function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-07-10 (토)
 * author : develiberta
 * number : 01065
 *
 * [단계]
 * 06. 함수
 * 함수를 정의하면 코드가 깔끔해지고 관리하기 쉬워집니다.
 * [제목]
 * 03. 한수 (01065)
 * X가 한수인지 판별하는 함수를 정의하여 문제를 해결해 봅시다.
 * [문제]
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 * [출력]
 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 * (예제 입력 1)
 * 110
 * (예제 출력 1)
 * 99
 * (예제 입력 2)
 * 1
 * (예제 출력 2)
 * 1
 * (예제 입력 3)
 * 210
 * (예제 출력 3)
 * 105
 * (예제 입력 4)
 * 1000
 * (예제 출력 4)
 * 144
 */
public class _03_01065_HanNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i=1; i<=N; i++) {
            if (isHanNum(i)) count++;
        }

//        System.out.println(isHanNum(123));

        bw.write("" + count);

        br.close();

        bw.flush();
        bw.close();
    }

    private static boolean isHanNum(int n) {
        int before = n;
        int after;
        int differ = -10;
        while (before >= 10) {
            after = before / 10;
            if (Math.abs(differ) >= 10) differ = before % 10 - after % 10;
            else if (differ != before % 10 - after % 10) return false;
            before = after;
        }
        return true;
    }
}