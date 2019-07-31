package com.bapspatil.reindeer.util

/*
** Created by Bapusaheb Patil {@link https://bapspatil.com}
*/

object Keys {

    init {
        System.loadLibrary("native-lib")
    }

    external fun apiKey(): String
}