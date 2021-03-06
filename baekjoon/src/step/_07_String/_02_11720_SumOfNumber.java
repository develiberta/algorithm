package step._07_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-07-11 (일)
 * author : develiberta
 * number : 11720
 *
 * [단계]
 * 07. 문자열
 * 문자열을 다루는 문제들을 해결해 봅시다.
 * [제목]
 * 02. 숫자의 합 (11720)
 * 정수를 문자열로 입력받는 문제. Python처럼 정수 크기에 제한이 없다면 상관 없으나, 예제 3은 일반적인 정수 자료형에 담기에 너무 크다는 점에 주목합시다.
 * [문제]
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * [출력]
 * 입력으로 주어진 숫자 N개의 합을 출력한다.
 * (예제 입력 1)
 * 1
 * 1
 * (예제 출력 1)
 * 1
 * (예제 입력 2)
 * 5
 * 54321
 * (예제 출력 2)
 * 15
 * (예제 입력 3)
 * 25
 * 7000000000000000000000000
 * (예제 출력 3)
 * 7
 * (예제 입력 4)
 * 11
 * 10987654321
 * (예제 출력 4)
 * 46
 */
public class _02_11720_SumOfNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;

        for (int i=0; i<N; i++) {
            sum += s.charAt(i) - '0';
        }

        bw.write("" + sum);

        br.close();

        bw.flush();
        bw.close();
    }
}