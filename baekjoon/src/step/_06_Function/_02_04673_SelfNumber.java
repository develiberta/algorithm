package step._06_Function;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* date : 2021-07-09 (금)
 * author : develiberta
 * number : 04673
 *
 * [단계]
 * 06. 함수
 * 함수를 정의하면 코드가 깔끔해지고 관리하기 쉬워집니다.
 * [제목]
 * 02. 셀프 넘버 (04673)
 * 함수 d를 정의하여 문제를 해결해 봅시다.
 * [문제]
 * 셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다.
 * 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 예를 들어, d(75) = 75+7+5 = 87이다.
 * 양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다.
 * 예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다.
 * 이런식으로 다음과 같은 수열을 만들 수 있다.
 * 33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...
 * n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다.
 * 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다.
 * 생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다.
 * 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
 * 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * [입력]
 * 입력은 없다.
 * [출력]
 * 10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.
 * (예제 입력 1)
 * (예제 출력 1)
 * 1
 * 3
 * 5
 * 7
 * 9
 * 20
 * 31
 * 42
 * 53
 * 64
 *  |
 *  |       <-- a lot more numbers
 *  |
 * 9903
 * 9914
 * 9925
 * 9927
 * 9938
 * 9949
 * 9960
 * 9971
 * 9982
 * 9993
 */
public class _02_04673_SelfNumber {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[10000];
        for (int i=1; i<10001; i++) {
            int nonSelf = d(i);
            if (nonSelf-1 < 10000) {
                array[nonSelf-1] = nonSelf;
            }
        }

        for (int i=0; i<10000; i++) {
            if (array[i] == 0) {
                bw.write((i+1) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }

    private static int d(int n) {
        int tmp = n;
        while (tmp != 0) {
            n += tmp % 10;
            tmp = tmp / 10;
        }
        return n;
    }
}
