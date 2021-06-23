class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode currentNode =head;        
        ListNode startNode=null;      
        ListNode innerRoot=null;   
        ListNode tail=null;
        ListNode prev=null;
        
        for (int i=1;i<=right && left!=right;i++)
        {
            if (i== left)
            {   
                startNode= prev;                
                tail = innerRoot=new ListNode(currentNode.val);
            }
            else if(i> left)
            {
                innerRoot=new ListNode(currentNode.val, innerRoot);
            }
            prev=currentNode;
            currentNode=currentNode.next;
        }
        if(tail!=null)
        {
            tail.next=currentNode;
        }
        if(startNode!=null)
        {
            startNode.next = innerRoot;
        }
        else if (innerRoot!=null)
        {            
            head = innerRoot;
        }        
        
        return head;
    }
}
