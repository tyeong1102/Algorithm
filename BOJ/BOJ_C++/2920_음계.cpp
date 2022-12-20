#include <iostream>
using namespace std;

int main(){
    int arr[8];
    int asc = 0;
    int des = 0;

    for(int i=0; i<8; i++){
        cin >> arr[i];

        if(arr[i] == i+1){
            asc++;
        }

        if(arr[i] == 8-i){
            des++;
        }
    }

    if(asc == 8){
        cout << "ascending" << '\n';
    } else if(des == 8){
        cout << "descending" << '\n';
    } else{
        cout << "mixed" << '\n';
    }
}