package step._05_OneDimensionArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* date : 2021-07-09 (금)
 * author : develiberta
 * number : 04344
 *
 * [단계]
 * 05. 1차원 배열
 * 배열을 사용해 봅시다.
 * [제목]
 * 07. 평균은 넘겠지 (04344)
 * 과연 그럴까요?
 * [문제]
 * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다.
 * 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 * [입력]
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
 * 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * [출력]
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 * (예제 입력 1)
 * 5
 * 5 50 50 70 80 100
 * 7 100 95 90 80 70 60 50
 * 3 70 90 80
 * 3 70 90 81
 * 9 100 99 98 97 96 95 94 93 91
 * (예제 출력 1)
 * 40.000%
 * 57.143%
 * 33.333%
 * 66.667%
 * 55.556%
 */
public class _07_OverAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int sum = 0;
            int countTotal = Integer.parseInt(st.nextToken());
            int[] array = new int[countTotal];
            for (int j=0; j<countTotal; j++) {
                array[j] = Integer.parseInt(st.nextToken());
                sum += array[j];
            }
            double avg = sum / countTotal;
            int countSome = 0;
            for (int j=0; j<array.length; j++) {
                if (array[j] > avg) {
                    countSome++;
                }
            }
            bw.write(String.format("%.3f%%\n", (double)countSome / countTotal * 100));
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
