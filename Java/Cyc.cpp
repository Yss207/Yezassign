#include<iostream>
using namespace std;

void swapNums(int &x, int &y, int&z) {
  int temp = 0;
  temp = z;
  z = y;
  y = x;
  x = temp;
  }
  

int main() {
  int firstNum = 10;
  int secondNum = 20;
  int numthr = 30;

  cout << "Before swap: " << "\n";
  cout << firstNum << secondNum << numthr << "\n";

  swapNums(firstNum, secondNum, numthr);

  cout << "After swap: " << "\n";
  cout << firstNum << secondNum << numthr<< "\n";

  return 0;
}
