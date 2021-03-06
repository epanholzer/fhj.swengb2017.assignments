package at.fhj.swengb.assignments.functional

import org.scalatest.WordSpecLike

import scala.util.Random

class FunctionalAssignmentSpec extends WordSpecLike {

  import FunctionalAssignment._

  val hundreds = 1 to 100

  "FunctionalAssignment" should {

    "1: abs returns only positive numbers" in {
      assert(abs(1) == 1)
      assert(abs(-1) == 1)
      assert(abs(0) == 0)
      val rnd = Random.nextInt()
      val rndWithSign = rnd * (if (Random.nextBoolean()) 1 else -1)
      assert(abs(rndWithSign) == rnd)
    }
    "2: flip" in {
      assert(flip(("a", 1)) == (1, "a"))
    }
    "3: unknown" in {
      assert(unknown[Int, Int](Seq(1, 2, 3), a => 2 * a) == Seq(2, 4, 6))
    }
    "4: sum" in {
      assert(sum(hundreds) == hundreds.sum)
    }
    "5: factorial" in {
      assert(fact(5) == 120)
      assert(fact(10) == 3628800)
    }
    "6: fibonacci" in {
      assert(fib(0) == 0)
      assert(fib(1) == 1)
      assert(fib(2) == 1)
      assert(fib(3) == 2)
      assert(fib(4) == 3)
      assert(fib(5) == 5)
      assert(fib(6) == 8)
      assert(fib(14) == 377)
      assert(fib(20) == 6765)
    }
    "7: isSorted" in {
      def gt(a: Int, b: Int) = a < b

      assert(isSorted(Array(1, 2, 3), gt))
    }
    "8: pairs" in {
      assert(
        genPairs(1 to 10, 'a' to 'j') ==
          Seq((1, 'a')
            , (2, 'b')
            , (3, 'c')
            , (4, 'd')
            , (5, 'e')
            , (6, 'f')
            , (7, 'g')
            , (8, 'h')
            , (9, 'i')
            , (10, 'j')))
    }
    "9: myList: sum" in {
      val myList: MyList[Int] = MyList(hundreds: _*)
      assert(MyList.sum(myList) == hundreds.sum)
    }
    "10: myList: product" in {
      val myList: MyList[Int] = MyList(hundreds: _*)
      assert(MyList.product(myList) == hundreds.product)

    }
  }

}
