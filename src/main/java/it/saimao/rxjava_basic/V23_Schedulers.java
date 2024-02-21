import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.schedulers.Schedulers; /**
 * Threading in RxJava is done with Schedulers
 * Type of Schedulers
 * (1) Schedulers.io()          - used for non-cpu intensive I/O type work
 * such as interacting with the file system, network call, database interaction
 * (2) Schedulers.computation() - used for computational or cpu-intensive work such as resizing image,
 * processing large data set.
 * (3) Schedulers.newThread()   - creates a new thread for each unit of work.
 * (4) AndroidSchedulers.mainThread() - is provided by RxAndroid. This is where user interaction happens.
 * <p>
 * <p>
 * DEFAULT THREADING IN RxJava
 * - subscribeOn    - affects upstream (Network call) operator (operators above the subscribeOn)
 * - if only subscribeOn is specified, all operators will be executed on that thread
 * - observeOn      - affects downstream (UI) operator (operators below the observeOn)
 * - if only observeOn is specified, all operators will be executed on the current thread
 * and only operators below the observeOn will be switched to thread specified by the observeOn
 */

void main() {
    var name = "Sai Mao";
    Single
            .create(emitter -> {
                emitter.onSuccess(name);
            })
            .subscribeOn(Schedulers.io())
            .subscribe(s -> System.out.println(STR."\{s} is running on \{Thread.currentThread().getName()}"));
}