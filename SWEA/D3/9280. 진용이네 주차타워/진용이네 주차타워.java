import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution {
    public static int TC, n, m;
    public static int[] cost;
    public static int[] empty;
    public static int[] weight;
    public static boolean[] check;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TC = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= TC; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Queue<Integer> q1 = new LinkedList<>(); // 들어오고 나간 순서 저장
            Queue<Integer> q2 = new LinkedList<>(); // 주차될 순서 저장

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            cost = new int[n + 1]; // 요금 저장
            empty = new int[n + 1]; // 빈 자리 확인
            weight = new int[m + 1]; // 차량 무게 저장
            check = new boolean[m + 1]; // 들어왔는지 체크

            for (int i = 1; i <= n; i++) {
                cost[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 1; i <= m; i++) {
                weight[i] = Integer.parseInt(br.readLine());
            }

            int ret = 0;
            for (int i = 1; i <= 2 * m; i++) {
                int in = Integer.parseInt(br.readLine()); // +- 상관 없이 그냥 받음
                q1.add(in);
            }


            while (!q1.isEmpty()) {
                int now = 0;
                int first = 0;

                now = q1.poll();

                if (now > 0) { // 처음 들어오는 거라면
                    q2.add(now); // 대기열에 추가
                    first = q2.peek();

                    for (int i = 1; i <= n; i++) {
                        if (empty[i] == 0) { // 비어있다면
                            empty[i] = first; // 들어온 차 주차
                            ret += cost[i] * weight[first]; // 비용 계산
                            check[now] = true; // 들어왔음으로 true 변경
                            q2.poll(); // 주차 성공 했으니 대기열 제거
                            break;
                        }
                    }
                } else { // 이미 주차된 차라면
                    now = Math.abs(now);
                    for (int i = 1; i <= n; i++) {
                        if (empty[i] == now) { // 주차된 차 번호 찾아서
                            empty[i] = 0; // 빈자리로 만듦
                            if (!q2.isEmpty()) { // 대기하는 차가 있다면
                                now = q2.poll(); // 대기하는 차를 먼저
                                empty[i] = now; // 주차
                                ret += cost[i] * weight[now]; // 비용 계산
                            }
                            break;
                        }
                    }
                }
            }

            System.out.println("#" + test_case + " " + ret);
        }
    }
}