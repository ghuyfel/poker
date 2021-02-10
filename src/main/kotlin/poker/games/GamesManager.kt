package poker.games

import poker.GamesList
import poker.common.deck.shufflers.FisherYatesShuffler
import poker.common.utils.CardUtils
import poker.games.fiveofkind.FiveOfKindDeck
import poker.games.fiveofkind.FiveOfKindPokerGame

object GamesManager {
    fun startGame(shuffleCount: Int = 3, gameType: GamesList) {

        when(gameType) {
            is GamesList.FiveOfKind -> startFiveOfKind(shuffleCount)
        }

    }

    private fun startFiveOfKind(count: Int) {
        val game = FiveOfKindPokerGame(FiveOfKindDeck.generateCards(), FisherYatesShuffler )
        game.shuffleDeck(count) // You can decide how many times you want to shuffle. Can be taken from user input.
        val hand = game.dealHand()
        println("Your hand: ${CardUtils.printCleanList(hand)}")
        val result = game.evaluateHand(hand)
        println("You have: $result")
    }
}