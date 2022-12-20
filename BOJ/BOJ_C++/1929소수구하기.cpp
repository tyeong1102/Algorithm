#include <iostream>
using namespace std;

void isPrime1(int m, int n){
    const int maxNum = 1000000;
    bool isPrime[maxNum+1];

    isPrime[0] = isPrime[1] = 0;
    
    for(int i=2; i<=maxNum; i++){ 
        // 처음에는 i=0이라고 설정하고 해서 89%에서 오류가 남
        // 위에서 0과 1을 초기화 했지만 이 코드에서 isPrime[0]과 isPrime[1]을 다시 만들었기 때문에 오류
        // i의 시작 범위를 2로 해서 해결
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
            cout << i << '\n';
        }
    }
}

int main(){
    int m, n;
    cin >> m >> n;

    isPrime1(m, n);

}