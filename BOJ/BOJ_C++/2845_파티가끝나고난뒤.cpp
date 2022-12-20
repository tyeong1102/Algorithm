#include <iostream>
using namespace std;

int main() {
    int n, p,news;
    cin >> n >> p;
    for (int i = 0; i < 5; i++)
    {
        cin >> news;
        cout << news - n*p << ' ';
    }
}