package poker.games.fiveofkind

import Mock
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FiveOfKindHandEvaluatorTest {

    @Test
    fun test_FiveOfKindHandEvaluator_evaluateFullHouse_success() {
        val hand = Mock.getMockFullHouseSuccess()
        val evaluator = FiveOfKindHandEvaluator(hand)
        val result = evaluator.evaluateFullHouse()
        assertThat(result).isTrue()
    }

    @Test
    fun test_FiveOfKindHandEvaluator_evaluateFullHouse_failure() {
        val hand = Mock.getMockFullHouseFailure()
        val evaluator = FiveOfKindHandEvaluator(hand)
        val result = evaluator.evaluateFullHouse()
        assertThat(result).isFalse()
    }

    @Test
    fun test_FiveOfKindHandEvaluator_evaluateFourOfKind_success() {
        val hand = Mock.getMockFourOfKindPass()
        val evaluator = FiveOfKindHandEvaluator(hand)
        val result = evaluator.evaluateFourOfKind()
        assertTrue(result)
    }

    @Test
    fun test_FiveOfKindHandEvaluator_evaluateFourOfKind_failure() {
        val hand = Mock.getMockFourOfKindFailure()
        val evaluator = FiveOfKindHandEvaluator(hand)
        val result = evaluator.evaluateFourOfKind()
        assertFalse(result)
    }

    @Test
    fun test_FiveOfKindHandEvaluator_evaluateFlush_success(){
        val hand = Mock.getMockFlushSuccess()
        val evaluator = FiveOfKindHandEvaluator(hand)
        val result = evaluator.evaluateFlush()
        assertThat(result).isTrue()
    }

    @Test
    fun test_FiveOfKindHandEvaluator_evaluateFlush_failure(){
        val hand = Mock.getMockFlushFailure()
        val evaluator = FiveOfKindHandEvaluator(hand)
        val result = evaluator.evaluateFlush()
        assertThat(result).isFalse()
    }

    @Test
    fun test_FiveOfKindHandEvaluator_evaluateStraightFlush_success() {
        val hand = Mock.getMockStraightFlushSuccess()
        val evaluator = FiveOfKindHandEvaluator(hand)
        val result = evaluator.evaluateStraitFlush()
         assertThat(result).isTrue()
    }

    @Test
    fun test_FiveOfKindHandEvaluator_evaluateStraight_failure() {
        val hand = Mock.getMockStraightFlushFailure()
        val evaluator = FiveOfKindHandEvaluator(hand)
        val result = evaluator.evaluateStraitFlush()
        assertThat(result).isFalse()
    }

    @Test
    fun test_FiveOfKindHandEvaluator_evaluateThreeOfKind_success(){
        val hand = Mock.getMockThreeOfKindSuccess()
        val evaluator = FiveOfKindHandEvaluator(hand)
        val result = evaluator.evaluateThreeOfKind()
        assertThat(result).isTrue()
    }

    @Test
    fun test_FiveOfKindHandEvaluator_evaluateThreeOfKind_failure(){
        val hand = Mock.getMockThreeOfKindFailure()
        val evaluator = FiveOfKindHandEvaluator(hand)
        val result = evaluator.evaluateThreeOfKind()
        assertThat(result).isFalse()
    }

    @Test
    fun test_FiveOfKindHandEvaluator_evaluateTwoPair_success(){
        val hand = Mock.getMockTwoPairSuccess()
        val evaluator = FiveOfKindHandEvaluator(hand)
        val result = evaluator.evaluateTwoPair()
        assertThat(result).isTrue()
    }

    @Test
    fun test_FiveOfKindHandEvaluator_evaluateTwoPair_failure(){
        val hand = Mock.getMockTwoPairFailure()
        val evaluator = FiveOfKindHandEvaluator(hand)
        val result = evaluator.evaluateTwoPair()
        assertThat(result).isFalse()
    }

    @Test
    fun test_FiveOfKindHandEvaluator_evaluatePair_success(){
        val hand = Mock.getMockPairSuccess()
        val evaluator = FiveOfKindHandEvaluator(hand)
        val result = evaluator.evaluatePair()
        assertThat(result).isTrue()
    }

    @Test
    fun test_FiveOfKindHandEvaluator_evaluatePair_failure(){
        val hand = Mock.getMockPairFailure()
        val evaluator = FiveOfKindHandEvaluator(hand)
        val result = evaluator.evaluatePair()
        assertThat(result).isFalse()
    }
}