package step._06_Function;

/* date : 2021-07-09 (금)
 * author : develiberta
 * number : 15596
 *
 * [단계]
 * 06. 함수
 * [제목]
 * 01. 정수 N개의 합 (15596)
 * [문제]
 * 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
 * 작성해야 하는 함수는 다음과 같다.
 * Java: long sum(int[] a); (클래스 이름: Test)
 * a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
 * 리턴값: a에 포함되어 있는 정수 n개의 합
 */
public class _01_15596_SumOfIntegerN {
    private long sum(int[] a) {
        long sum = 0;
        for (int i=0; i<a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
