/**
  * Created by phani16 on 10/08/2016.
  *
  *  Encapsulation -
  *   class scope -> private age : Int = theAge;
  *   object scope -> private[this] age : Int = theAge;
  *
  *  String Interpolation -> println(s"I'm ${age} years old")
  */


class Person(theAge : Int){
  private var age : Int = theAge

  def play(buddy : Person) = {
    println(s"I'm ${age} years old")
    println(s"and I'm playing with a ${buddy.age} years old")
  }
}

var child1 = new Person(5)
var child2 = new Person(6)

child1.play(child2)

