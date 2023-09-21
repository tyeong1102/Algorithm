#include<iostream>

using namespace std;

int main(int argc, char** argv) {
	int test_case;
	int T;
	
	cin >> T;
	
	for(test_case = 1; test_case <= T; ++test_case) {
        int answer = 0;
        int a[11] = {0};

        for(int i = 0; i < 10; i++) {
        	cin >> a[i];
            if(a[i] % 2 == 1) answer += a[i];
        }

        cout << "#" << test_case << " " << answer << '\n';
	}

	return 0;
}