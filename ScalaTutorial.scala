object ScalaTutorial {  
  def main(args: Array[String]){
    var i = 0
    while(i <= 10){
      println("i = " + i)
      i += 1
    }
	for(j <- 1 to 10){
      println("j = " + j)
    }
  }  
}
