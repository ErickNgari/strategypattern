package com.strategypattern.strategypattern

import org.springframework.stereotype.Service

@Service("third")
class Strategy3:Strategy {
    override fun doStuff(stuffName: String): String {
        println("Strategy3: $stuffName")
        return stuffName
    }
}