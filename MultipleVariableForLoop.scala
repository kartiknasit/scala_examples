object MultipleVariableForLoop {
  def main(args:Array[String]){
    for(i <- 1 to 5; j <- 6 to 10){
      print("i = " + i)
      println("\tj = " + j)
    }
  }
}