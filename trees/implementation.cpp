#include<iostream>
#include<stack>
using namespace std;


struct node {
  struct node *left;
  char data;
  struct node *right;
  
  node(char x) {
    data = x;
    left = NULL;
    right = NULL;
  }

};


int main(void) {
  stack<struct node*> stack;
  
  // Implementing Tree
  struct node* root = new node('a');
  root -> left = new node('b');
  root -> right = new node('c');
  root -> left -> left = new node('d');
  root -> left -> right = new node('e');
  root -> right -> right = new node('f');

  // Printing Tree using Depth-first approach
  stack.push(root);
  while (!stack.empty()) {
    struct node *current = stack.top();
    stack.pop();
    cout << current->data << endl;
    if (current->right) stack.push(current->right);
    if (current->left) stack.push(current->left);
  }



  return 0;
}