class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int sheep = n * 12000;

        k -= (n / 10);

        int beverage = k * 2000;

        answer = sheep + beverage;

        return answer;
    }
}