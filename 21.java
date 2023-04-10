public class ListNode{
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val){ this.val = val};
    ListNode(int val,ListNode next){this.val = val,this.next = next};
}

class Solution{
    public ListNode mergeTwoLists(ListNode list1 ,ListNode list2){
        if(list1.val >= list2.val){
            list1 = list1.next;
        }
        else{
            ListNode tmp = new ListNode(list2.val);
            tmp.next = list1.next.next;
            list1.next = tmp;
            list2 = list2.next();
        }
        return list1;
    }
}