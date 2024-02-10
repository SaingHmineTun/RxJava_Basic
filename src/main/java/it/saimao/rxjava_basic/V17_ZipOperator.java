package it.saimao.rxjava_basic;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;

public class V17_ZipOperator {
    public static void main(String[] args) {
        var ob1 = Observable.range(0, 100);
        var ob2 = Observable.range('က', 100);
        Observable.zip(ob1, ob2, (BiFunction<Integer, Integer, Object>) (integer, integer2) -> integer + " " + integer2).subscribe(System.out::println).dispose();
    }
}
