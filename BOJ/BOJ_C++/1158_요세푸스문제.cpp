#include <iostream>
#include <queue>
using namespace std;

int main(){
    int n, k, tmp;
    queue<int> q;

    cin >> n >> k;
    
    for(int i=1; i<=n; i++){
        q.push(i);
    }

    cout << "<";

    while(q.size() > 1){ // !q.empty()라고 할 경우 0까지 계산이됨
        for(int i=0; i<k-1; i++){
            tmp = q.front();
            q.push(tmp);
            q.pop();
        }

        tmp = q.front();
        cout << tmp << ", ";
        q.pop();
    }

    tmp = q.front();
    cout << tmp << ">";
}