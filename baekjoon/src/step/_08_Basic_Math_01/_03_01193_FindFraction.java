package step._08_Basic_Math_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-07-17 (토)
 * author : develiberta
 * number : 01193
 *
 * [단계]
 * 08. 기본 수학 1
 * [제목]
 * 03. 분수 찾기 (01193)
 * [문제]
 * 무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
 * 1/1	1/2	1/3	1/4	1/5	…
 * 2/1	2/2	2/3	2/4	…	…
 * 3/1	3/2	3/3	…	…	…
 * 4/1	4/2	…	…	…	…
 * 5/1	…	…	…	…	…
 * …	…	…	…	…	…
 * 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> …
 * 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
 * [출력]
 * 첫째 줄에 분수를 출력한다.
 * (예제 입력 1)
 * 14
 * (예제 출력 1)
 * 2/4
 */
public class _03_01193_FindFraction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int group = 1;          // 군의 인덱스
//        int firstInGroup = 1;   // 군의 첫번째 수의 인덱스
        int lastInGroup = 1;    // 군의 마지막 수의 인덱스
        int numerator;          // 분자
        int denominator;        // 분모
        
//        while (firstInGroup + group <= N) {
//            firstInGroup += group++;
//        }
//
//        if (group % 2 == 1) {
//            denominator = N - firstInGroup + 1;
//            numerator = (group + 1) - denominator;
//        } else {
//            numerator = N - firstInGroup + 1;
//            denominator = (group + 1) - numerator;
//        }

        while (N > lastInGroup) {
            lastInGroup += ++group;
        }
        if (group % 2 == 0) {
            numerator = N - (lastInGroup - group);
            denominator = (group + 1) - numerator;
        } else {
            denominator = N - (lastInGroup - group);
            numerator = (group + 1) - denominator;
        }

        bw.write(numerator + "/" + denominator);

        br.close();

        bw.flush();
        bw.close();
    }
}