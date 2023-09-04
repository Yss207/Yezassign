//cpp program of bubble sort
#include<iostream>
using namespace std;

int main(){
     int a[] = {5, 4, 3 ,2 ,1};
     int i, j;
     
     int n = sizeof(a)/sizeof(a[0]);
     
     for(i = 0; i<n; i++){
         for(j = i+1; j<n; j++){
             if(a[i]>a[j]){
                 int temp;
                 temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
         }
    }
    
    for(i=0; i<n; i++){
       cout<<a[i]<<" ";
    }
}
   
