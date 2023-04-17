package com.strategypattern.strategypattern

import org.springframework.stereotype.Service

@Service("first")
class Strategy1:Strategy {
    override fun doStuff(stuffName: String): String {
        println("Strategy1: $stuffName")
        return stuffName
    }
}