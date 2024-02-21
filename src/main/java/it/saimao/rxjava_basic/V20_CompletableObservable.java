import io.reactivex.rxjava3.core.Completable;

/**
 * Completable is used when the observable has to do some work
 * without emitting any values!
 */
void main() {
    createCompletableObservable().subscribe(() -> System.out.println("DONE")).dispose();
}

Completable createCompletableObservable() {
    return Completable.create(emitter -> {
        if (!emitter.isDisposed()) {
            System.out.println("Start doing job!");
            emitter.onComplete();
        }
    });
}
