/**
  * Created by phani16 on 07/05/2016.
  *
  * XML is a first class citizen in Scala . Add scala-xml library for the program to execute.
  */

val langs = Map("C++" -> "Kanetkar","Java" -> "Gosling","Ruby" -> "Matz")

def createChildren() = {
  langs.map { entry =>
    val (name, author) = entry

    <language name={name}>
      <author>
        {author}
      </author>
    </language>
  }
}

val xmlDocument = <languages>{createChildren()}</languages>

println(xmlDocument)