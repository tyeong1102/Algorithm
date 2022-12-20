#include <iostream>
#include <queue>
using namespace std;

int main(){
    int t, n, m, imp;
    cin >> t;
    
    for(int i=0; i<t; i++){
        int temp;
        int cnt = 0;
        cin >> n >> m;

        queue<pair<int, int>> q; // index, val
        priority_queue<int> pq;

        for(int j=0; j<n; j++){
            cin >> imp;
            q.push({j, imp});
            pq.push(imp);
        }

        while(!q.empty()){
            int index = q.front().first;
            int val = q.front().second;
            q.pop();

            if(pq.top() == val){
                pq.pop();
                cnt++;
                if(index == m){
                    cout << cnt << '\n';
                    break;
                }
            } else{
                q.push({index, val});
            }
        }
    }
}