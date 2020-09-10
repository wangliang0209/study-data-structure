package com.wl.ds;

import com.wl.ds.linked.SingleLinkedList;
import com.wl.ds.linked.SingleNode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        testSingleLinkedList();
    }

    private static void testSingleLinkedList() {
        SingleLinkedList list = new SingleLinkedList();
        SingleNode node = new SingleNode("1");
        list.add(node);

        node = new SingleNode("2");
        list.add(node);

        node = new SingleNode("3");
        list.add(node);

        node = new SingleNode("4");
        list.add(node);

        list.list();
    }
}
