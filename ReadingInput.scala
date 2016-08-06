import scala.io.StdIn.{readLine, readInt}
import scala.math._

object ReadingInput {
  def main(args:Array[String]){
    var number = 0
    do{
      print("Guess a Number ")
      number = readLine.toInt
    }while(number!=15)
    printf("You guessed the Secret Number, %d\n", 15)
  }
}
