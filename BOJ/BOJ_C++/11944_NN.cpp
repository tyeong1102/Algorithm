#include <iostream>
#include <string>
using namespace std;
/*
문제의 조건을 더 정확히 봐야한다.
답이 길어지는 경우 M자리만 출력한다고 했기 때문에, M보다 작을 경우에는 그냥 출력해주면 되는거다.
그냥 무작정 출력하려고만 해서 출력 초과가 나온 것 같다.
*/
int main(){
    int N, M;
    cin >> N >> M;

    string s = to_string(N);
    string ss;

    for(int i=0; i<N; i++){
        ss += s;
    }

    if(ss.length() > M){
        cout << ss.substr(0, M);
    } else{
        cout << ss;
    }

}   