package com.wei.box;
//1號　10,10,10
//2號　15,10,10
//...
//length,width,height -> OK?

public class Box implements Comparable<Box>{
    int length;
    int width;
    int height;
    String name;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(int length, int width, int height) {
        //TODO: bug free
        // List sorting
        return length <= this.length && width <= this.width && height <= this.height;
    }

    @Override
    public int compareTo(Box box) {
        return (length+width+height)- (box.length+ box.height+ box.height);
    }
}
