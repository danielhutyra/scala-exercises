import scala.annotation.tailrec

val lista_liczb = List(2, 0, 0, 38 , 328, 2389, 0, 29, 0)


def zad8(liczby: List[Int]): List[Int] = {
  def recursion(i: Int): List[Int] = {
    @tailrec
    def iter(x: Int, result: List[Int]): List[Int] = {
      if (lista_liczb(x) != 0) {
        if (x == liczby.length-1) {
          lista_liczb(x) :: result
        } else {
          iter(x+1, lista_liczb(x) :: result)
        }
      } else {
        if (x == liczby.length-1) {
          result
        } else {
          iter(x+1, result)
        }
      }
    }
    iter(i, List[Int]())
  }
  recursion(0).reverse
}


zad8(lista_liczb)


