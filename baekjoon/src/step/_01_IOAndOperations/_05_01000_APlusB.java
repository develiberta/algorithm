package step._01_IOAndOperations;

import java.util.Scanner;

/* date : 2021-06-15 (화)
 * author : develiberta
 * [문제]
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * (예시)
 * 1 2
 * [출력]
 * 첫째 줄에 A+B를 출력한다.
 * (예시)
 * 3
 */
public class _05_01000_APlusB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.print(A+B);
    }
}
