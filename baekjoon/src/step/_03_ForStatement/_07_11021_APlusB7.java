package step._03_ForStatement;

import java.io.*;
import java.util.StringTokenizer;

/* date : 2021-06-30 (수)
 * author : develiberta
 * number : 11021
 *
 * [단계]
 * 03. For문
 * [제목]
 * 07. A+B - 7 (11021)
 * [문제]
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * [출력]
 * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 * (예제 입력 1)
 * 5
 * 1 1
 * 2 3
 * 3 4
 * 9 8
 * 5 2
 * (예제 출력 1)
 * Case #1: 2
 * Case #2: 5
 * Case #3: 7
 * Case #4: 17
 * Case #5: 7
 */
public class _07_11021_APlusB7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i=1; i<=T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            bw.write(String.format("Case #%d: %d\n", i, Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
