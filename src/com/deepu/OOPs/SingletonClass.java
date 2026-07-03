package com.deepu.OOPs;

public class SingletonClass {

    private SingletonClass(){

    }
    private static SingletonClass instance;

    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }

    static void main() {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2=SingletonClass.getInstance();
        SingletonClass obj3=SingletonClass.getInstance();

        //All 3 ref variable pointing to same object

        System.out.println(obj2==obj3);

    }
}
