import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    private static class Point {
        public final long x, y; // 문제에서 좌표의 범위가 주어지지 않아 long으로 함.
        private Point(long x, long y) { // 생성자로 초기화
            this.x = x;
            this.y = y;
        }
    }

    // 교점 좌표 구하기
    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        // 교점 구하는 식
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        if(x % 1 != 0 || y % 1 != 0) return null; // 나누어 떨어지지 않았다는 것은 교점이 아니므로 null

        return new Point((long) x, (long) y);
    }

    // 가장 작은 좌표
    private Point getMinimumPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for(Point p : points) {
            if(p.x < x) x = p.x;
            if(p.y < y) y = p.y;
        }

        return new Point(x, y);
    }

    // 가장 큰 좌표
    private Point getMaximumPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for(Point p : points) {
            if(p.x > x) x = p.x;
            if(p.y > y) y = p.y;
        }

        return new Point(x, y);
    }

    public String[] solution(int[][] line) {

        List<Point> points = new ArrayList<>();

        for(int i = 0; i < line.length; i++) {
            for(int j = i + 1; j < line.length; j++) {
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);
                if(intersection != null) {
                    points.add(intersection);
                }
            }
        }

        // 2차원 배열의 크기 결정
        Point minimum = getMinimumPoint(points);
        Point maximum = getMaximumPoint(points);

        int width = (int) (maximum.x - minimum.x + 1);
        int height = (int) (maximum.y - minimum.y + 1);

        char[][] arr = new char[height][width];
        for(char[] row : arr) {
            Arrays.fill(row, '.');
        }

        // 2차원 배열에 *찍기
        for(Point p : points) {
            int x = (int) (p.x - minimum.x);
            int y = (int) (maximum.y - p.y);
            arr[y][x] = '*';
        }

        // String 배열로 반환
        String[] answer = new String[arr.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = new String(arr[i]);
        }
        return answer;
    }
}