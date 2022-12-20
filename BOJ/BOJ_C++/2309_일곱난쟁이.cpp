#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int n;
    int sum = 0;
    vector<int> v;

    for(int i=0; i<9; i++){
        cin >> n;
        sum += n;
        v.push_back(n);
    }

    sort(v.begin(), v.end());

    for(int i=0; i<9; i++){
        for(int j=i+1; j<9; j++){
            if(sum - (v[i]+v[j]) == 100){
                for(int k=0; k<9; k++){
                    if(k!=i && k!=j){
                        cout << v[k] << '\n';
                    }
                }
                return 0;
            }
        }
    }
    return 0;
}