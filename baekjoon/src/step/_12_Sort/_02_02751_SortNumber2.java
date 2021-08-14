package step._12_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/* date : 2021-08-14 (토)
 * author : develiberta
 * number : 02751
 *
 * [단계]
 * 12. 정렬
 * 배열의 원소를 순서대로 나열하는 알고리즘을 배워 봅시다.
 * [제목]
 * 01. 수 정렬하기 2 (02751)
 * 시간 복잡도가 O(nlogn)인 정렬 알고리즘으로 풀 수 있습니다.
 * 예를 들면 병합 정렬, 힙 정렬 등이 있지만, 어려운 알고리즘이므로 지금은 언어에 내장된 정렬 함수를 쓰는 것을 추천드립니다.
 * [문제]
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
 * 둘째 줄부터 N개의 줄에는 수 주어진다.
 * 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다.
 * 수는 중복되지 않는다.
 * [출력]
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * (예제 입력 1)
 * 5
 * 5
 * 2
 * 3
 * 4
 * 1
 * (예제 출력 1)
 * 1
 * 2
 * 3
 * 4
 * 5
 */
public class _02_02751_SortNumber2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

//        Set<Integer> collection = new TreeSet<>();
//
//        for (int i=0; i<N; i++) {
//            collection.add(Integer.parseInt(br.readLine()));
//        }

//        List<Integer> collection = new ArrayList<>();
//
//        for (int i=0; i<N; i++) {
//            collection.add(Integer.parseInt(br.readLine()));
//        }
//
//        Collections.sort(collection);

        int[] collection = new int[N];

        for (int i=0; i<N; i++) {
            collection[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(collection);

        for (int element : collection) {
            bw.write(String.valueOf(element));
            bw.newLine();
        }

        br.close();

        bw.flush();
        bw.close();
    }
}