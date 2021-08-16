package step._12_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/* date : 2021-08-16 (월)
 * author : develiberta
 * number : 11651
 *
 * [단계]
 * 12. 정렬
 * 배열의 원소를 순서대로 나열하는 알고리즘을 배워 봅시다.
 * [제목]
 * 07. 좌표 정렬하기 2 (11651)
 * 좌표를 다른 순서로 정렬하는 문제
 * [문제]
 * 2차원 평면 위의 점 N개가 주어진다.
 * 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다.
 * 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다.
 * (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
 * [출력]
 * 첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
 * (예제 입력 1)
 * 5
 * 0 4
 * 1 2
 * 1 -1
 * 2 2
 * 3 3
 * (예제 출력 1)
 * 1 -1
 * 1 2
 * 2 2
 * 3 3
 * 0 4
 */
public class _07_11651_CoordinateSort2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Coordinate2> priorityQueue = new PriorityQueue<>();

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            priorityQueue.add(new Coordinate2(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        for (int i=0; i<N; i++) {
            bw.write(priorityQueue.poll().toString());
        }

        br.close();

        bw.flush();
        bw.close();
    }
}

class Coordinate2 implements Comparable<Coordinate2> {

    private int x;
    private int y;

    public Coordinate2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Coordinate2 o) {
        if (this.y != o.y) return this.y - o.y;
        return this.x - o.x;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        return sb.append(x).append(" ").append(y).append("\n").toString();
    }
}