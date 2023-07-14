/*
    우선 문제를 봤을 때 무식하게 풀기를 생각해야 한다.
    만약 그렇게 생각을 했는데 범위가 너무 커서 시간 복잡도가 커질 것 같으면 dp, 이분탐색, 그리디 등이 생각나야 한다.
*/

#include<bits/stdc++.h>
using namespace std;

int n; 

int main() {
    cin >> n; 

    int i = 666; 

    for(;; i++){ // 무한루프
        if(to_string(i).find("666") != string::npos) n--; 
        if(n == 0) break;
    }

    cout << i << "\n"; 
}