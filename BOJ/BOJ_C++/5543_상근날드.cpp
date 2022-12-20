#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int cost;
    vector<int> bur;
    vector<int> bev;

    for(int i=0; i<3; i++){
        cin >> cost;
        bur.push_back(cost);
    }

    for(int i=0; i<2; i++){
        cin >> cost;
        bev.push_back(cost);
    }

    sort(bur.begin(), bur.end());
    sort(bev.begin(), bev.end());

    cout << bur[0] + bev[0] - 50 << '\n';
}