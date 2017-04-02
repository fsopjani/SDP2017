package singleton

/**
  * Created by fatos on 30/03/2017.
  */
class SingletonLazyCheck private (){
  def printHi() = println("hi fatos")

}

object SingletonLazyCheck {
  private lazy val instance: SingletonLazyCheck = new SingletonLazyCheck
  def apply(): SingletonLazyCheck = {
    instance
  }

}

object SingletonMain extends App {

  val y = SingletonLazyCheck()

  println(y)
  y.printHi()
  println(y)

}
