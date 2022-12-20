#include <iostream>
using namespace std;

int main(){
    int n, m;
    cin >> n;

    for(int i=0; i<n; i++){
        int sum = 0;
        cin >> m;
        int arr[m];
        for(int j=0; j<m; j++){
            cin >> arr[j];
            sum += arr[j];
        }
        cout << sum << '\n';
    }
}