#include <iostream>
#include <string>
using namespace std;

int main(){
    int a, b, c;
    int mul;
    int arr[10] = { };
    cin >> a >> b >> c;

    mul = a * b * c;
    string s = to_string(mul);
    
    for(char ch : s){
        arr[ch - '0']++;
    }

    for(int v : arr){
        cout << v << '\n';
    }
}