#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};
struct node *head = NULL;
void createlist(int n){
    struct node *newnode,*temp;
    int data,i;
    for(i=1;i<=n;i++){
        newnode = (struct node *)malloc(sizeof(struct node));
        if(newnode == NULL){
            printf("Unable to allocate the memory");
            break;
        }
        else{
            printf("Enter the data of node %d:",i);
            scanf("%d",&data);
            newnode->data = data;
            newnode->next = NULL;
        }
        if (head == NULL)
        {
            head = newnode;
            temp = newnode;
        }
        else{
            temp->next = newnode;
            temp = temp->next;
        }
        
    }
}
void traverselist(){
    struct node *temp;
    if(head == NULL){
        printf("List is empty.");
    }
    else{
        temp = head;
        while(temp != NULL){
            printf("Data = %d\n",temp->data);
            temp = temp->next;
        }
    }
}
void deleteLastNode()
{
    struct node *toDelete, *secondLastNode; 
    toDelete = head;
    secondLastNode = head;
 
    while(toDelete->next != NULL)
     {
       secondLastNode = toDelete;
       toDelete = toDelete->next;
     }
    if(toDelete == head)
     {
       head = NULL;
     }
    else
     {
       secondLastNode->next = NULL;
     }
      
    free(toDelete);
}

 void main(){
    int n;
    printf("Enter the total number of nodes:");
    scanf("%d",&n);
    createlist(n);
    printf("\nData in the list:\n");
    traverselist();
    deleteLastNode();
    printf("\nData after delete operation in the list:\n");
    traverselist();
    
 }