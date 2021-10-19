import java.io.File

fun main() {
var cityList= mutableListOf("riyadh","jeddah","makkah")
    cityList.addAll(0, listOf("dammam","abha"))
    println(cityList)
    cityList[4]="Jazan"
    println(cityList)
    cityList.forEachIndexed { index, data ->
        println("${index}:$data")
    }
var IntList= mutableListOf(1,2,3,4,5,12,12)
    IntList[2]=12
println(IntList)
    IntList.removeAll(listOf(12))
    println(IntList)
   // for (index in IntList){
    //if (index == 12) {
      //  IntList.removeAt(IntList.indexOf(index))
        //break
    //}   }
        println(IntList)
    println("--------------------------------------------------------------")
    var failList=File("data/hhhhh").readText().split("\n")
    println(failList)
    var c=failList.maxOf{ it }
    println(c)

    /*var index=failList[0]
for (index in failList){
*/
}


