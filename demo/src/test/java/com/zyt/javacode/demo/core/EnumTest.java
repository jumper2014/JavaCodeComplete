package com.zyt.javacode.demo.core;

/*
为了让编译器能自动检查某个值在枚举的集合内，
并且，不同用途的枚举需要不同的类型来标记，不能混用，我们可以使用enum来定义枚举类
enum类型的每个常量在JVM中只有一个唯一实例，所以可以直接用==比较
通过enum定义的枚举类，和其他的class有什么区别？
答案是没有任何区别。enum定义的类型就是class，只不过它有以下几个特点：
定义的enum类型总是继承自java.lang.Enum，且无法被继承；
只能定义出enum的实例，而无法通过new操作符创建enum的实例；
定义的每个实例都是引用类型的唯一实例；
可以将enum类型用于switch语句。
 */
public class EnumTest {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if (day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
    }
}

enum Weekday {
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);

    public final int dayValue;

    private Weekday(int dayValue) {
        this.dayValue = dayValue;
    }
}
