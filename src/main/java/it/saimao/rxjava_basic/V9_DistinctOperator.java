package it.saimao.rxjava_basic;

import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class V9_DistinctOperator {
    public static void main(String[] args) {
        var list = List.of(1, 2, 2, 4, 5, 5);
        Observable.fromIterable(list).distinct().subscribe(System.out::println).dispose();
    }
}
