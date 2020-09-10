package com.wl.ds.linked;

public class SingleNode {
    private String name;
    public SingleNode next;

    public SingleNode() {}

    public SingleNode(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SingleNode{" +
                "name='" + name +
                '}';
    }
}
