package problems

object Multi {
  def multiply[T <: Iterable[Int]](items: T, multiplier: Int): Iterable[Int] =
    items.map(multiplier.*)
}
