package step._05_OneDimensionArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* date : 2021-07-08 (목)
 * author : develiberta
 * number : 08958
 *
 * [단계]
 * 05. 1차원 배열
 * 배열을 사용해 봅시다.
 * [제목]
 * 06. OX퀴즈 (08958)
 * OX 퀴즈의 결과를 일차원 배열로 입력받아 점수를 계산하는 문제
 * [문제]
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다.
 * O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
 * 예를 들어, 10번 문제의 점수는 3이 된다.
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 테스트 케이스의 개수가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다.
 * 문자열은 O와 X만으로 이루어져 있다.
 * [출력]
 * 각 테스트 케이스마다 점수를 출력한다.
 * (예제 입력 1)
 * 5
 * OOXXOXXOOO
 * OOXXOOXXOO
 * OXOXOXOXOXOXOX
 * OOOOOOOOOO
 * OOOOXOOOOXOOOOX
 * (예제 출력 1)
 * 10
 * 9
 * 7
 * 55
 * 30
 */
public class _06_08958_OXQuiz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum;

        for (int i=0; i<N; i++) {
            sum = 0;
            String input = br.readLine();
            int[] array = new int[input.length()];

            for (int j=0; j<array.length; j++) {
                if (input.charAt(j) == 'O') {
                    if (j == 0) {
                        array[j] = 1;
                    } else {
                        array[j] = array[j-1] + 1;
                    }
                } else {
                    array[j] = 0;
                }

                sum += array[j];
            }
            bw.write(sum + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
