import scala.collection.mutable

val treasureMap = mutable.Map[Int, String]()
  treasureMap += (1 -> "Go to Ireland.")
  treasureMap += (2 -> "Find big X on ground.")
  treasureMap += (3 -> "Dig.")
  println(treasureMap(2))

val romanNumeral = Map(
  1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV"
)

val moreRomanNumerals = romanNumeral + (5 -> "V")

println(romanNumeral(4))
println(moreRomanNumerals(5))
println(moreRomanNumerals)