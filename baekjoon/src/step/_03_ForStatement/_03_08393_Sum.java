package step._03_ForStatement;

import java.util.Scanner;

/* date : 2021-06-28 (월)
 * author : develiberta
 * number : 08393
 *
 * [단계]
 * 03. For문
 * for문을 사용해 봅시다.
 * [제목]
 * 03. 합 (08393)
 * 1부터 N까지의 합을 구하는 문제. 물론 반복문 없이 풀 수도 있습니다.
 * [문제]
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * [출력]
 * 1부터 n까지 합을 출력한다.
 * (예제 입력 1)
 * 3
 * (예제 출력 1)
 * 6
 */
public class _03_08393_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        for (int i=1; i<=n; i++) {
            sum += i;
        }

        System.out.println(sum);

        in.close();
    }
}
