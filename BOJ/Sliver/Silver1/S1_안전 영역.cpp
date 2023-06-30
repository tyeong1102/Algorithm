/*
	변수 하나하나가 20억이 넘는 큰 수이기 때문에 그냥 20억씩 곱하면 long long의 범위를 벗어나는 큰 수가 된다.
	따라서 2^8 = 2^4 * 2^4이듯 b를 반으로 나눠서 소분해서 계산하고 한번 더 곱해준 다음 %c를 해준다.
	그런데 홀수일 경우에는 누락되는 수가 하나 생기기 때문에 a를 한번 더 곱해주고 %c를 해주는 것으로 한다.
*/

#include <bits/stdc++.h>
using namespace std;

long long a, b, c;

long long go(long long a, long long b){
	if(b == 1) return a % c; // 재귀함수는 기저사례
	long long ret = go(a, b / 2); // 반만 곱함
	ret = (ret * ret) % c; // 한번 더 곱해줌
	if(b % 2 == 1) ret = (ret * a) % c; // 홀수일 경우 한번 더 곱함
	return ret;
}

int main(){
    ios_base::sync_with_stdio(false);
	cin.tie(NULL);
    cout.tie(NULL);

	cin >> a >> b >> c;

	cout <<  go(a, b) << '\n';
    return 0;
}