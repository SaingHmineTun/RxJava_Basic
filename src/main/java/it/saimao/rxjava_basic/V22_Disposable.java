import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

/**
 * This is used when you want to dispose your observables
 * The program initially executes from 1 to 100, but when it reaches, it stops the execution
 * because I call dispose method here!
 */

Disposable disposable;

void main() {
    Observable<Integer> observable = Observable.range(0, 100);
    observable.subscribe(new Observer<>() {
        @Override
        public void onSubscribe(@NonNull Disposable d) {
            disposable = d;
        }

        @Override
        public void onNext(@NonNull Integer integer) {
            System.out.println(integer);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (integer == 10) {
                System.out.println("Disposing");
                stopHere();
            }
        }


        @Override
        public void onError(@NonNull Throwable e) {
            System.out.println("On Error");
        }

        @Override
        public void onComplete() {
            System.out.println("On Complete");
        }
    });

}

void stopHere() {

    if (disposable != null) disposable.dispose();

}