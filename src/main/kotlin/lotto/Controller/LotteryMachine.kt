package lotto.Controller

import camp.nextstep.edu.missionutils.Randoms
import lotto.Model.Lotto

// 로또 발행, 당첨번호 관리
object LotteryMachine {
    val winningNumbers = mutableListOf<Int>()
    var bonusNumber: Int = 0

    fun generateLotto(): Lotto {
        val numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6)
        return Lotto(numbers)
    }

    fun generateLottos(count: Int): List<Lotto> {
        return List(count) { generateLotto() }
    }

    fun setWinningLotto(newWinningNumbers: List<Int>, newbonusNumber: Int) {
        winningNumbers.clear()
        winningNumbers.addAll(newWinningNumbers)
        bonusNumber = newbonusNumber
    }
}