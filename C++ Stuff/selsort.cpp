//cpp program of selection sort
#include<iostream>
using namespace std;

int main(){
     int a[] = {5, 4, 3 ,2 ,1};
     int i, j;
     
     int n = sizeof(a)/sizeof(a[0]);
     
     for(i = 0; i<n-1; i++){
         for(j = i+1; j<n; j++){
             if(a[j]<a[i]){
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
   
