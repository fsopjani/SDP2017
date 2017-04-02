package factorymethod

/**
  * Created by fatos on 30/03/2017.
  */
trait Product {
}

private case class ConcreteProduct() extends Product

private case class ConcreteCreator() extends Product

object Creator {
  def apply(s: String):Product = s match {
    case "concrete" => ConcreteProduct()
    case _ => ConcreteCreator()
  }
}


object FactoryMethodDesignPatternClient extends App{
  val concreteCreator = Creator("creator")
  val concreteProduct = Creator("concrete")

  println(concreteCreator)
  println(concreteProduct)
}
