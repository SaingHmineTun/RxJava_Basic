package it.saimao.rxjava_basic;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;

import java.util.List;

public class V17_ZipOperator {
    public static void main(String[] args) {
        var ob1 = Observable.range(0, 5);
        var ob2 = Observable.fromIterable(List.of("ABC", "DEF", "GHI", "JKL", "OMN"));
        Observable.zip(ob1, ob2, (BiFunction<Integer, String, Object>) (integer, string) -> STR."\{integer} -> \{string}").subscribe(System.out::println).dispose();
    }
}
