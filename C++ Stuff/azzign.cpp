#include<iostream>
#include<string.h>
#include<list>

using namespace std;


struct student{
  	int rollno;
  	char name[20];
  	float SGPA;
};

void accept(struct student list[5]);
void display(struct student list[80]);
void bubblesort(struct student list[5]);

int main(){
    struct student data[20];
    const int size=5;

    accept(data);
    cout<<"\n Bubble Sort";
    bubblesort(data);
    display(data);
}

void accept(struct student list[5]){
     int i;
     for(i = 0; i<5; i++){
         cout<<"Enter roll no., name & SGPA: ";
         cin>>list[i].rollno>>list[i].name>>list[i].SGPA;
     }
}

void display(struct student list[80]){
     int i;
     cout<<"\n roll no.\tname\tSGPA\n";
     for(i = 0; i<5; i++){
       cout<<"\n"<<list[i].rollno<<"\t"<<list[i].name<<"\t"<<list[i].SGPA<<endl;
     }
}

void bubblesort(struct student list[5]){
     int i, j,size=5;
     struct student temp;
     for(i = 0; i<size -1; i++){
         for(j = 0; j<(size-1-i); j++){
            if(list[j].rollno>list[j+1].rollno){
                temp = list[j];
                list[j] = list[j+1];
                list[j+1] = temp;
            }
       }
   }
}

  	
