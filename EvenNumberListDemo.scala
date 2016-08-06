object EvenNumberListDemo {
  def main(args : Array[String]){
    var evenNumberList = for {i <- 1 to 20
      if (i % 2) == 0
      } yield i
      
    for(i <- evenNumberList)
      println(i)
  }
}