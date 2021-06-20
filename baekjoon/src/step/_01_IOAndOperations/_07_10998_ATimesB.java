package step._01_IOAndOperations;

import java.util.Scanner;

/* date : 2021-06-16 (수)
 * author : develiberta
 * number : 10998
 *
 * [단계]
 * 01. 입출력과 사칙연산
 * [제목]
 * 07. A×B (10998)
 * [문제]
 * 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * [출력]
 * 첫째 줄에 A×B를 출력한다.
 * (예제 입력 1)
 * 1 2
 * (예제 출력 1)
 * 2
 * (예제 입력 2)
 * 3 4
 * (예제 출력 2)
 * 12
 */
public class _07_10998_ATimesB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.print(A*B);
    }
}
