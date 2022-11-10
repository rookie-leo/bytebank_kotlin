package main.kotlin

fun testaFor() {
    for (i in 10 downTo 0) {
        println(i)
    }

    println()

    for (i in 10 downTo 0 step 2) {
        println(i)
    }
}