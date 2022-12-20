#include <iostream>
using namespace std;

int main(){

    ios_base::sync_with_stdio(false);
	cin.tie(NULL);

    int n, m;
    int cnt = 0;

    cin >> n;

    m = n;

    do{
        m = ((m/10) + (m%10))%10 + (m%10)*10;

        cnt++; 
    }while(m != n);

    cout << cnt;
    return 0;
}