package com.wt.Q21;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 
 * 示例：
 * 
 * 输入：1->2->4, 1->3->4 输出：1->1->2->3->4->4
 * 
 * @author Wutong
 *
 */
public class Solution {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode tListNode = new ListNode(0);
		ListNode temp = tListNode;
		while (l1!=null&&l2!=null) {
			if (l1.val<=l2.val) {
				tListNode.next = l1;
				tListNode = tListNode.next;
				l1 = l1.next;
			}else{
				tListNode.next = l2;
				tListNode = tListNode.next;
				l2 = l2.next;
			}
		}
		if (l1 ==null) {
			tListNode.next = l2;
		}
		if (l2 ==null) {
			tListNode.next = l1;
		}
		return temp.next;

	}
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		mergeTwoLists(l1, l2);
	}
}
