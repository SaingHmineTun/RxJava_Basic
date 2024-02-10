package it.saimao.rxjava_basic;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

import java.util.List;

/**
 * Convert an iterable sequence into an observable that emits the items in the sequence
 */
public class V3_FromIterableOperator {
    public static void main(String[] args) {

        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var observable = Observable.fromIterable(list);
        observable.subscribe(
                new Observer<Integer>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        System.out.println("On Subscribe");
                    }

                    @Override
                    public void onNext(@NonNull Integer integer) {
                        System.out.println("On Next - " + integer);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        System.out.println("On Error");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("On Complete");
                    }
                }
        );

    }
}
