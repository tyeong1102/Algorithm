#include <iostream>
#include <queue>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int n;
    cin >> n;

    queue<int> q;

    while(n--){
        string s;
        cin >> s;

        if(s == "push"){
            int n;
            cin >> n;
            q.push(n);
        } else if(s == "pop"){
            if(q.empty()){
                cout << -1 << '\n';
            } else{
                cout << q.front() << '\n';
                q.pop();
            }
        } else if(s == "front"){
            if(q.empty()){
                cout << -1 << '\n';
            } else{
                cout << q.front() << '\n';
            }
        } else if(s == "back"){
            if(q.empty()){
                cout << -1 << '\n';
            } else{
                cout << q.back() << '\n';
            }
        } else if(s == "empty"){
            if(q.empty()){
                cout << 1 << '\n';
            } else{
                cout << 0 << '\n';
            }
        } else if(s == "size"){
            cout << q.size() << '\n';
        }
    }
}