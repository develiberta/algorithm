package step._07_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* date : 2021-07-11 (일)
 * author : develiberta
 * number : 02675
 *
 * [단계]
 * 07. 문자열
 * 문자열을 다루는 문제들을 해결해 봅시다.
 * [제목]
 * 04. 문자열 반복 (02675)
 * 각 문자를 반복하여 출력하는 문제
 * [문제]
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
 * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
 * S에는 QR Code "alphanumeric" 문자만 들어있다.
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 * [입력]
 * 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다.
 * 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다.
 * S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
 * [출력]
 * 각 테스트 케이스에 대해 P를 출력한다.
 * (예제 입력 1)
 * 2
 * 3 ABC
 * 5 /HTP
 * (예제 출력 1)
 * AAABBBCCC
 * /////HHHHHTTTTTPPPPP
 */
public class _04_02675_StringRepeat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int cntRepeat = Integer.parseInt(st.nextToken());
            String strRepeat = st.nextToken();
            for (int j=0; j<strRepeat.length(); j++) {
//                for (int k=0; k<cntRepeat; k++) {
//                    sb.append(strRepeat.charAt(j));
//                }
                sb.append(strRepeat.substring(j, j+1).repeat(cntRepeat));
            }
            sb.append("\n");
        }

        bw.write("" + sb);

        br.close();

        bw.flush();
        bw.close();
    }
}