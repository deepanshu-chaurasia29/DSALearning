package com.deepu.collections;

public class Enum {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // they are internally objects which is  public,static and final

        Week(){
            System.out.println("Constructor called" + this);
        }

        @Override
        public void hello() {
            System.out.println("hello");
        }

        //constructor is not public or protected,only private or default
        // because internally constants are objects which stops programmer to create objects
        //internally: public static final Week Monday = new Week();

    }

    static void main() {
        Week week;
        week = Week.Monday;

        // to iterate over enums
//        for(Week day:Week.values()){
//            System.out.println(day);
//        }

//        System.out.println(Week.Friday.ordinal());  //ordinal method returns the position of constants
//        System.out.println(Week.valueOf("Tuesday"));

        week.hello();

    }
}

