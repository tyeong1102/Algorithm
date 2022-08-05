#include <iostream>
#include <queue>
using namespace std;

int main(){

    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n, x;
    cin >> n;
    priority_queue<int, vector<int>, greater<int>> pq; // 오름차순으로 정렬
    

    while(n--){
        cin >> x;
        if(x != 0){
            pq.push(x);
        } else{
            if(pq.empty()){
                cout << 0 << '\n';
            } else{
                cout << pq.top() << '\n';
                pq.pop();
            }
        }
    }
}