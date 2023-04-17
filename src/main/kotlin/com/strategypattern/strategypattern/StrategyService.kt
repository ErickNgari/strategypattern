package com.strategypattern.strategypattern

import org.springframework.stereotype.Service

@Service
class StrategyService(val strategies: Map<String, Strategy>) {

    fun runStrategy(strategyType: String){
        val strategy = strategies[strategyType]
        strategy?.doStuff(strategyType)
    }
}