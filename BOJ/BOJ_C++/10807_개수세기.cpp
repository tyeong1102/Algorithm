#include <iostream>
using namespace std;

int main(){
    int n, m, v;
    int arr[201] = {}; // 문제의 범위 확실히 확인
    cin >> n;
    
    for(int i=0; i<n; i++){
        cin >> m;
        arr[m+100]++;
    }
    cin >> v;

    cout << arr[v+100] << '\n';
}