package it.saimao.rxjava_basic;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

import java.util.List;

public class V12_MapOperator {
    public static void main(String[] args) {
        var listOfInt = List.of(1, 2, 3, 4, 5, 6, 7);
        Observable.fromIterable(listOfInt).map((Function<Integer, Object>) integer -> "Maisung:" + (integer * 500)).subscribe(System.out::println).dispose();
    }
}
