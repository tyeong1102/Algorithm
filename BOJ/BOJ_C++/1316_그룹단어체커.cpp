#include <iostream>
#include <string>
using namespace std;

int main(){
    int n;
    int cnt = 0;
    string s;
    cin >> n;

    for(int i=0; i<n; i++){
        int arr[26] = {0};
        cin >> s;
        arr[(int)(s[0])-97] = 1;

        for(int j=1; j<s.size(); j++){
            if(s[j] == s[j-1]){
                continue;
            } else{ // s[j]와 s[j-1]이 다를 때
                // 이미 s[j]가 이전에 나왔을 때 그룹단어가 아니므로 종료
                if(arr[s[j]-97]==1){
                    cnt++;
                    break;
                } else{ // 새로 나왔을 때 arr값 += 1
                    arr[s[j]-97] = 1;
                }
            }
        }
    }
    cout << n - cnt << endl;
}