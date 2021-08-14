package step._12_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-08-14 (토)
 * author : develiberta
 * number : 10989
 *
 * [단계]
 * 12. 정렬
 * 배열의 원소를 순서대로 나열하는 알고리즘을 배워 봅시다.
 * [제목]
 * 03. 수 정렬하기 3 (10989)
 * 수의 범위가 작다면 카운팅 정렬을 사용하여 더욱 빠르게 정렬할 수 있습니다.
 * [문제]
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다.
 * 둘째 줄부터 N개의 줄에는 수 주어진다.
 * 이 수는 10,000보다 작거나 같은 자연수이다.
 * [출력]
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * (예제 입력 1)
 * 10
 * 5
 * 2
 * 3
 * 1
 * 4
 * 2
 * 3
 * 5
 * 1
 * 7
 * (예제 출력 1)
 * 1
 * 1
 * 2
 * 2
 * 3
 * 3
 * 4
 * 5
 * 5
 * 7
 */
public class _03_10989_SortNumber3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] count = new int[10001];

        for (int i=0; i<N; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        for (int i=1; i<count.length; i++) {
            for (int j=0; j<count[i]; j++) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        br.close();

        bw.flush();
        bw.close();
    }
}