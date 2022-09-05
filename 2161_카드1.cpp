#include <iostream>
#include <queue>
using namespace std;

int main(){
    int n;
    cin >> n;

    queue<int> q;

    for(int i=1; i<=n; i++){
        q.push(i);
    }

    while(!q.empty()){
        int tmp;
        cout << q.front() << ' ';
        q.pop();
        tmp = q.front();
        q.push(tmp);
        q.pop();
    }
}