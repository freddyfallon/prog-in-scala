class Rational (n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d

  override def toString = s"$n / $d"

  def add(that: Rational): Rational =
    new Rational(numer * that.denom * denom, denom * that.denom)
}