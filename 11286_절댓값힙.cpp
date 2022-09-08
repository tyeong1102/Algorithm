#include <iostream>
#include <queue>
#include <vector>
using namespace std;

struct cmp{
    bool operator()(int a, int b){
        if(abs(a) == abs(b)){ // abs()를 통해 절댓값 비교
            return a > b;
        } else{
            return abs(a) > abs(b);
        }
    }
};

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    priority_queue<int, vector<int>, cmp> pq;
    int n;
    cin >> n;

    while(n--){
        int x;
        cin >> x;

        if(x == 0){
            if(pq.empty()){
                cout << 0 << '\n';
            } else{
                cout << pq.top() << '\n';
                pq.pop();
            }
        } else{
            pq.push(x);
        }
    }
}