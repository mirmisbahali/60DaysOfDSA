/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


int getDecimalValue(struct ListNode* head){
    int n = head -> val;
    struct ListNode* temp = head->next;
    while (temp != NULL) {
        n = n * 2 + temp->val;
        temp = temp->next;
    }
    return n;
}