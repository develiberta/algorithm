package step._07_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-07-13 (화)
 * author : develiberta
 * number : 01152
 *
 * [단계]
 * 07. 문자열
 * [제목]
 * 06. 단어의 개수 (01152)
 * [문제]
 * 영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다.
 * 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
 * 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 * [입력]
 * 첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다.
 * 이 문자열의 길이는 1,000,000을 넘지 않는다.
 * 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다.
 * 또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다.
 * [출력]
 * 첫째 줄에 단어의 개수를 출력한다.
 * (예제 입력 1)
 * The Curious Case of Benjamin Button
 * (예제 출력 1)
 * 6
 * (예제 입력 2)
 *  Mazatneunde Wae Teullyeoyo
 * (예제 출력 2)
 * 3
 * (예제 입력 3)
 * Teullinika Teullyeotzi
 * (예제 출력 3)
 * 2
 */
public class _06_01152_NumberOfWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String sentence = br.readLine().trim();
        int count = 0;

        if (sentence.equals("") == false) {
            String[] strArray = sentence.trim().split(" ");
            count = strArray.length;
        }

        bw.write("" + count);

        br.close();

        bw.flush();
        bw.close();
    }
}