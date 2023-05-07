package ru.mike.creditcalculator2

import kotlin.concurrent.thread

fun main() {
    var thread1: Thread
    var thread2: Thread
    repeat(100) {
        var x = 0
        var y = 1

        thread1 = thread {
            var a = x
            y = 0
            print("$a, ")
        }

        thread2 = thread {
            var b = y
            x = 1
            print(b)
        }
        thread1.start()
        thread2.start()
        thread1.join()
        thread2.join()
        thread1.interrupt()
        thread2.interrupt()
        println()
    }
}