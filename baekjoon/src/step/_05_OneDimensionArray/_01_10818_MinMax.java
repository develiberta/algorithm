package step._05_OneDimensionArray;

import java.io.*;
import java.util.StringTokenizer;

/* date : 2021-07-04 (일)
 * author : develiberta
 * number : 10818
 *
 * [단계]
 * 05. 1차원 배열
 * [제목]
 * 01. 최소, 최대 (10818)
 * [문제]
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * [출력]
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 * (예제 입력 1)
 * 5
 * 20 10 35 30 7
 * (예제 출력 1)
 * 7 35
 */
public class _01_10818_MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        int min =  1000001;
        int max = -1000001;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }

        bw.write(min + " " + max);

        br.close();

        bw.flush();
        bw.close();
    }
}
