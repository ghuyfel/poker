package poker.common

interface PokerHandEvaluator {
    fun evaluateStraitFlush(): Boolean
    fun evaluateFourOfKind(): Boolean
    fun evaluateFullHouse(): Boolean
    fun evaluateFlush(): Boolean
    fun evaluateStraight(): Boolean
    fun evaluateThreeOfKind(): Boolean
    fun evaluateTwoPair(): Boolean
    fun evaluatePair(): Boolean
    fun evaluateCards(): String
}