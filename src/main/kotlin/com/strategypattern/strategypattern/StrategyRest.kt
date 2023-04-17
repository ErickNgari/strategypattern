package com.strategypattern.strategypattern

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rest")
class StrategyRest {

@Autowired
lateinit var strategyService:StrategyService

    @GetMapping("/test")
    fun getRest(){
        strategyService.runStrategy("first")
        println("**************************************")
        strategyService.runStrategy("second")
        println("**************************************")
        strategyService.runStrategy("third")
        println("**************************************")
        strategyService.runStrategy("doesnt exist")
    }
}