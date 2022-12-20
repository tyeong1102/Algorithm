#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
/*
쓸데없이 vector 안쓰고 10짜리 배열을 만들었으면 더 간단했다.
*/
int main(){
    vector<int> v;
    vector<int> vv;
    int w, k;
    int sum1 = 0;
    int sum2 = 0;

    for(int i=0; i<10; i++){
        cin >> w;
        v.push_back(w);
    }

    sort(v.begin(), v.end(), greater<>());

    for(int i=0; i<10; i++){
        cin >> k;
        vv.push_back(k);
    }

    sort(vv.begin(), vv.end(), greater<>());

    for(int i=0; i<3; i++){
        sum1 += v[i];
        sum2 += vv[i];
    }

    cout << sum1 << " " << sum2;
}