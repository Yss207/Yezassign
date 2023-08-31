#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void removeSpCh(string);

int main()
{
    string x;
    cout << "Enter string of your choice: " << endl;
    cin >> x;

    removeSpCh(x);

    return 0;
}

void removeSpCh(string s)
{

    string t = "";
    for (int i = 0; i < s.length(); i++)
    {
        if ((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z'))
        {
            t += s[i];
        }
    }

    cout << t << endl;
}