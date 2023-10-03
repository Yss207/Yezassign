// Performing bubble sort on my own after understanding the underlying concept!!!
// 30-09-2023
#include <iostream>
using namespace std;

int main()
{
    int n;
    int arr[100] = {};

    cout << "Enter number of elements in array: ";
    cin >> n;

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    // Outer for loop is for number of passes i.e. (n-1) times.
    // Inner for loop is for number of comparisons i.e. (n-1) times as well.
    // Code is being written with the perspective of a layman. Not very optimised.

    for (int i = 0; i < (n - 1); i++)
    {
        for (int j = 0; j < (n - 1); j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int temp;
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    // Array for displaying the sorted array.
    cout << "Bubble sort performed...\n";

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
}

/*
OUTPUT
Enter number of elements in array: 5
1 9 3 2 4
Bubble sort performed...
1 2 3 4 9

*/