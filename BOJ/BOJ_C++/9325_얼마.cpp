#include <iostream>
using namespace std;

int main(){
    int t; // 테스트 케이스
    cin >> t;

    for(int i=0; i<t; i++){
        int s, n; // 자동차 가격, 옵션
        int sum = 0;
        int total = 0;
        cin >> s >> n;

        for(int j=0; j<n; j++){
            int q, p;
            cin >> q >> p; // 옵션 개수, 가격
            sum += q * p;
        }
        total = sum + s; // 총 가격
        cout << total << '\n';
    }

}