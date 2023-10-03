// Performing insertion sort on my own for the first time!!!!
// 01-10-2023

#include <iostream>
using namespace std;

int main()
{
    int arr[100], n, j;

    cout << "Enter number of elements to be input in array: ";
    cin >> n;

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    // Outer for loop starts from index 1. We consider 1st element here to be already sorted.
    // Inner for loop will perform swapping based on the condition mentioned in the loops

    for (int i = 1; i < n; i++)
    {
        int temp = arr[i];
        j = i - 1;

        while (j >= 0 && arr[j] > temp)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }

    // Sorted array...
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
}

/*
OUTPUT
Enter number of elements to be input in array: 5
7 9 1 3 2
1 2 3 7 9
*/