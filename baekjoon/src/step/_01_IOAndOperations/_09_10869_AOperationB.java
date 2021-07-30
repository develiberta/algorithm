package step._01_IOAndOperations;

import java.util.Scanner;

/* date : 2021-06-17 (목)
 * author : develiberta
 * number : 10869
 *
 * [단계]
 * 01. 입출력과 사칙연산
 * 입력, 출력과 사칙연산을 연습해 봅시다. Hello World!
 * [제목]
 * 09. 사칙연산 (10869)
 * 모든 연산 문제
 * [문제]
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 * [입력]
 * 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 * [출력]
 * 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
 * (예제 입력 1)
 * 7 3
 * (예제 출력 1)
 * 10
 * 4
 * 21
 * 2
 * 1
 */
public class _09_10869_AOperationB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);

        in.close();
    }
}
