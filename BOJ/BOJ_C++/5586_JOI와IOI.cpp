#include <iostream>
#include <string>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(nullptr);

	int JOI = 0;
    int IOI = 0;
	string s; 
    cin >> s;
	int slen = s.length();
    
	for (int i = 0; i < slen - 2; i++) {
		if (s.substr(i, 3) == "JOI"){
            JOI++;
        } else if(s.substr(i, 3) == "IOI"){
            IOI++;
        } 
	}

	cout << JOI << '\n' << IOI;
}