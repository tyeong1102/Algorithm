#include <iostream>
using namespace std;

int n, p;
int visited[1001];

void rem(int num){
    if(visited[num] < 2){
        visited[num]++;
        rem(num * n % p);
    }
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int cnt = 0;
    cin >> n >> p;

    rem(n);

    for(int i=0; i<p; i++){
        if(visited[i] >= 2){
            cnt++;
        }
    }

    cout << cnt << '\n';
}