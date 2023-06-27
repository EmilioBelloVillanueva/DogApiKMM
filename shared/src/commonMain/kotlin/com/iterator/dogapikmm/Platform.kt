package com.iterator.dogapikmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform