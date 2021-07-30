package step._03_ForStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-06-30 (수)
 * author : develiberta
 * number : 02741
 *
 * [단계]
 * 03. For문
 * for문을 사용해 봅시다.
 * [제목]
 * 05. N 찍기 (02741)
 * 1부터 N까지 출력하는 문제
 * [문제]
 * 자연수 N이 주어졌을 때, 1부터 N까첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 * [출력]
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 * (예제 입력 1)
 * 5
 * (예제 출력 1)
 * 1
 * 2
 * 3
 * 4
 * 5
 */
public class _05_02741_PrintN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i=1; i<=N; i++) {
            bw.write(i + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
