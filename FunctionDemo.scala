object FunctionDemo {
  def main(args:Array[String]){
    def printPrime(t:String){
      println(t)
      val primeList = List(1,2,3,5,7,11)
      for(i<-primeList){
        if(i==11){
          return;
        }
        if(i!=1){
          println(i)
        }
      }
    }
    printPrime("Called Function inside of a Main Method")
    outsideFunction("Called Function outside of a Main Method")
  }
  def outsideFunction(t:String){
    println(t)
    for(i <- 1 to 3){
      println(i)
    }
  }
}
