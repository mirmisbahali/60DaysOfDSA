#include<iostream>
using namespace std;

int sum = 0;

struct node {
  struct node *left;
  int data;
  struct node *right;

  node(int x) {
    data = x;
    left = NULL;
    right = NULL;
  }
};
int find_sum(struct node*);
int main(void) {
  struct node *root = new node(5);
  root -> left = new node(3);
  root -> right = new node(11);
  root -> left -> left = new node(2);
  root -> left -> right = new node(1);
  root -> right -> left = new node(4);
  root -> right -> right = new node(7);


  cout << find_sum(root) << endl;

  return 0;
}

int find_sum(struct node *root) {
  if (!root) return 0;
  return root->data + find_sum(root->left) + find_sum(root->right);
}