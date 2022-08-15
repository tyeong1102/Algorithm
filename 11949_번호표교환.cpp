#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int n, m;
    cin >> n >> m;

    vector<int> v(n+5);

    for(int i=1; i<=n; i++){
        cin >> v[i];
    }

    for(int i=1; i<=m; i++){
        for(int j=0; j<n; j++){
            if(v[j]%i > v[j+1]%i){
                swap(v[j], v[j+1]);
            }
        }
    }

    for(int i=1; i<=n; i++){
        cout << v[i] << '\n';
    }
}