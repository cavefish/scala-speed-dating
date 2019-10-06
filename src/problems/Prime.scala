package problems

object Prime {
  def isPrime(n: Int): Boolean = n match {
    case 2 => true
    case _ => if (n < 2) false else hasDivider(n, 3, Math.sqrt(n).toInt)
  }

  @scala.annotation.tailrec
  def hasDivider(n: Int, divider: Int, top: Int):Boolean = if
  (divider > top) true
  else if (n%divider == 0) false
  else hasDivider(n, divider+2, top)
}
