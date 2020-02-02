package com.knoldus

class FirstName(val firstName:String) extends AnyVal {
  def getFirstName: String = firstName
}

class LastName(val lastName:String) extends AnyVal {
  def getLastName: String = lastName
}

class Age(val age:Int) extends AnyVal {
  def getAge: Int = age
}

object DisplayDetails extends App{
  val yourFirstName = scala.io.StdIn.readLine("Enter the first name")
  val firstName = new FirstName(yourFirstName)
  val yourLastName = scala.io.StdIn.readLine("Enter the first name")
  val lastName = new LastName(yourLastName)
  println("Enter your age :")
  val currentAge = scala.io.StdIn.readInt()
  val age = new Age(currentAge)
  def displayDetails(firstName: FirstName,lastName: LastName,age: Age):Unit = {
    println(firstName.getFirstName + " " +
      lastName.getLastName + " is of " + age.getAge + " years.")
  }
  displayDetails(firstName,lastName,age)
}