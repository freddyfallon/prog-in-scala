val greetStrings: Array[String] = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = "there"
greetStrings(2) = "boys"

val numNames = Array("one", "two", "three")
val listNames = List("list1", "list2", "list3")
val coolList = List(1, 2, 3)
val oneTwoThree = 1 :: 2 :: 3 :: Nil
numNames(2) = "3"

val newList = coolList :+ 4
newList.foreach(println)

// greetStrings.foreach(println)
// numNames.foreach(println)
// coolList.foreach(println)
// listNames.foreach(println)
// println(newList)
println(oneTwoThree)
