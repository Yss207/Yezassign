//Program to reverse numbers input by user
#include<iostream>
using namespace std;

int main(){
      int num, rev, lastd;
      
      cout << "Enter a number of your choice: ";
      cin >> num;
      
      while(num > 0){
         lastd = num % 10;
         rev = (rev * 10) + lastd;
         num = num / 10;
         }
      
      
      cout << "Reversed number is: "<<rev<<endl;
      
      return 0;
      
}
      
