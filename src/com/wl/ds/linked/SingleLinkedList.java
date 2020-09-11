package com.wl.ds.linked;

/**
 * 单链表
 */
public class SingleLinkedList {
    //先初始化一个头节点，头节点不要动,不存放具体的数据
    private SingleNode head = new SingleNode("");

    //添加节点到单向链表
    //思路，当不考虑编号的顺序时。
    //1.找到当前链表的最后节点
    //2.将最后这个节点的next指向新的节点
    public void add(SingleNode node) {
        SingleNode temp = head;
        while (true) {
            if(temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void list() {
        if(head.next == null) {
            System.out.println("链表为空");
            return;
        }

        SingleNode temp = head.next;
        while (true) {
            System.out.println(temp);
            if(temp.next == null) {
                break;
            }
            temp = temp.next;
        }
    }

    //获取单链表长度
    public int getLength() {
        if(head.next == null) {
            return 0;
        }

        int len = 1;
        SingleNode temp = head.next;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        return len;
    }

}
