package problems

object Smaller {
  def get[T <: Iterable[Int]](input: T, delimiter: Int): Iterable[Int] = input.filterNot(delimiter.<=)
}
