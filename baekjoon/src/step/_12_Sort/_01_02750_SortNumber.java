package step._12_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-08-11 (수)
 * author : develiberta
 * number : 02750
 *
 * [단계]
 * 12. 정렬
 * 배열의 원소를 순서대로 나열하는 알고리즘을 배워 봅시다.
 * [제목]
 * 01. 수 정렬하기 (02750)
 * 시간 복잡도가 O(n²)인 정렬 알고리즘으로 풀 수 있습니다. 예를 들면 삽입 정렬, 거품 정렬 등이 있습니다.
 * [문제]
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
 * 둘째 줄부터 N개의 줄에는 수 주어진다.
 * 이 수는 절댓값이 1,000보다 작거나 같은 정수이다.
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
public class _01_02750_SortNumber {

    private static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        array = new int[N];
        array[0] = Integer.parseInt(br.readLine());

        /* 삽입 정렬 */
        for (int i=1; i<array.length; i++) {
            int input = Integer.parseInt(br.readLine());
            insertionSort(i, input, getIndexRefined(i, input));
        }

        for (int i=0; i<array.length; i++) {
            bw.write(String.valueOf(array[i]));
            bw.newLine();
        }

        br.close();

        bw.flush();
        bw.close();
    }

    private static int getIndexRefined(int inputIndex, int input) {
        int result = inputIndex;
        for (int i=0; i<inputIndex; i++) {
            if (array[i] < input) {
                continue;
            }
            else {
                result = i;
                break;
            }
        }
        return result;
    }

    private static void insertionSort(int inputIndex, int input, int indexRefined) {
        for (int i=inputIndex-1; i>=indexRefined; i--) {
            array[i+1] = array[i];
        }
        array[indexRefined] = input;
    }
}