package com.intenthq.scalaisfun

import org.specs2.mutable.Specification

class CalculatorSpec extends Specification {

  "Calculator" >> {

    // Write tests for each function in the Calculator.
    // Some of them have been already written for you.

    "sum" >> {

      "when passed in two integers" >> {
        "should return the sum of them" >> {
          Calculator.sum(3, 5) mustEqual 8
          Calculator.sum(-2, 3) mustEqual 1
          Calculator.sum(-6, -3) mustEqual -9
        }
      }

      "when passed in a list of integers" >> {
        "should return the sum of all the elements in the list" >> {
          Calculator.sum(List(1, 2, 3)) mustEqual 6
        }
      }

    }

//    "avg" >> {
//    }
//
//    "max" >> {
//    }
//
//    "min" >> {
//    }

  }
}