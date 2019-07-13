package com.sapient.learning.lang

trait Worker {
  def work[T](): Unit
  def smartWork(f: () => Unit): Unit
}

class MyWorker extends Worker {
  def work[Int](): Unit = {println("Hello!")}
  
  def smartWork(f: () => Unit): Unit = {f()}
}

class Climber {

  def climb(worker: Worker, b: () => Unit): Unit = {
    worker.work();
    worker.smartWork(b);
  }
}
  
