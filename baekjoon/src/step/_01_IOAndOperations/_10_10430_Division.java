package step._01_IOAndOperations;

import java.util.Scanner;

/* date : 2021-06-19 (토)
 * author : develiberta
 * number : 10430
 *
 * [단계]
 * 01. 입출력과 사칙연산
 * 입력, 출력과 사칙연산을 연습해 봅시다. Hello World!
 * [제목]
 * 10. 나머지 (10430)
 * 네 개의 계산식을 계산하는 문제. 이 문제를 푼 다음에는 직접 입력을 만들어서 넣어 봅시다. 어떤 사실을 관찰할 수 있나요?
 * [문제]
 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 * [출력]
 * 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
 * (예제 입력 1)
 * 5 8 4
 * (예제 출력 1)
 * 1
 * 1
 * 0
 * 0
 */
public class _10_10430_Division {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        System.out.println((A+B) % C);
        System.out.println(((A%C)+(B%C)) % C);
        System.out.println((A*B) % C);
        System.out.println(((A%C)*(B%C)) % C);

        in.close();
    }
}
