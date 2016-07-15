/**
  * Created by r.hayashi on 2016/07/14.
  */
object StudyIf {

  def main(args: Array[String]) {
    var age: Int = 5

    var isSchoolStarted: Boolean = false

    check(age,isSchoolStarted)
  }

  def check(age :Int , isSchoolStarted : Boolean ): Unit ={
    if(1 <= age  && age <= 6 && false == isSchoolStarted){
      println("幼児です。")
      return
    }
     println("幼児ではありません。")

  }

}
