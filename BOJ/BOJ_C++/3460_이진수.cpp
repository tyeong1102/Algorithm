/*
처음에는 vector에 나머지 하나 하나를 넣어 인덱스 값을 출력하려고 하였다.
하지만 단순 출력이기 때문에 cnt값을 늘려서 출력하는게 더 좋은 방법인 것 같다.
*/
#include <iostream>
using namespace std;

int main(){
    int t, n;
    cin >> t;

    for(int i=0; i<t; i++){
        cin >> n;

        int cnt = 0;
        while(n != 0){
            if(n%2==1){
                cout << cnt << " ";
            }
            n /= 2;
            cnt++;
        }
        cout << '\n';
    }
}