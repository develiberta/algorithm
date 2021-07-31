package step._09_Basic_Math_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* date : 2021-07-31 (토)
 * author : develiberta
 * number : 01085
 *
 * [단계]
 * 09. 기본 수학 2
 * 소수와 기하를 다뤄 봅시다.
 * [제목]
 * 07. 직사각형에서 탈출 (01085)
 * 직사각형과 점의 거리를 구하는 문제
 * [문제]
 * 한수는 지금 (x, y)에 있다.
 * 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
 * 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 x, y, w, h가 주어진다.
 * [출력]
 * 첫째 줄에 문제의 정답을 출력한다.
 * [제한]
 * 1 ≤ w, h ≤ 1,000
 * 1 ≤ x ≤ w-1
 * 1 ≤ y ≤ h-1
 * x, y, w, h는 정수
 * (예제 입력 1)
 * 6 2 10 3
 * (예제 출력 1)
 * 1
 */
public class _07_01085_EscapeFromRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] d = {x, w-x, y, h-y};
        int min = 1000;

        for (int i=0; i<d.length; i++) {
            if (d[i] < min) min = d[i];
        }

        bw.write(String.valueOf(min));

        br.close();

        bw.flush();
        bw.close();
    }

}