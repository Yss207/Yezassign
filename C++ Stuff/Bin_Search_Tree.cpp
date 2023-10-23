//ASSIGNMENT NO 5 - BINARY SEARCH TREE
#include<iostream>
#include<stdlib.h>

using namespace std;

struct treeNode{
    int data;
    treeNode *left;
    treeNode *right;
};

treeNode* FindMin(treeNode *node){
    if(node==NULL){
        //There is no element in the tree
        return NULL;
    }

    if(node->left){
        //Go to left subtree to find min element
        return FindMin(node->left);
    }
    else{
        return node;
    }
}

treeNode* FindMax(treeNode *node){
    if(node==NULL){
        //There is no element in the tree
        return NULL;
    }

    if(node->right){
        //Go to right subtree to find max element
        return FindMax(node->right);
    }
    else{
        return node;
    }
}

treeNode* Insert(treeNode *node, int data){
    if(node==NULL){
        treeNode *temp;
        temp = new treeNode;
        temp = (treeNode *)malloc(sizeof(treeNode));
        temp ->data = data;
        temp -> left = temp -> right = NULL;
        return temp;
    }

    if(data>(node->data)){
        node -> right = Insert(node->right, data);
    }
    else if(data<(node->data)){
        node->left = Insert(node->left, data);
    }
    /*Else there is nothing to do as the data is already in the tree*/
    return node;
}

treeNode* Delet(treeNode *node, int data){
    treeNode *temp;
    if(node==NULL){
        cout<<"Element not found";
    }
    else if(data<(node->data)){
        node -> left = Delet(node->left, data);
    }
    else if(data>(node->data)){
        node -> right = Delet(node->right, data);
    }
    else{
        if(node->right && node->left){
            temp = FindMin(node->right);
            node->data = temp -> data;
            node->right = Delet(node->right, temp->data);
        }
        else{
            temp = node;
            if(node->left == NULL){
                node = node -> right;
            }
            else if(node->right == NULL){
                node = node -> left;
            }
            free(temp);//temp is no longer required
        }
    }
    return node;
}

treeNode* Find(treeNode *node, int data){
    if(node==NULL){
        //Element isn't found
        return NULL;
    }
    else if(data > (node->data)){
        //Search in the right subtree
        return Find(node->right, data);
    }
    else if(data < (node->data)){
        //Search in left subtree
        return Find(node->left, data);
    }
    else{
        //Element found
        return node;
    }
}

void Inorder(treeNode *node){
    if(node==NULL){
        return;
    }
    Inorder(node->left);
    cout<<node->data<<" ";
    Inorder(node->right);
}

void Preorder(treeNode *node){
    if(node==NULL){
        return;
    }
    cout<<node->data<<" ";
    Preorder(node->left);
    Preorder(node->right);
}

void Postorder(treeNode *node){
    if(node==NULL){
        return;
    }
    Postorder(node->left);
    Postorder(node->right);
    cout<<node->data<<" ";
}

int main(){
    //MAIN PROGRAM BEGINS HERE
    treeNode *root = NULL, *temp;
    int ch, ch1, data1;
    while(1){
        cout<<"\n1.INSERT\n2.DELETE\n3.Inorder\n4.Preorder\n5.Postorder\n6.FindMin\n7.FindMax\n8.Search\n9.Exit\n";

        cout<<"Enter choice: ";
        cin>>ch;

        switch(ch){
            case 1:
             cout <<"\nEnter the number of elements to be inserted: ";
             cin>>ch1;

             for(int i = 0; i<ch1; i++){
                cout<<"\n\tPlease enter "<<i+1<<"th"<<" element: ";
                cin >> data1;
                root = Insert(root, data1);
            }
            cout<<"\n Elements in BST: ";
            Inorder(root);
            break;

            case 2:
             cout<<"\nEnter element to be deleted: ";
             cin>>ch;
             root = Delet(root, ch);
             cout<<"\nAfter deletion elements in BST are: ";
             Inorder(root);
             break;

            case 3:
             cout<<"Inorder traversal: ";
             Inorder(root);
             break;

            case 4:
             cout<<"Preorder traversal: ";
             Preorder(root);
             break;
            
            case 5:
             cout<<"Postorder traversal: ";
             Postorder(root);
             break;

            case 6:
             temp = FindMin(root);
             cout<<"Smallest element in the tree is: "<<temp->data;
             break;

            case 7:
             temp = FindMax(root);
             cout<<"Largest element in the tree is: "<<temp->data;
             break;

            case 8:
             cout<<"\nEnter element to be searched: ";
             cin>>ch;
             temp = Find(root, ch);

             if(temp==NULL){
                cout<<"Element not found";
             }
             else{
                cout<<"Element: "<<temp->data<<" is found\n";
             }
             break;

            case 9:
                 exit(0);
            break;

            default:
             cout<<"Enter correct choice: ";
            break;
        }
    }
    return 0;
}
