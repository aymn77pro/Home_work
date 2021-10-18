fun main() {
var cityList= mutableListOf("riyadh","jeddah","makkah")
    cityList.addAll(0, listOf("dammam","abha"))
    println(cityList)
    cityList[4]="Jazan"
    println(cityList)
    cityList.forEachIndexed { index, data ->
        println("${index}:$data")
    }
var IntList= mutableListOf(1,2,3,4,5)
    IntList[2]=12
    println(IntList)
    for (index in IntList){
    if (index == 12) {
        IntList.removeAt(IntList.indexOf(index))
        break
    }   }
        println(IntList)
}
