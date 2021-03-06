package step._02_IfStatement;

import java.util.Scanner;

/* date : 2021-06-22 (화)
 * author : develiberta
 * number : 09498
 *
 * [단계]
 * 02. If문
 * if문을 사용해 봅시다.
 * [제목]
 * 02. 시험 성적 (09498)
 * 시험 점수를 성적으로 바꾸는 문제
 * [문제]
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * [출력]
 * 시험 성적을 출력한다.
 * (예제 입력 1)
 * 100
 * (예제 출력 1)
 * A
 */
public class _02_09498_TestScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.print(grade);

        in.close();
    }
}
