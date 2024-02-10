package it.saimao.rxjava_basic;

import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class V15_MergeOperator {
    public static void main(String[] args) {
        var list1 = List.of(1, 2, 4, 8, 15);
        var list2 = list1.stream().map(integer -> integer * 2).toList();
        var ob1 = Observable.fromIterable(list1);
        var ob2 = Observable.fromIterable(list2);
        var ob3 = ob1.mergeWith(ob2).subscribe(next -> System.out.println("Next - " + next));
        ob3.dispose();
    }
}
