//Quicksort part of DSA Assignment 1
#include<iostream>
#include<string.h>

using namespace std;
struct student{
    int rollno;
    string name;
    float sgpa;
};

void show1(student *a[], int n){
    for (int i = 0; i<n ; i++){
        cout<<a[i] -> rollno << " ";
        cout<<a[i] -> name << " ";
        cout<<a[i] -> sgpa << " ";
    }
}

void show2(student *a[], int n){
    for(int i = (n-1); i>=0; i--){
        //change 1: limit changed to i>=0
        cout << a[i] -> rollno <<" ";
        cout<<a[i] -> name <<" ";
        cout<<a[i] -> sgpa <<"\n";
    }
}

int partition(student *a[], int l, int u){

    student *t;
    float p = a[l] -> sgpa;
    int start = l, end = u;

    while((a[start]-> sgpa <= p) && (start < u)){
        start ++;
    }
    while(a[end] -> sgpa > p){
        end--;
    }

    if(start<end){
        swap(a[start], a[end]);
    }
    else{
        t = a[end];
        a[end] = a[l];
        a[l] = t;
        return end;//change 2: end-- converted into end
    }

    return 0;
}

void quickSort(student *a[], int l, int u){
    if(l<u){
        int loc = partition(a, l , u);
        quickSort(a, l, loc-1);
        quickSort(a, loc+1, u);
    }
}

//Main program starts here --> namely int main
int main(){
    int i = 0, n, ch;
    float m;
    student *s[10];//for 10 records to be stored, s[10] should be declared

    cout<<"1. INSERT RECORDS";
    cout<<"\n2. First ten toppers of your class: \n";
    cout<<"Enter your choice: ";
    cin>>n;

    if(n==1){
        cout<<" Enter Details: \n";

        do{
            cout<<"Student: "<<i+1<<" -Record: \n";
            s[i] = new student();
            cout<<"Roll no: ";
            cin>>s[i]->rollno;
            cout<<"Name: ";
            cin>>s[i]->name;
            cout<<"SGPA: ";
            cin>>s[i]->sgpa;

            cout<<"DO YOU WANT TO INPUT MORE RECORDS(Enter 1 if yes)\n";
            cin>>ch;
            i++; 

        }while (ch==1);
        
    }
    
    cout<<"First ten toppers"<<"\n"<<"\n";

    cout<<"Roll No"<<" "<<"Name"<<" "<<"SGPA"<<"\n";

    quickSort(s, 0, i-1);
    show2(s, i);
    return 0;
    

}