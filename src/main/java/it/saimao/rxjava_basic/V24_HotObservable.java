import io.reactivex.rxjava3.core.Observable;

import java.util.List;

/**
 * It is like a livestream.
 * The publisher emits value, the subscriber gets that value after connecting,
 * But it doesn't guarantee that it will get from 0
 * It only guarantees that it would catch the latest values
 * <p>
 * Example is more obvious by using interval or timer
 */

void main() {
    // Turn ColdObservable to HotObservable by calling publish method

    var conObservable = Observable.fromIterable(List.of("ABC", "DEF", "GHI")).publish();
    conObservable.subscribe(System.out::println);

    /**
     * Subscribe function will only work if connect method is called!
     */
    // conObservable.connect();
}