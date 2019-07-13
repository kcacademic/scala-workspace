package com.sapient.learning.lang

object Optional {

  def matcher(result: Option[String]) {
    result match {
      case Some(msg) => println("found details:" + msg)
      case None      => println("No data found")
    }
  }

  def loadData(condition: Boolean): Option[String] =
    if (condition) {
      Some("Data for employee 1234")
    } else {
      None
    }

  def matcher(matchElement: Either[String, Double]) {
    matchElement match {
      case Left(msg)  => println(msg)
      case Right(rem) => println(rem)
    }
  }

  def even(number: Double): Either[String, Double] =
    if (number % 2 == 0) {
      Right(number)
    } else {
      Left("The number " + number + " is not even");
    }
}

