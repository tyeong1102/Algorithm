#include <iostream>
#include <vector>
using namespace std;

int main(){
    int n, k;
    cin >> n >> k;

    vector<int> v;
    for(int i=1; i<=n; i++){
        if(n%i==0){
            v.push_back(i); // 나머지가 0인 것만 배열에 저장
        }
    }
    
    if(k>v.size()){
        cout << "0" << '\n'; // vector 크기보다 크면 범위를 넘어섬으로 0
    } else{
        cout << v[k-1] << '\n'; // 배열은 0부터 시작이라 -1
    }
    
}