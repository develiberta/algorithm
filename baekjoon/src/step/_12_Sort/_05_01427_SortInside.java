package step._12_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-08-16 (월)
 * author : develiberta
 * number : 01427
 *
 * [단계]
 * 12. 정렬
 * 배열의 원소를 순서대로 나열하는 알고리즘을 배워 봅시다.
 * [제목]
 * 05. 소트인사이드 (01427)
 * 숫자를 정렬하는 문제
 * [문제]
 * 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 * [입력]
 * 첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
 * [출력]
 * 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 * (예제 입력 1)
 * 2143
 * (예제 출력 1)
 * 4321
 */
public class _05_01427_SortInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] array = br.readLine().toCharArray();

        /* 버블 정렬 */
        for (int i=0; i<array.length-1; i++) {
            for (int j=0; j<array.length-1-i; j++) {
                if (array[j] < array[j+1]) {
                    char tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

        for (int i=0; i<array.length; i++) {
            bw.write(String.valueOf(array[i]));
        }

        br.close();

        bw.flush();
        bw.close();
    }
}