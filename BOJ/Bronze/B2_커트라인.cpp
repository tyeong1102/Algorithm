#include <bits/stdc++.h>
using namespace std;

int cnt[101] = {0};
int A, B, C;
int arrive, leave;
int sum = 0;

int main(){
    cin >> A >> B >> C;

    for(int i = 0; i < 3; i++) {
        cin >> arrive >> leave;
        for(int j = arrive; j < leave; j++){
            cnt[j]++;
        }
    }
    
    for(int num : cnt) {
        if(num == 1) sum += A;
        else if(num == 2) sum += 2 * B;
        else if(num == 3) sum += 3 * C;
        else sum += 0;
    }

    cout << sum << '\n';
    return 0;
}