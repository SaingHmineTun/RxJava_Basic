package it.saimao.rxjava_basic;

import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class V8_Filter_Last_Operator {
    public static void main(String[] args) {

        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var dispose = Observable.fromIterable(list).filter(n -> n % 2 == 1).last(0).subscribe(System.out::println);
        dispose.dispose();
    }
}
