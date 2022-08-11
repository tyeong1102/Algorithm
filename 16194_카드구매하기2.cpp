#include <iostream>
#include <vector>
using namespace std;

/*
min을 사용하면 0이 가장 작은 값으로 들어가기 때문에 어떤 수를 넣어도 0이다.
따라서 배열의 초기값을 -1로 설정하고 비어있는 값인지 확인한다.
*/

int main(){
    int n;
    cin >> n;
    vector<int> p(n+1);
    vector<int> d(n+1, -1);

    for(int i=1; i<=n; i++){
        cin >> p[i];
    }

    d[0] = 0;

    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if(d[i] == -1 || d[i] > d[i-j]+p[j]){
                d[i] = d[i-j] + p[j];
            }
        }
    }
    
    cout << d[n] << '\n';
}