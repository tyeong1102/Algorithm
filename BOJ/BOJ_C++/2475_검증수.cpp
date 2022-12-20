#include <iostream>
using namespace std;

int main(){
    int n;
    int result = 0;

    for(int i=0; i<5; i++){
        cin >> n;
        result += n * n;
    }

    result %= 10;
    cout << result << '\n';

}