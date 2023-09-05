/*
    int를 사용해도 문제 없지만, 맞왜틀 방지로 1억까지 범위가 커지는 경우 long long 형을 써주도록 하자.
*/

#include<bits/stdc++.h>
using namespace std; 

typedef long long ll;
ll n, k, ret;

int main(){
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); 
    cout.tie(NULL);
	
	cin >> n >> k; 

	vector<pair<ll,ll>> v(n);
	vector<ll> vv(k); 
    priority_queue<ll> pq; 

	for(int i = 0; i < n; i++) {
		cin >> v[i].first >> v[i].second; 
	}
	for(int i = 0; i < k; i++) {
        cin >> vv[i];
    }  

	sort(v.begin(), v.end());
	sort(vv.begin(), vv.end());
	
	
	int cnt = 0; 

	for(int i = 0; i < k; i++) {
		while(cnt < n && v[cnt].first <= vv[i]) {
            pq.push(v[cnt].second);
            cnt++;
        } 

		if(pq.size()) {
			ret += pq.top(); 
            pq.pop();
		}
	} 

	cout << ret << "\n"; 
	return 0;
}     