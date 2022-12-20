#include <iostream>
#include <queue>
#include <vector>
using namespace std;

int main(){
    int n, x;
    cin >> n;
    priority_queue<int> pq; // 디폴트는 오름차순
    vector<int> v;

    while(n--){
        cin >> x;
        if(x != 0){ // 0이 아닌 경우
            pq.push(x);
        } else{ // 0인 경우
            if(pq.empty()){
                v.push_back(0);
            } else{
                v.push_back(pq.top()); // queue의 맨위를 vector에 넣음
                pq.pop(); // queue에서 제거
            }
        }
    }
    for(int i=0; i<v.size(); i++){
        cout << v[i] << '\n';
    }
}