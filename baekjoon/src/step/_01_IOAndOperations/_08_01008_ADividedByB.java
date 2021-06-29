package step._01_IOAndOperations;

import java.util.Scanner;

/* date : 2021-06-16 (수)
 * author : develiberta
 * number : 01008
 *
 * [단계]
 * 01. 입출력과 사칙연산
 * [제목]
 * 08. A/B (01008)
 * [문제]
 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * [출력]
 * 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10E-9 이하이면 정답이다.
 * (예제 입력 1)
 * 1 3
 * (예제 출력 1)
 * 0.33333333333333333333333333333333
 * (예제 입력 2)
 * 4 5
 * (예제 출력 2)
 * 0.8
 */
public class _08_01008_ADividedByB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.print((double)A/B);

        in.close();
    }
}
