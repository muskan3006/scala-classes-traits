package com.knoldus

class Person(val name:String,val age:Int) extends Ordered[Person]{
  def compare(that:Person): Int= {
    if(this.name == that.name){
      this.age - that.age
    }
    else this.name.length - that.name.length
  }

}

object Person extends App{
  val firstName = scala.io.StdIn.readLine("Enter first name")
  println("Enter first age")
  val firstAge = scala.io.StdIn.readInt()
  val firstPerson:Person = new Person(firstName,firstAge)
  val secondName = scala.io.StdIn.readLine("Enter second name")
  println("Enter second age")
  val secondAge = scala.io.StdIn.readInt()
  val secondPerson: Person = new Person(secondName,secondAge)
  println("What you want to do \n" +
  "1. firstPerson < secondPerson \n" +
  "2. firstPerson > secondPerson \n")
  val choice:Int = scala.io.StdIn.readInt()
  val check = choice match{
    case 1 => firstPerson < secondPerson
    case 2 => firstPerson > secondPerson
    case _ => println("Can't compare")
  }

  println(check)
}
