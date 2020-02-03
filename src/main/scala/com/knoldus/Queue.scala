package com.knoldus

trait Queue{
  def enqueue(list: List[Int],input:Int):List[Int]

  def dequeue(list:List[Int]):List[Int]=
  {
    list.tail
  }
}
class DoubleQueue extends  Queue {
  override  def enqueue(list : List[Int],input :Int):List[Int]={
    val doubleResult=input*2
    list:+doubleResult
  }

}

class SquareQueue extends  Queue {
  override  def enqueue(list : List[Int],input :Int):List[Int]={
    val squareResult=input*input
    list:+squareResult
  }

}

object QueueWork extends App{
  val objectDouble=new DoubleQueue()
  val objectSquare=new SquareQueue()
  val objectDequeue=new DoubleQueue()
  val d = objectDouble.enqueue(List(1,22,3),6)
  println(d)
  println( objectSquare.enqueue(List(1,3,1),6))
  println( objectDouble.dequeue(List(1,2,3,6)))
}