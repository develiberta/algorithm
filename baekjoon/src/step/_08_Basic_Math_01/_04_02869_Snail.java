package step._08_Basic_Math_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* date : 2021-07-20 (화)
 * author : develiberta
 * number : 02869
 *
 * [단계]
 * 08. 기본 수학 1
 * 수학 문제로 수학적 사고력을 길러 봅시다.
 * [제목]
 * 04. 달팽이는 올라가고 싶다 (02869)
 * 달팽이의 움직임을 계산하는 문제
 * [문제]
 * 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
 * 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다.
 * 또, 정상에 올라간 후에는 미끄러지지 않는다.
 * 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
 * [출력]
 * 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
 * (예제 입력 1)
 * 2 1 5
 * (예제 출력 1)
 * 4
 * (예제 입력 2)
 * 5 1 6
 * (예제 출력 2)
 * 2
 * (예제 입력 3)
 * 100 99 1000000000
 * (예제 출력 3)
 * 999999901
 */
public class _04_02869_Snail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());   // 달팽이가 낮에 올라가는 높이 (미터)
        int B = Integer.parseInt(st.nextToken());   // 달팽이가 밤에 내려가는 높이 (미터)
        int V = Integer.parseInt(st.nextToken());   // 나무 막대의 높이 (미터)

//        int day = (int) Math.ceil((double)(V - A) / (A - B)) + 1;
        int day = (V - B - 1) / (A - B) + 1;

        bw.write(String.valueOf(day));

        br.close();

        bw.flush();
        bw.close();
    }
}