import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.schedulers.Schedulers

/**
 * Flowable is similar to Observable, but this comes into picture when Observable is emitting
 * a huge number of values that can't be received or consumed by the Observer.
 *
 *
 * In this case, the Observable needs to skip some values on the basic of strategy or else
 * it will throw an exception
 *
 *
 * Flowable observable handles this exception with a strategy called BackPressuredStrategy,
 * and it throws MissingBackPressuredStrategy
 *
 *
 * BackPressured Strategies
 * DROP: We use this to discard the events that cannot be consumed by the Observer
 * BUFFER: If we use this, the source will buffer all the events until the subscriber can consume them
 * LATEST: Force the source to keep only the latest items, to do that source may need to overwrite some previous values
 * MISSING: If we don't want any BackPressuredStrategy, we may pass this value temporarily
 * ERROR: If we don't expect Back Pressured at all
 *
 * Schedulers.io() will only work in Android or JavaFX that can keep apps running
 *
 */
fun main() {
    createFlowableObservable()
        .onBackpressureDrop()
        .observeOn(Schedulers.io(), false, 10)
        .subscribe(
            {
                println("On Next - $it")
            }, {
                println("On Error - ${it.message}")
            }, {
                println("On Complete")
            }
        ).dispose()
}

fun createFlowableObservable(): Flowable<Int> {
    return Flowable.range(1, 100)
}
