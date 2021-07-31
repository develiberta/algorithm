package step._09_Basic_Math_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* date : 2021-07-31 (토)
 * author : develiberta
 * number : 01002
 *
 * [단계]
 * 09. 기본 수학 2
 * 소수와 기하를 다뤄 봅시다.
 * [제목]
 * 11. 터렛 (01002)
 * 두 원의 교점의 개수를 구하는 문제
 * [문제]
 * 조규현과 백승환은 터렛에 근무하는 직원이다.
 * 하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다. 다음은 조규현과 백승환의 사진이다.
 * 이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다.
 * 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
 * 조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고,
 * 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때,
 * 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 다음과 같이 이루어져 있다.
 * 한 줄에 x1, y1, r1, x2, y2, r2가 주어진다.
 * x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다.
 * [출력]
 * 각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다.
 * 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.
 * (예제 입력 1)
 * 3
 * 0 0 13 40 0 37
 * 0 0 3 0 7 4
 * 1 1 1 1 1 5
 * (예제 출력 1)
 * 2
 * 1
 * 0
 */
public class _11_01002_Turret {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                bw.write("-1");
            } else {
                double d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
                double r = Math.abs(r2-r1);
                double R = r1 + r2;

                if (d > R || d < r) {
                    bw.write("0");
                } else if (d < R && d > r) {
                    bw.write("2");
                } else {    // d == R || d == r
                    bw.write("1");
                }
            }

            bw.newLine();
        }

        br.close();

        bw.flush();
        bw.close();
    }
}