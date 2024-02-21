import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.AsyncSubject;
import io.reactivex.rxjava3.subjects.Subject;

import java.util.List; /**
 * A subject can act both observer and observable
 * Types of RxJava Subjects
 * 1. AsyncSubject
 * It will only emit the latest value. onComplete is very important.
 * 2. BehaviorSubject
 * It emits the most recent item when being subscribed.
 * 3. PublishSubject
 * 4. ReplaySubject
 */


// 1. Create an observable
Observable<String> observable =
        Observable.zip(
                Observable.range(0, 3),
                Observable.fromIterable(List.of("A", "B", "C")),
                (integer, string2) -> STR."\{integer} -> \{string2}"
        );

void main() {

    asyncSubject();

}


void asyncSubject() {

    // 2. Create AsyncSubject
    Subject<String> subject = AsyncSubject.create();

    // 3. Subject as observer
    observable.subscribe(subject);

    // 4. Subject as observable
    subject.subscribe(string -> System.out.println(STR."One - \{string}"));

    observable.subscribe(subject);
    subject.subscribe(string -> System.out.println(STR."Two - \{string}"));


}