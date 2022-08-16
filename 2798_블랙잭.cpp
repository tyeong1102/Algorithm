#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int arr[101];

int main(){
    int n, m;
    int sum = 0;
    vector<int> v;
    cin >> n >> m;

    for(int i=0; i<n; i++){
        cin >> arr[i];
    }

    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            for(int k=j+1; k<n; k++){
                sum = arr[i] + arr[j] + arr[k];
                
                if(sum <= m){
                    v.push_back(sum);
                }
            }
        }
    }

    sort(v.begin(), v.end(), greater<>());
    cout << v[0] << '\n';
}