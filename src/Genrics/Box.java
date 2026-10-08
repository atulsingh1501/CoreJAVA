package Genrics;

import java.util.concurrent.Flow;

public class Box<T> {
    T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
    static void main() {
        Box <String> box = new Box<>();
        box.setItem("Hello");
        System.out.println(box.getItem());

        Box <Integer> box2 = new Box<>();
        box2.setItem(24+24);
        System.out.println(box2.getItem()+24);

    }
}
