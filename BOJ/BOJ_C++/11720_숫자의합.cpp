#include <iostream>
using namespace std;

int main(){
    int n;
    int sum = 0; 
    cin >> n;

    char arr[n];
    cin >> arr;

    for(int i=0; i<n; i++){
        sum += arr[i] - '0'; // '0'을 뺴서 문자가 아니라 실제 아스키 코드값에 대응
    }

    cout << sum << '\n';
}