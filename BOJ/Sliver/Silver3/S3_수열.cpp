/*
    이 문제의 경우 이중 for문을 사용해서 풀게되면 100억이라는 시간 복잡도가 나와 시간 초과가 난다.
    그래서 누적합 방식을 사용해야 하는데, '누적된 값 - 누적된 값'으로 간단히 구할 수 있다.
*/

#include <bits/stdc++.h>
using namespace std;

int N, K, temp;
int ret = -1000000;
int psum[100001];

int main(){
    ios_base::sync_with_stdio(false);
	cin.tie(NULL);
    cout.tie(NULL);

    cin >> N >> K;

    for(int i = 1; i <= N; i++){
        cin >> temp;
        psum[i] = psum[i - 1] + temp;
    }

    for(int i = K; i <= N; i++){
        ret = max(ret, psum[i] - psum[i - K]);
    }

    cout << ret << '\n';
    
    return 0;
}