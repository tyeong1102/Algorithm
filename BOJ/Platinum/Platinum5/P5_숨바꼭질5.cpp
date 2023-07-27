#include <bits/stdc++.h>
using namespace std;

int n, ans = -987654321;
string s;
vector<int> num;
vector<char> oper;

int operation(char a, int b, int c) {
    if(a == '+') return b + c;
    if(a == '-') return b - c;
    if(a == '*') return b * c;
}

void calc(int here, int _num) {
    // 완전 탐색은 기저 사례를 먼저 만들자
    if(here == num.size() - 1) { // num size 보다 커지기 직전
        ans = max(ans, _num); // max 값
        return;
    }

    calc(here + 1, operation(oper[here], _num, num[here + 1])); // 1번 인덱스에 있는 연산자와 양 옆의 숫자 계산

    if(here + 2 <= num.size() - 1) { // 아직 연산이 더 있다면
        int temp = operation(oper[here + 1], num[here + 1], num[here + 2]); // 뒷 부분 먼저 계산
        calc(here + 2, operation(oper[here], _num, temp)); // 2번 인덱스 먼저 계산한 후 1번 인덱스 계산
    }
    return;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n;
    cin >> s;

    for(int i = 0; i < n; i++) {
        if(i % 2 == 0) num.push_back(s[i] - '0'); // 숫자 저장
        else oper.push_back(s[i]); // 기호 저장
    }

    calc(0, num[0]);

    cout << ans << '\n';
    return 0;
}