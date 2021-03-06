package step._08_Basic_Math_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* date : 2021-07-24 (토)
 * author : develiberta
 * number : 01011
 *
 * [단계]
 * 08. 기본 수학 1
 * 수학 문제로 수학적 사고력을 길러 봅시다.
 * [제목]
 * 09. Fly me to the Alpha Centauri (01011)
 * 거리에 따른 장치 사용 횟수를 출력하는 문제
 * [문제]
 * 우현이는 어린 시절, 지구 외의 다른 행성에서도 인류들이 살아갈 수 있는 미래가 오리라 믿었다.
 * 그리고 그가 지구라는 세상에 발을 내려 놓은 지 23년이 지난 지금, 세계 최연소 ASNA 우주 비행사가 되어 새로운 세계에 발을 내려 놓는 영광의 순간을 기다리고 있다.
 * 그가 탑승하게 될 우주선은 Alpha Centauri라는 새로운 인류의 보금자리를 개척하기 위한 대규모 생활 유지 시스템을 탑재하고 있기 때문에,
 * 그 크기와 질량이 엄청난 이유로 최신기술력을 총 동원하여 개발한 공간이동 장치를 탑재하였다.
 * 하지만 이 공간이동 장치는 이동 거리를 급격하게 늘릴 경우 기계에 심각한 결함이 발생하는 단점이 있어서,
 * 이전 작동시기에 k광년을 이동하였을 때는 k-1 , k 혹은 k+1 광년만을 다시 이동할 수 있다.
 * 예를 들어, 이 장치를 처음 작동시킬 경우 -1 , 0 , 1 광년을 이론상 이동할 수 있으나 사실상 음수 혹은 0 거리만큼의 이동은 의미가 없으므로 1 광년을 이동할 수 있으며,
 * 그 다음에는 0 , 1 , 2 광년을 이동할 수 있는 것이다. ( 여기서 다시 2광년을 이동한다면 다음 시기엔 1, 2, 3 광년을 이동할 수 있다. )
 * 김우현은 공간이동 장치 작동시의 에너지 소모가 크다는 점을 잘 알고 있기 때문에 x지점에서 y지점을 향해 최소한의 작동 횟수로 이동하려 한다.
 * 하지만 y지점에 도착해서도 공간 이동장치의 안전성을 위하여 y지점에 도착하기 바로 직전의 이동거리는 반드시 1광년으로 하려 한다.
 * 김우현을 위해 x지점부터 정확히 y지점으로 이동하는데 필요한 공간 이동 장치 작동 횟수의 최솟값을 구하는 프로그램을 작성하라.
 * [입력]
 * 입력의 첫 줄에는 테스트케이스의 개수 T가 주어진다. 각각의 테스트 케이스에 대해 현재 위치 x 와 목표 위치 y 가 정수로 주어지며, x는 항상 y보다 작은 값을 갖는다. (0 ≤ x < y < 231)
 * [출력]
 * 각 테스트 케이스에 대해 x지점으로부터 y지점까지 정확히 도달하는데 필요한 최소한의 공간이동 장치 작동 횟수를 출력한다.
 * (예제 입력 1)
 * 3
 * 0 3
 * 1 5
 * 45 50
 * (예제 출력 1)
 * 3
 * 3
 * 4
 */
public class _09_01011_FlyMeToTheAlphaCentauri {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int d = y - x;
            bw.write(equation2(d) + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }

    /* (1) 하나씩 더해가는 풀이 */
    private static int plusByStep(int d) {
        int count = 0;
        int j = 1;
        boolean twice = false;
        while (d > 0) {
            d -= j;
            if (twice == true) {
                j++;
            }
            twice = !twice;
            count++;
        }
        return count;
    }

    /* (2) n(n+1)/2 + (n+1) = (n+1)^2 임을 이용한 풀이 */
    private static int equation1(int d) {
        int count;
        int m = (int) (Math.sqrt(d) - 1);
        int estimate = (m + 1) * (m + 1);
        /* d >= estimate 는 항상 성립 */
        int error = d - estimate;
        if (error == 0) count = 2 * m + 1;
        else if (error <= m + 1) count = 2 * m + 2;
//        else if (error > m + 1) count = 2 * m + 3;
        else count = 2 * m + 3; // 효율을 위해 위의 식을 이와 같이 변경
        return count;
    }

    /* (3) n(n+1) = d 에서 근의 공식을 이용해서 n을 d에 관한 식으로 정리한 풀이 */
    private static int equation2(int d) {
        int count;
        int m = (int) ((-1 + Math.sqrt(1 + 4L * d)) / 2);   // [주의] 정수 오버플로우 가능성
        int estimate = m * (m + 1);
        /* d >= estimate 는 항상 성립 */
        int error = d - estimate;
        if (error == 0) count = 2 * m;
        else if (error <= m + 1) count = 2 * m + 1;
//        else if (error > m + 1) count = 2 * m + 2;
        else count = 2 * m + 2; // 효율을 위해 위의 식을 이와 같이 변경
        return count;
    }
}