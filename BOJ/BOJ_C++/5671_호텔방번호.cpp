#include <iostream>
#include <string>
using namespace std;

int n, m;

bool check(string room){
  int arr[10] = {};
  for(int i = 0; i < room.size(); i++){
    arr[room[i] - '0']++;    
  } 
  for(int i = 0; i < 10; i++){
    if(arr[i] >= 2) {
        return false;
    }
  }
  return true;
}

int main(){
  while(cin >> n >> m){
    int res = 0;
    for(int i = n; i <= m; i++){
      string room = to_string(i);
      if(check(room)) res++;
    }
    cout << res << '\n';
  }
}
