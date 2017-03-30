package singleton

/**
  * Created by fatos on 30/03/2017.
  */
object SingletonMain extends App {

  val x = SingletonLazyCheck()

  println(x)

  val y = SingletonLazyCheck.INSTANCE

  println(y)
  y.printHi()
  println(x)

}
