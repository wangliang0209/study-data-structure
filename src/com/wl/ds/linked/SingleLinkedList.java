package com.wl.ds.linked;

/**
 * ������
 */
public class SingleLinkedList {
    //�ȳ�ʼ��һ��ͷ�ڵ㣬ͷ�ڵ㲻Ҫ��,����ž��������
    private SingleNode head = new SingleNode("");

    //��ӽڵ㵽��������
    //˼·���������Ǳ�ŵ�˳��ʱ��
    //1.�ҵ���ǰ��������ڵ�
    //2.���������ڵ��nextָ���µĽڵ�
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
            System.out.println("����Ϊ��");
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

    //��ȡ��������
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
