package com.deepu.OOPs.Inheritance;

class BoxWeight extends Box {
    int weight;

    BoxWeight(){
        super();
        this.weight=-1;
    }
    BoxWeight(int l, int w, int h, int weight) {
        super(l, w, h);
        this.weight = weight;

    }
}