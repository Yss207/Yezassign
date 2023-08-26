//Program to reverse strings
#include<iostream>
#include<string>
using namespace std;

int main(){
     string Org;
     string Rev = "";
     
     cout << "Please enter string of your choice: ";
     cin >> Org;
     
     
     for(int i = 0; i<Org.length(); i++){
         Rev = Org[i] + Rev;
      }
      
     cout << "Reversed string is: " << Rev <<endl;
     
     return 0;
     
}
