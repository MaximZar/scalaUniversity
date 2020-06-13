package laba4

import org.scalatest.FunSuite

class Laba4Tests extends FunSuite {
    test("Typeclasses.scala ReversableString") {
        val string = "abc"
        val result = "cba"
        val reversableString = Typeclasses.testReversableString(string)
        assert(reversableString == result)
    }
    test("Typeclasses.scala SmashInt") {
        val a = 3
        val b = 4
        val result = 7
        val smashInt = Typeclasses.testSmashInt(a, b)
        assert(smashInt == result)
    }
    test("Typeclasses.scala SmashDouble") {
        val a = 3
        val b = 4
        val result = 12
        val smashDouble = Typeclasses.testSmashDouble(a, b)
        assert(smashDouble == result)
    }
    test("Typeclasses.scala SmashString") {
        val a = "ab"
        val b = "cd"
        val result = "abcd"
        val smashString = Typeclasses.testSmashString(a, b)
        assert(smashString == result)
    }
}