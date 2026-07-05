package com.deepu.OOPs.Inheritance;


public class BoxPrice extends BoxWeight {
    int price;

    BoxPrice(){
        super();
        this.price=-1;
    }
    BoxPrice(int l,int w,int h,int weight,int price){
        super(l,w,h,weight);
        this.price=price;
    }
}
