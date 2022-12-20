#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int k, n, score;
    cin >> k;

    for(int i=0; i<k; i++){
        int min = 0;
        cout << "Class " << i+1 <<'\n';
        cin >> n;
        vector<int> v;
        vector<int> vv;
        for(int j=0; j<n; j++){
            cin >> score;
            v.push_back(score);
        }

        sort(v.begin(), v.end());

        for(int i=1; i<n; i++){
            min = v[i] - v[i-1];
            vv.push_back(min);
        }

        sort(vv.begin(), vv.end(), greater<>());

        cout << "Max " << v[n-1] << ", Min " << v[0] << ", Largest gap " << vv[0] << '\n';
    }
}