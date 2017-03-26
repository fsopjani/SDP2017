/**
  * Created by fatos on 26/03/2017.
  */
//class Counter(n: Int = 1) {
//  val input = n
//  def inc = new Counter(input+1)
//
//  def dec = new Counter(input-1)
//
//}

class Adder(amount: Int) {
  def add(in: Int) = in + amount
}

case class Counter(n: Int = 0){
  def inc =  this.copy(n + 1)
  def dec = this.copy(n - 1)
  val count = n

  def adjust(adder: Adder): Counter = {
    Counter.apply(adder.add(n))
  }

}

object AppMain extends App{
  val c = new Counter(10)
  val adder = new Adder(5)
  println(c.adjust(adder).n)
 }