#include <bits/stdc++.h>
using namespace std;

bool che[4000001]; // 소수인지 판별하는 boolean문
int n, a[2000001], sum, ret, p, hi, lo; // a배열에 소수로 판정된 수 저장

int main() {
    cin >> n;

    for(int i = 2; i <= n; i++) {
        if(che[i]) continue;

        for(int j = 2 * i; j <= n; j += i) {
            che[j] = 1;
        }
    }

    for(int i = 2; i <= n; i++) {
        if(!che[i]) a[p++] = i; // 소수인 수를 a배열에 저장
    }

    while(1) {
        if(sum >= n) sum -= a[lo++]; // sum이 n보다 큰 것이기 때문에 lo를 한칸 이동시켜 뺌
        else if(hi == p) break;
        else sum += a[hi++]; // sum이 더 작은 것이기 때문에 hi를 이동시켜 더함

        if(sum == n) ret++; // n과 같은 sum이 나오면 하나 증가
    }

    cout << ret << '\n';
}