val lista_liczb = List(2.1, -0.44, 0.191, 38.9 , -328.111, 2389.39, 0, 29, 0)


def zad10(liczby: List[Double]): List[Double] = {
  liczby.filter(x => (x >= -5 && x <= 12))
    .map { case (k) => Math.abs(k) }
}

zad10(lista_liczb)
