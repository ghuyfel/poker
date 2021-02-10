package poker.games.fiveofkind

import poker.common.PokerHandEvaluator
import poker.common.deck.cards.Card
import poker.common.utils.CardUtils.checkIsInSequence
import poker.common.utils.CardUtils.checkListIsSameSuitCards
import poker.common.utils.CardUtils.countCardOfRankInList
import poker.common.utils.CardUtils.countPairsInList
import poker.common.utils.CardUtils.getSortedDescendingList

class FiveOfKindHandEvaluator(private val hand: List<Card>) : PokerHandEvaluator {

    override fun evaluateStraitFlush(): Boolean {
        // A, K, J, 10 same suit
        val sorted = mutableListOf<Card>()
        sorted.addAll(hand)
        sorted.sortByDescending { it.rank }
        return checkListIsSameSuitCards(sorted) && checkIsInSequence(sorted)
    }

    override fun evaluateFourOfKind(): Boolean {
        // All four cards of the same rank
        var sameRank = false
        for (card in hand) {
            if (countCardOfRankInList(hand, card.rank) == 4) {
                sameRank = true
                break
            }
        }
        return sameRank
    }

    override fun evaluateFullHouse(): Boolean {
        //Three kind with a pair

        val temp = mutableListOf<Card>()
        temp.addAll(hand)
        temp.sortByDescending { it.rank }
        val rank = temp[0].rank
        val count = countCardOfRankInList(temp, rank)

        return if (count == 2 && countCardOfRankInList(temp, temp[temp.size - 1].rank) == 3) {
            true
        } else count == 3 && countCardOfRankInList(temp, temp[temp.size - 1].rank) == 2
    }

    override fun evaluateFlush(): Boolean {
        //Any five cards of the same suit, but not in sequence
        return checkListIsSameSuitCards(hand)
    }

    override fun evaluateStraight(): Boolean {
        val temp = getSortedDescendingList(hand)
        return checkIsInSequence(temp)
    }

    override fun evaluateThreeOfKind(): Boolean {
        // Three cards of the same rank
        val temp = getSortedDescendingList(hand)
        for (card in temp) {
            if (countCardOfRankInList(temp, card.rank) == 3) return true
        }
        return false
    }

    override fun evaluateTwoPair(): Boolean {
        // Two different pairs
        return countPairsInList(hand) == 2
    }


    override fun evaluatePair(): Boolean {
        // Two different pairs
        return countPairsInList(hand) == 1
    }

    override fun evaluateCards(): String {
        when {
            evaluateStraight() -> {
                return "Straight Flush"
            }
            evaluateFourOfKind() -> {
                return "Four of Kind"
            }
            evaluateFullHouse() -> {
                return "Full House"
            }
            evaluateFlush() -> {
                return "Flush"
            }
            evaluateStraight() -> {
                return "Straight"
            }
            evaluateThreeOfKind() -> {
                return "Three of Kind"
            }
            evaluateTwoPair() -> {
                return "Two Pair"
            }
            evaluatePair() -> {
                return "Pair"
            }
            else -> {
                return "No Luck this time."
            }
        }
    }

}