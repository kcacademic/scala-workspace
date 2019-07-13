package com.sapient.learning.lang

object Currying {

  def add(x: Int, y: Int): Int = {
    x + y
  }

  def addlong(x: Int): (Int => Int) = {
    (y: Int) =>
      {
        x + y
      }
  }

  def addshort(x: Int)(y: Int): Int = {
    x + y
  }

}