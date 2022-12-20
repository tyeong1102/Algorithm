#include <iostream>
using namespace std;

/*
대각선 교점의 개수는 nC4로 구할 수 있다.
하나의 교차점을 만들기 위해서는 2개의 선분이 필요한데 이는 4개의 꼭지점이 필요하기 때문이다.
*/

int main(){
   int n;
   cin >> n;

   cout << (n * (n-1) * (n-2) * (n-3)) / 24;
}