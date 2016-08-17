/**
  * Created by phani16 on 07/05/2016.
  *
  * mkString is equivalent of using Collectors.join or StringJoiner class in Java 8.
  */

val names = List("Phani","Arjun","Vidya")

println(names.map {
    _.toUpperCase
  }.mkString("[",", ","]")

)