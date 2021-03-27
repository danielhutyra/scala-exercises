val produkty: Map[String, Option[Int]] = Map("Ziemniaki" -> Some(4), "Kapusta" -> Some(20), "Seler" -> None)

println(produkty.getOrElse("Ziemniaki", 0))
println(produkty.getOrElse("Seler", 0))
println(produkty.getOrElse("Parapet", 0))

