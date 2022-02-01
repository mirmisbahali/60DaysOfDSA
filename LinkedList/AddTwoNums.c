#include<stdio.h>


struct ListNode {
    int val;
    struct ListNode *next;
};


struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){

}

void Print(struct ListNode* head) {
  struct node *temp = head;
  while (temp) {
    printf("%d ", temp->val);
    temp = temp -> next;
  }
  printf("\n");
}

int main(void) {

  return 0;
}