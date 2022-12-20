#include <iostream>
#include <vector>
using namespace std;

void isPrime1(int m, int n){
    const int maxNum = 1000000;
    bool isPrime[maxNum+1];
    int sum = 0;
    vector<int> v;

    isPrime[0] = isPrime[1] = 0;
    
    for(int i=2; i<=maxNum; i++){ 
        isPrime[i] = i;
    }

    for(int i=2; i<=maxNum; i++){
        if(isPrime[i]==0){
            continue;
        }
        for(int j=i*2; j<=maxNum; j+=i){
            isPrime[j] = 0;
        }
    }

    for(int i=m; i<=n; i++){
        if(isPrime[i]!=0){
            sum += i;
            v.push_back(i);
        }
    }
    if(sum!=0){
        cout << sum << '\n';
        cout << v[0] << '\n'; // 이 부분이 if문 밖에 있어서 sum이 0일때도 계산되어 OutOfBounds가 나옴
    }
    
    if(sum==0){
        cout << "-1" << '\n';
    }
}

int main(){
    int m, n;
    cin >> m >> n;

    isPrime1(m, n);
}