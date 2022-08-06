#include <iostream>
#include <algorithm>
using namespace std;

/*
처음에는 vector와 sort를 써서 오름차순으로 정렬했는데 메모리 초과가 나왔다.
메모리 제한이 8MB라서 10,000,000개의 수를 다 입력 받을 수 없었다.
그래서 input을 배열의 인덱스 값으로 넣고 count를 증가시켜 몇개가 들어갔는지 확인하고,
배열의 count값 만큼 0부터 오름차순으로 출력하였다.
*/

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    int arr[10001] = {};
    cin >> n;

    for(int i=0; i<n; i++){
        int input;
        cin >> input;
        arr[input]++;
    }

    for(int i=0; i<10001; i++){
        if(arr[i]){
            for(int j=0; j<arr[i]; j++){
                cout << i << '\n';
            }
        }
    }
}