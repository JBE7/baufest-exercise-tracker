package baufest.exercise.tracker

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("baufest.exercise.tracker")
                .mainClass(Application.javaClass)
                .start()
    }
}