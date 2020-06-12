package laba1

import org.scalatest.FunSuite

class Laba1Tests extends FunSuite {
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


    test("HiOrder.scala testNTimes") {
        val testNTimes = HigherOrder.testNTimes(HigherOrder.plus, 7, 9, 3)
        assert(testNTimes == 48)
    }
    test("HiOrder.scala testAnonymousNTimes") {
        val testAnonymousNTimes = HigherOrder.testAnonymousNTimes(7, 9, 2)
        assert(testAnonymousNTimes == 18) 
    }


    test("Patterns.scala testIntToString") {
        val testIntToString = PatternMatching.testIntToString(3)
        assert(testIntToString == "it is three")
    }   
    test("Patterns.scala testIsMaxAndMoritz") {
        val testIsMaxAndMoritz = PatternMatching.testIsMaxAndMoritz("Moritez")
        assert(testIsMaxAndMoritz == false)
    }   
    test("Patterns.scala testIsEven") {
        val testIsEven = PatternMatching.testIsEven(8)
        assert(testIsEven == true)
    }
    test("Patterns.scala testWinsA") {
        val winsA = PatternMatching.testWinsA(PatternMatching.Paper,PatternMatching.Rock)
        assert(winsA == PatternMatching.Win)
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
    }
}