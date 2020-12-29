package com.spring5.other;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lijichen
 * @date 2020/11/17 - 18:41
 */
public class ObserverDemo extends Observable {
    public static void main(String[] args) {
        ObserverDemo observer = new ObserverDemo();
        //添加观察者
        //o.countObservers() 当前有几个观察者
//        Observer observer1 = (o,arg) -> System.out.println(o.countObservers()+"：："+arg);
        Observer observer1 = (o,arg) -> System.out.println(((ObserverDemo)o).print()+"：："+arg);
        Observable o1  = new Observable();
        Object e = new Object();
        observer1.update(observer,e);
        observer.addObserver(observer1);
        observer.addObserver((o,arg) -> {
            System.out.println("发生变化");
        });
        observer.addObserver((o,arg) -> {
            System.out.println("已经知道发生了变化");
        });
//        Observer or;
//        observer.addObserver(or);
        observer.setChanged();
        observer.notifyObservers();

    }

    public int print() {
        System.out.println("继承了观察者的类打印！！");
        return 0;
    }
}
