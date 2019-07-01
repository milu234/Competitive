#include <stdio.h>

struct node {
    long int data;
    struct node *left;
    struct node *right;
};


struct node* insert(long int, struct node*, long int[], long int);
void preordertraversal(struct node*, long int);
long int x = 0; //no of overflow packets
// void preordertraversal(struct node*);
// struct node *root = NULL;
struct node *temp,*ptr;
int main() {
    long int n;
    long int m,i;
    
    scanf("%ld", &n);
    scanf("%ld", &m);
    long int a[m];
    for(i = 0; i < m; i++) {
        scanf("%ld",&a[i]);
    }
    // printf("%ld \n",n);
    struct node *root = insert(0, root, a, m);
    preordertraversal(root, n);
    printf("%ld\n", x);
}

struct node* insert(long int index, struct node *root, long int a[], long int m){
        if(index < m){
            temp=(struct node*)malloc(sizeof(struct node));
            temp->data = a[index];
            root = temp;
            // printf("%ld ", temp->data);
            root->left = insert(2*index + 1, root->left, a, m);
            root->right = insert(2*index + 2, root->right, a, m);
        }
        return root;
        
    }
void preordertraversal(struct node *p, long int n)
{
    // printf("n = %ld \n", n);
    if(p==NULL) {
        x = x+n;
        // printf("x = %ld \n",x);
        return;
    }
    else
    {
        // printf("%d\t",p->data);
        long int rem = n - p->data;
        if(rem <= 0)
            return;
        // printf("%ld \n", rem);
        if(rem%2 != 0)
            preordertraversal(p->left, rem/2 + 1);
        else
            preordertraversal(p->left, rem/2);
        preordertraversal(p->right, rem/2);
    }
 