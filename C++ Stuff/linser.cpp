#include <iostream>
using namespace std;

int Linearsearch(int arr[], int n, int key)
{
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == key)
        {
            return i;
        }
    }
    return -1;
}

int main()
{
    int n;
    cout << "Enter any No.:";
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int key;
    cout << "Enter an element which index to be find out:";
    cin >> key;

    cout << Linearsearch(arr, n, key) << endl;
}

/*
OUTPUT

Enter any No.:4
1
2
3
4
Enter an element which index to be find out:3
2

*/