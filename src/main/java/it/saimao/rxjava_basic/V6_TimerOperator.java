package it.saimao.rxjava_basic;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

/**
 *
 * Cannot work unless test in JavaFX or Android Application
 */
public class V6_TimerOperator {
    public static void main(String[] args) {
        Observable.timer(5, TimeUnit.SECONDS).subscribe(System.out::println, err -> {
        }, () -> {
        });
    }
}
