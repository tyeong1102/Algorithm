#include <iostream>
using namespace std;

int main() {
    int mn, index; 
    int sum = 0;
    int cnt = 0; 
    int max = 0;
    int arr1[10]; 
    int arr2[10];
    int arr3[10];
    
    for (int i = 0; i < 10; i++)
    {
        cin >> arr1[i];
        sum += arr1[i];
    }
    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < 10; j++)
        {
            mn = arr1[i];
            arr2[i] = arr1[i];
            if (arr1[j] == mn)
            {
                cnt++;
            }
        }
        arr3[i]= cnt;
        cnt = 0;
    }
    for (int i = 0; i < 10; i++)
    {
        if (arr3[i] > max)
        {
            max = arr3[i];
            index = arr2[i];
        }
    }
    cout << sum/10 << '\n'; 
    cout << index << '\n';
}