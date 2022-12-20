#include <iostream>
using namespace std;

int main(){
    int m, n;
    int small = 10000; // 최대를 최소일 때로 설정해야 줄어듦
    int arr[10000]; // 10000이하의 자연수이기 때문에 배열도 10000이상 불가능
    int sum = 0;
    cin >> m >> n;

    for(int i=0; i<n; i++){
        arr[i] = i*i; // n까지의 모든 배열 생성
    }

    for(int i=1; i<n; i++){ // 만약 i가 아닌 변수를 사용하면 최소값이 검출되지 않음
        if(m<=arr[i] && arr[i]<=n){ // 범위 내의 arr값
            sum += arr[i]; // arr의 결과 합
            small = min(small, arr[i]); // min으로 더 작은 값
        }
    }

    if(sum==0){
        cout << "-1" << '\n'; // sum결과가 없을 경우 제곱수가 없는 것이기 때문에 -1
    } else{
        cout << sum << '\n';
        cout << small << '\n';
    }
}