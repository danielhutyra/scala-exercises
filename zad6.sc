def zad6_wersja1(krotka: Tuple3[Any, Any, Any]) = {
  krotka.productIterator.foreach(x => println(s"Class of $x element is: ${x.getClass}"))
}

def zad6_wersja2(krotka: Tuple3[Any, Any, Any]) = {
  def whatKind(x: Any) = x match {
    case x: String => s"This is the string: $x"
    case x: Int => s"This is Integer: $x"
    case x: Double => s"This is Double: $x"
    case x: Float => s"This is Float: $x"
    case x: List[Any] => s"This is List: $x"
    case x: Map[Any, Any] => s"This is Map: $x"
    case x: Tuple1[Any] => s"This is one element Tuple: $x"
    case x: Tuple2[Any, Any] => s"This is two element Tuple: $x"
    case x => s"I don't know what $x is"
  }
  krotka.productIterator.foreach(x => println(whatKind(x)))
}

zad6_wersja1(Tuple3(2.3, Map(4 -> 4), List(1)))
zad6_wersja2(Tuple3(2.3, Map(4 -> 4), List(1)))