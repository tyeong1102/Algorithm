#include <iostream>
#include <string>
using namespace std;

int main(){
    string s;
    int n;
    cin >> n;

    for(int i=0; i<n; i++){
        int sum = 0;
        int cnt = 0;
        cin >> s;
        for(int j=0; j<s.size(); j++){
            if(s[j] == 'O'){
                cnt++;
                sum += cnt;
            } else{
                cnt = 0;
            }
        }
        cout << sum << '\n';
    }
}