#include <iostream>
using namespace std;
int main()
{
    int i, j, n;
    cout << "Enter any Number:";
    cin >> n;

    int arr[n];
    for (i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    for (i = 1; i < n; i++)
    {
        int temp = arr[i];
        int j = i - 1;
        while (arr[j] > temp && j >= 0)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }
    for (i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    return 0;
}

/*
OUTPUT

Enter any Number:4
2
5
6
1
1 2 5 6

*/