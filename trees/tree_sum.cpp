#include<iostream>
#include<queue>

using namespace std;

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

int main(void) {
  queue<struct node*> queue;
  struct node *root = new node(5);
  root -> left = new node(3);
  root -> right = new node(11);
  root -> left -> left = new node(2);
  root -> left -> right = new node(1);
  root -> right -> left = new node(4);
  root -> right -> right = new node(7);

  int sum = 0;
  queue.push(root);
  while (!queue.empty()) {
    struct node *current = queue.front();
    queue.pop();
    sum += current->data;
    if (current->left) queue.push(current->left);
    if (current-> right) queue.push(current->right);
  }

  cout << sum << endl;

  return 0;
}