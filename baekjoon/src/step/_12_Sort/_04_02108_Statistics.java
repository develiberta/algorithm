package step._12_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-08-14 (토)
 * author : develiberta
 * number : 02108
 *
 * [단계]
 * 12. 정렬
 * 배열의 원소를 순서대로 나열하는 알고리즘을 배워 봅시다.
 * [제목]
 * 04. 통계학 (02108)
 * 정렬을 활용하는 문제
 * [문제]
 * 수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.
 * 산술평균 : N개의 수들의 합을 N으로 나눈 값
 * 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 * 최빈값 : N개의 수들 중 가장 많이 나타나는 값
 * 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 * N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 단, N은 홀수이다.
 * 그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.
 * [출력]
 * 첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
 * 둘째 줄에는 중앙값을 출력한다.
 * 셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
 * 넷째 줄에는 범위를 출력한다.
 * (예제 입력 1)
 * 5
 * 1
 * 3
 * 8
 * -2
 * 2
 * (예제 출력 1)
 * 2
 * 2
 * 1
 * 10
 * (예제 입력 2)
 * 1
 * 4000
 * (예제 출력 2)
 * 4000
 * 4000
 * 4000
 * 0
 * (예제 입력 3)
 * 5
 * -1
 * -2
 * -3
 * -1
 * -2
 * (예제 출력 3)
 * -2
 * -2
 * -1
 * 2
 */
public class _04_02108_Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double sum = 0.0;
        double average = 0.0;
        int midium = 0;
        int frequency = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int range = 0;

        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];
        int[] count = new int[8001];

        for (int i=0; i<array.length; i++) {
            int input = Integer.parseInt(br.readLine());
            array[i] = input;
            sum += input;
            count[input+4000]++;
            if (input > max) max = input;
            if (input < min) min = input;
        }

        /* 산술평균 */
        average = sum / N;

        /* 범위 */
        range = max - min;

        /* 중앙값, 최빈값 */
        boolean midiumContinue = true;
        int countTmp = 0;
        int frequencyTmp = 0;
        for (int i=count.length-1; i>=0; i--) {
            countTmp += count[i];
            if (count[i] > count[frequencyTmp+4000]) {
                frequencyTmp = i-4000;
                frequency = frequencyTmp;
            }
            else if (count[i] == count[frequencyTmp+4000]) {
                frequency = frequencyTmp;
                frequencyTmp = i-4000;
            }
            if (midiumContinue && countTmp > N/2) {
                midium = i-4000;
                midiumContinue = false;
            }
        }

        bw.write(String.valueOf(Math.round(average)));
        bw.newLine();
        bw.write(String.valueOf(midium));
        bw.newLine();
        bw.write(String.valueOf(frequency));
        bw.newLine();
        bw.write(String.valueOf(range));

        br.close();

        bw.flush();
        bw.close();
    }
}