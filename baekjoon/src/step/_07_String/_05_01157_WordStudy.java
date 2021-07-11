package step._07_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-07-11 (일)
 * author : develiberta
 * number : 01157
 *
 * [단계]
 * 07. 문자열
 * [제목]
 * 05. 단어 공부 (01157)
 * [문제]
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 * [입력]
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다.
 * 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * [출력]
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
 * 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 * (예제 입력 1)
 * Mississipi
 * (예제 출력 1)
 * ?
 * (예제 입력 2)
 * zZa
 * (예제 출력 2)
 * Z
 * (예제 입력 3)
 * z
 * (예제 출력 3)
 * Z
 * (예제 입력 4)
 * baaa
 * (예제 출력 4)
 * A
 */
public class _05_01157_WordStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int charMax = 0;
        boolean uniqueMax = false;

        int[] count = new int[26];

        String word = br.readLine().toUpperCase();

        for (int i=0; i<word.length(); i++) {
            count[word.charAt(i)-'A']++;
        }

        for (int i=0; i<count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                charMax = i;
                uniqueMax = true;
            } else if (count[i] == max) {
                uniqueMax = false;
            }
        }

        bw.write("" + (String.format("%c", uniqueMax ? charMax + 'A' : '?')));

        br.close();

        bw.flush();
        bw.close();
    }
}