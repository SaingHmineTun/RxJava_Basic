package it.saimao.rxjava_basic;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

/**
 * Just Operator - Can accept up to 10 parameters
 */
public class V1_JustOperator {
    public static void main(String[] args) {
        // Observable - Emitting some values
        var observable = Observable.just(1, 2, 3);
        // Observer - Do the job if you get the values
        var observer = new Observer<Integer>() {

            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println("On Subscribe");
            }

            @Override
            public void onNext(@NonNull Integer integer) {
                System.out.println("On Next : " + integer);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                System.out.println("On Error");
            }

            @Override
            public void onComplete() {
                System.out.println("On Complete");
            }
        };

        // Subscribe to get the values
        observable.subscribe(observer);
    }
}
