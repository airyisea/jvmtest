package com.airyisea.jvmtest.day1;

public class MyNode extends Node<Integer> {

    public MyNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }

    public void intefaceMethod(Customer customer) {
        customer.isVip();
    }

    public static void main(String[] args){

        MyNode node = new MyNode(1);
        node.setData(6);
        node.parentMethod();

    }


}
