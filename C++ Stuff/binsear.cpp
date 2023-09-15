// performing binary search
#include <iostream>
using namespace std;

int Bsearch(int a[], int size, int element)
{

    int low, mid, high;
    low = 0;
    high = size - 1;

    while (low <= high)
    {
        mid = (low + high) / 2;
        if (a[mid] == element)
        {
            return mid;
        }
        else if (a[mid] <= element)
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }
    return -1;
}

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6};
    int n = sizeof(arr) / sizeof(int);

    int el = 5;

    int searchInd = Bsearch(arr, n, el);
    cout << "Search index of 5 is: " << searchInd;
    return 0;
}

/*
OUTPUT

Search index of 5 is: 4

*/