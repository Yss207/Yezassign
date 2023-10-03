// Performing the toughest of the sorts, Quick sort on my own!!!
// 02-10-2023
// To be noted, here pivot is the first element in the array.
#include <iostream>
using namespace std;
// Partition function...

int Partition(int arr[], int lb, int ub)
{
    int pivot = arr[lb];
    int start = lb;
    int end = ub;
    int temp;

    while (start < end)
    {
        while (arr[start] <= pivot)
        {
            start++;
        }
        while (arr[end] > pivot)
        {
            end--;
        }

        if (start < end)
        {

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
    temp = arr[lb]; // Don't write pivot instead of arr[lb]. Scariest shit ever.
    arr[lb] = arr[end];
    arr[end] = temp;

    return end;
}

// Quicksort function
void Qsort(int arr[], int lb, int ub)
{
    int loc;

    if (lb < ub)
    {
        loc = Partition(arr, lb, ub);

        Qsort(arr, lb, loc - 1);
        Qsort(arr, loc + 1, ub);
    }
}

int main()
{
    int x[] = {5, 3, 9, 1, 2, 6};
    int n;

    n = 6;

    cout << "Array before sorting...";

    for (int i = 0; i < n; i++)
    {
        cout << x[i] << " ";
    }

    Qsort(x, 0, n - 1);

    cout << "\nAfter Quick Sort: ";

    for (int i = 0; i < n; i++)
    {
        cout << x[i] << " ";
    }
}

/*
OUTPUT(Just in case)
Array before sorting...5 3 9 1 2 6
After Quick Sort: 1 2 3 5 6 9
*/