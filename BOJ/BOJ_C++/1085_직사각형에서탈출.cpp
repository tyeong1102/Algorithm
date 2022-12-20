#include <iostream>
#include <algorithm>
using namespace std;

// min 함수 사용

int main(){
    int x, y, w, h;
    cin >> x >> y >> w >> h;

    int res1 = min(w-x, h-y);
    int res2 = min(x, y);

    cout << min(res1, res2);
}