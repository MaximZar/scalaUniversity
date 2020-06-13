package laba1

import org.scalatest.FunSuite

class Laba1Tests extends FunSuite {
// Functions.scala
    test("Functions.scala testCircle") {
        val testCircle = Functions.testCircle(2.0)
        assert(testCircle == 12.566370614359172)
    }
    test("Functions.scala testRectangleCurried") {
        val testRectangleCurried = Functions.testRectangleCurried(3, 2);
        assert(testRectangleCurried == 6)
    }
    test("Functions.scala testRectangleUc") {
        val testRectangleUc = Functions.testRectangleUc(3, 2);
        assert(testRectangleUc == 6)
    }


// HiOrder.scala
    test("HiOrder.scala testNTimes") {
        val testNTimes = HigherOrder.testNTimes(HigherOrder.plus, 7, 9, 3)
        assert(testNTimes == 48)
    }
    test("HiOrder.scala testAnonymousNTimes") {
        val testAnonymousNTimes = HigherOrder.testAnonymousNTimes(7, 9, 2)
        assert(testAnonymousNTimes == 18) 
    }


// Patterns.scala
    test("Patterns.scala testIntToString") {
        val testIntToString = PatternMatching.testIntToString(3)
        assert(testIntToString == "it is three")
        val testIntToString2 = PatternMatching.testIntToString(2)
        assert(testIntToString2 == "it is two")
        val testIntToString3 = PatternMatching.testIntToString(5)
        assert(testIntToString3 == "what's that")
    }   
    test("Patterns.scala testIsMaxAndMoritz") {
        val testIsMaxAndMoritz = PatternMatching.testIsMaxAndMoritz("Moritez")
        assert(testIsMaxAndMoritz == false)
        val testIsMaxAndMoritz2 = PatternMatching.testIsMaxAndMoritz("Max")
        assert(testIsMaxAndMoritz2 == true)
    }   
    test("Patterns.scala testIsEven") {
        val testIsEven = PatternMatching.testIsEven(8)
        assert(testIsEven == true)
        val testIsEven2 = PatternMatching.testIsEven(3)
        assert(testIsEven2 == false)
    }
    test("Patterns.scala testWinsA") {
        val winsA = PatternMatching.testWinsA(PatternMatching.Paper,PatternMatching.Rock)
        assert(winsA == PatternMatching.Win)
        val winsA2 = PatternMatching.testWinsA(PatternMatching.Rock,PatternMatching.Scissor)
        assert(winsA2 == PatternMatching.Win)
        val winsA3 = PatternMatching.testWinsA(PatternMatching.Scissor,PatternMatching.Paper)
        assert(winsA3 == PatternMatching.Win)
    }
    test("Patterns.scala testExtractMammalWeight") {
        val food = PatternMatching.Vegetables
        val mammal = new PatternMatching.Mammal("cat", food, 50)
        val testExtractMammalWeight = PatternMatching.testExtractMammalWeight(mammal)
        assert(testExtractMammalWeight == 50)
    }
    test("Patterns.scala testUpdateFood") {
        val plants = PatternMatching.Plants

        val food = PatternMatching.Vegetables

        val fish = new PatternMatching.Fish("fish", food);
        val testUpdateFood = PatternMatching.testUpdateFood(fish)
        assert(testUpdateFood.food == plants)

        val bird = new PatternMatching.Bird("fish", food);
        val testUpdateFood2 = PatternMatching.testUpdateFood(bird)
        assert(testUpdateFood2.food == plants)
    }
}