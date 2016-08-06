object ScalaTutorial_ListDemo {
  def main(args:Array[String]){
    val list = List(1,2,3,4,5)
    for(i <- list){
      println(i)
    }
  }
}