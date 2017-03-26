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

case class Counter(n: Int = 0) {
  def inc =  this.copy(n + 1)
  def dec = this.copy(n - 1)

   val count = n

}

object AppMain extends App{
  val c = new Counter(10).inc.dec.inc.inc.count
  println(c)
 }