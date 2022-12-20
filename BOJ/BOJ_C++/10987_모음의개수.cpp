#include <iostream>
#include <string>
using namespace std;

int main(){
    char arr[5] = {'a', 'e', 'i', 'o', 'u'};
    int cnt = 0;
    string s;
    cin >> s;

    for(int i=0; i<s.size(); i++){
        for(int j=0; j<5; j++){
            if(s[i] == arr[j]){
                cnt++;
            }
        }
    }

    cout << cnt << '\n';
}