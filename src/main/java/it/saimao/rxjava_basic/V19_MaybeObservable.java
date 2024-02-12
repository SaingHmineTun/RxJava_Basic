/**
 * Maybe is used when an observable has to emit a value or no value
 */

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;

import java.util.List;


public void main() {
    createMaybeObservable().subscribe(createMaybeObserver());
}

Maybe<List<String>> createMaybeObservable() {
    return Maybe.just(List.of("A", "B", "C"));
}

MaybeObserver<List<String>> createMaybeObserver() {
    return new MaybeObserver<>() {

        @Override
        public void onSubscribe(@NonNull Disposable d) {
            System.out.println("On subscribe");
        }

        @Override
        public void onSuccess(@NonNull List<String> lsr) {
            System.out.println("On success");
            lsr.forEach(System.out::println);
        }

        @Override
        public void onError(@NonNull Throwable e) {
            System.out.println("On error");
        }

        @Override
        public void onComplete() {
            System.out.println("On complete");
        }
    };
}
