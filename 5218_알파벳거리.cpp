#include <iostream>
#include <string>
using namespace std;
/*
처음에는 26개의 고정 배열을 만들어서 했더니 50%에서 계속 틀렸다는 결과가 나왔다.
문자열의 크기에 맞게 생성되어야 하는데 그러지 않아서 오류가 난 것 같다.
*/

int main(){
    int t;
    cin >> t;

    for(int i=0; i<t; i++){
        string x, y;
        cin >> x >> y;

        if(x.size() == y.size()){
            int *arr = new int[x.size()];
            for(int j=0; j<x.size(); j++){
                if(y[j] > x[j]){
                    arr[j] = y[j] - x[j];
                } else if(x[j] > y[j]){
                    arr[j] = (y[j]+26) - x[j];
                }
            }
            cout << "Distances: ";
            for(int i=0; i<x.size(); i++){
                cout << arr[i] << ' ';
            }
            cout << '\n';
        }
    }
}