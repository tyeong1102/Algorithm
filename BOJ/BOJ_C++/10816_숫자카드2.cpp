#include <iostream>
#include <vector>
#include <algorithm>
#include <unordered_map>
using namespace std;

unordered_map <int, int> m;
int N, M, card;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> card;
		m[card]++;
	}
	cin >> M;
	for (int i = 0; i < M; i++) {
		cin >> card;
		cout << m[card] << " ";
	}
}