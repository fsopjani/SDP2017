package singleton

/**
  * Created by fatos on 30/03/2017.
  */
class SingletonLazyCheck private (){
  def printHi() = println("hi fatos")


}

object SingletonLazyCheck {
  lazy val INSTANCE = new SingletonLazyCheck
  def apply() = INSTANCE
}