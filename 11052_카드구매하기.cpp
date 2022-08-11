#include <iostream>
#include <vector>
using namespace std;

int main(){
    int n;
    cin >> n;
    vector<int> p(n+1);
    vector<int> d(n+1);

    for(int i=1; i<=n; i++){
        cin >> p[i];
    }

    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            d[i] = max(d[i], d[i-j]+p[j]);
            // i-j만큼의 카드를 최대값으로 구매하고 마지막 j개를 구매 하였을 때
        }
    }
    
    cout << d[n] << '\n';
}