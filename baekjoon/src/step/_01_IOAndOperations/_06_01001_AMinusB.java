package step._01_IOAndOperations;

import java.util.Scanner;

/* date : 2021-06-16 (수)
 * author : develiberta
 * number : 01001
 *
 * [단계]
 * 01. 입출력과 사칙연산
 * 입력, 출력과 사칙연산을 연습해 봅시다. Hello World!
 * [제목]
 * 06. A-B (01001)
 * 두 수를 입력받고 뺄셈을 한 결과를 출력하는 문제
 * [문제]
 * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * [출력]
 * 첫째 줄에 A-B를 출력한다.
 * (예제 입력 1)
 * 3 2
 * (예제 출력 1)
 * 1
 */
public class _06_01001_AMinusB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.print(A-B);

        in.close();
    }
}
