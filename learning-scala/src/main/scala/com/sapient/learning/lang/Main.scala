package com.sapient.learning.lang

object Main {

  def main(args: Array[String]) {

    val d = new D
    println(d.message) // I'm an instance of class B
    println(d.loudMessage) // I'M AN INSTANCE OF CLASS B

    val richStringIter = new RichStringIter("Kumar")
    richStringIter foreach print

    val climber = new Climber();
    climber climb (new MyWorker(), () => println("Hell Yeah!"));

    val methods = new Methods();
    println("Factorial of 2: " + methods.factorial(2))
    println("Factorial of 3: " + methods.factorial(3))

    Optional.matcher(Optional.loadData(true))
    Optional.matcher(Optional.loadData(false))
    Optional.matcher(Optional.even(12))
    Optional.matcher(Optional.even(11))

    val numbers = List(1, 2, 3, 4, 5)
    val res = numbers.foldLeft(1)((m, n) => m*n)
    println(res) // 55
    
    println(Currying.add(1, 2))
    println(Currying.addlong(1))
    println(Currying.addshort(1)(2))

  }
}