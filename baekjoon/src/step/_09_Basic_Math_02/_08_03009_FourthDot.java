package step._09_Basic_Math_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/* date : 2021-07-31 (토)
 * author : develiberta
 * number : 03009
 *
 * [단계]
 * 09. 기본 수학 2
 * 소수와 기하를 다뤄 봅시다.
 * [제목]
 * 08. 네 번째 점 (03009)
 * 직사각형을 완성하는 문제
 * [문제]
 * 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
 * [입력]
 * 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
 * [출력]
 * 직사각형의 네 번째 점의 좌표를 출력한다.
 * (예제 입력 1)
 * 5 5
 * 5 7
 * 7 5
 * (예제 출력 1)
 * 7 7
 * (예제 입력 2)
 * 30 20
 * 10 10
 * 10 20
 * (예제 출력 2)
 * 30 10
 */
public class _08_03009_FourthDot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for (int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            xList.add(Integer.parseInt(st.nextToken()));
            yList.add(Integer.parseInt(st.nextToken()));
        }

        for (int x : xList) {
            if (Collections.frequency(xList, x) == 1) {
                bw.write(String.valueOf(x));
            }
        }

        bw.write(" ");

        for (int y : yList) {
            if (Collections.frequency(yList, y) == 1) {
                bw.write(String.valueOf(y));
            }
        }

        br.close();

        bw.flush();
        bw.close();
    }

}