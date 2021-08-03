package step._10_Recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-08-03 (화)
 * author : develiberta
 * number : 11729
 *
 * [단계]
 * 10. 재귀
 * 재귀함수를 다뤄 봅시다.
 * [제목]
 * 04. 하노이 탑 이동 순서 (11729)
 * 재귀적인 패턴을 재귀함수로 찍는 문제 2
 * [문제]
 * 세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다.
 * 각 원판은 반경이 큰 순서대로 쌓여있다. 이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.
 * 한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
 * 쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
 * 이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.
 * 아래 그림은 원판이 5개인 경우의 예시이다.
 * [입력]
 * 첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1 ≤ N ≤ 20)이 주어진다.
 * [출력]
 * 첫째 줄에 옮긴 횟수 K를 출력한다.
 * 두 번째 줄부터 수행 과정을 출력한다.
 * 두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데,
 * 이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.
 * (예제 입력 1)
 * 3
 * (예제 출력 1)
 * 7
 * 1 3
 * 1 2
 * 3 2
 * 1 3
 * 2 1
 * 2 3
 * 1 3
 */
public class _04_11729_TowerOfHanoi {
    private static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(count(N)));
        bw.newLine();
        step(1, 3, 2, N);
        bw.write(sb.toString());

        br.close();

        bw.flush();
        bw.close();
    }

    private static int count(int n) {
        if (n == 1) return n;
        return count(n-1) * 2 + 1;
    }

    private static void step(int start, int end, int tmp, int n) {
        if (n == 1) {
            sb.append(start + " " + end + "\n");
            return;
        }
        step(start, tmp, end, n-1);
        step(start, end, tmp, 1);
        step(tmp, end, start, n-1);
    }
}