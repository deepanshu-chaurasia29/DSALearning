package com.deepu.OOPs.mix;

public class ObjectClassDemo {
    int num;

    public ObjectClassDemo(int num) {
        this.num=num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectClassDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    static void main() {
        ObjectClassDemo obj1=new ObjectClassDemo(12);
        ObjectClassDemo obj2=new ObjectClassDemo(12);

        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));

    }
}
