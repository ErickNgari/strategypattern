package com.strategypattern.strategypattern

import org.springframework.stereotype.Service

@Service("second")
class Strategy2:Strategy {
    override fun doStuff(stuffName: String): String {
        println("Strategy2: $stuffName")
        return stuffName
    }
}