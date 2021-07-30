package step._08_Basic_Math_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* date : 2021-07-23 (금)
 * author : develiberta
 * number : 10757
 *
 * [단계]
 * 08. 기본 수학 1
 * 수학 문제로 수학적 사고력을 길러 봅시다.
 * [제목]
 * 08. 큰 수 A+B (10757)
 * 파이썬 같은 언어는 10,000자리 정도의 자연수도 자유롭게 다룰 수 있습니다. 하지만 C/C++이라면 이 문제를 어떻게 풀까요? C/C++ 사용자가 아니더라도 고민해 보면 좋을 것입니다.
 * [문제]
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 A와 B가 주어진다. (0 < A,B < 10^10000)
 * [출력]
 * 첫째 줄에 A+B를 출력한다.
 * (예제 입력 1)
 * 9223372036854775807 9223372036854775808
 * (예제 출력 1)
 * 18446744073709551615
 */
public class _08_10757_BigNumberAPlusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        /* 범위가 무한인 BigInteger를 사용하는 방법 */
//        BigInteger A = new BigInteger(st.nextToken());
//        BigInteger B = new BigInteger(st.nextToken());
//        BigInteger result = A.add(B);
//        bw.write(String.valueOf(result));

        /* BigInteger가 이용하는 개념인 배열을 이용하는 방법 */
        String A = st.nextToken();
        String B = st.nextToken();
        int newArrayLength = (A.length() > B.length() ? A.length() : B.length()) + 1;
        int[] arrayA = new int[newArrayLength];
        int[] arrayB = new int[newArrayLength];
        int[] result = new int[newArrayLength];
        for (int i=0; i<A.length(); i++) {
            arrayA[newArrayLength - A.length() + i] = A.charAt(i) - '0';
        }
        for (int i=0; i<B.length(); i++) {
            arrayB[newArrayLength - B.length() + i] = B.charAt(i) - '0';
        }
        for (int i=newArrayLength-1; i>0; i--) {
            int element = arrayA[i] + arrayB[i] + result[i];
            result[i] = element % 10;
            result[i-1] = element / 10;
        }
        if (result[0] != 0) bw.write(String.valueOf(result[0]));
        for (int i=1; i<result.length; i++) {
            bw.write(String.valueOf(result[i]));
        }

        br.close();

        bw.flush();
        bw.close();
    }
}