package step._09_Basic_Math_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/* date : 2021-07-31 (토)
 * author : develiberta
 * number : 04153
 *
 * [단계]
 * 09. 기본 수학 2
 * 소수와 기하를 다뤄 봅시다.
 * [제목]
 * 09. 직각삼각형 (04153)
 * 피타고라스의 정리에 대해 배우는 문제
 * [문제]
 * 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
 * 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
 * [입력]
 * 입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다.
 * 각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
 * [출력]
 * 각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
 * (예제 입력 1)
 * 6 8 10
 * 25 52 60
 * 5 12 13
 * 0 0 0
 * (예제 출력 1)
 * right
 * wrong
 * right
 */
public class _09_04153_RightTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String input;

        while ((input = br.readLine()).equals("0 0 0") == false) {
            st = new StringTokenizer(input, " ");
            List<Integer> inputList = new ArrayList<>();
            while (st.hasMoreTokens()) {
                inputList.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(inputList);
            if (Math.pow(inputList.get(0), 2) + Math.pow(inputList.get(1), 2) == Math.pow(inputList.get(2), 2)) {
                bw.write("right");
            } else {
                bw.write("wrong");
            }
            bw.write("\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}