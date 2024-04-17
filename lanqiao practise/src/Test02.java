/**
 * @author 吴金辉
 * @version 1.0
 */
public class Test02 {
    public static void main(String[] args) {

    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        //创建一个哨兵节点
        ListNode dummy = new ListNode();
        dummy.next = head;
        //记录要反转的片段位置
        int left = 1;
        int right = left + k - 1;
        //反转片段前一个节点p0
        ListNode p0 = dummy;
        //链表长度
        int size = getSize(head);
        while (right <= size) {
            //翻转三元素
            ListNode pre = null;
            ListNode cur = p0.next;
            ListNode nxt = null;

            for (int i = 0; i < k; ++i) {
                nxt = cur.next;
                cur.next = pre;
                pre = cur;
                cur = nxt;
            }
            ListNode node1 = p0.next; //用来记录下一次翻转片段的前一个节点
            p0.next.next = cur;
            p0.next = pre;

            p0 = node1;
            left = right + 1;
            right = right + k;
        }

        return dummy.next;
    }

    public static int getSize(ListNode head) {
        int size = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            ++size;
        }
        return size;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}