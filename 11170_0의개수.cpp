#include <iostream>
using namespace std;
/*
정수로 생각하면 자릿수를 고려하고 복잡하지만, 문자열로 생각하면 단순 비교만 해주면 되기 때문에 간단하다.
*/

int main(){
    int t;
    cin >> t;

    for(int i=0; i<t; i++){
        int n, m;
        cin >> n >> m;

        int cnt = 0;

        for(int j=n; j<=m; j++){
            string s = to_string(j);
            for(int k=0; k<s.size(); k++){
                if(s[k] == '0'){
                    cnt++;
                }
            }
        }
        cout << cnt << '\n';
    }
}