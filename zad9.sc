val lista_liczb = List(2, 0, 0, 38 , 328, 2389, 0, 29, 0)


def zad9(liczby: List[Int]): List[Int] = {
  liczby.map { case (k) => k + 1 }
}

zad9(lista_liczb)