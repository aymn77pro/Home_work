fun main() {
/*var todoSet = setOf(11,22,33,44)
    println(todoSet.elementAt(1))
    println(todoSet)
    var todoSetIterater =todoSet.iterator()
    while (todoSetIterater.hasNext())
        var nextValue = todoSetIterater.next()
    if (){

    }
        println()*/
    var myMap = mutableMapOf<String, String>("inst" to "zamel", "inst2" to "sadun", "instG" to "google")
//الكي ماينفع يتكرر (key to value ) لنه بيحذف القيمه الاول
    //يمديك تغير الكي او القيمه من <>
    println(myMap)
    println(myMap["inst"])//استدعاء با الكي
    //myMap.put("class","kotlin")//مايصلح تحط (to) في الايضافه
    myMap["class"] = "kotlin"//طريقه ثانيه
    myMap.putIfAbsent("class", "asd")// اذا لقا الكي موجود مايكتب الفاليو الجديد
    myMap.putIfAbsent("asd", "awd")
    println(myMap)
    myMap.remove("asd")//للحذف اي كي بس اكتب اسمه
    println(myMap)
    myMap.putAll(listOf("aymn", "ali", "al shehri").mapIndexed { index, s -> index.toString() to s })
    //طريقة اضافة اكثر من قيمه بس مايمديك تحط الكي يدوي
    println(myMap)
    myMap.putAll(mapOf("name" to "aymn", "Father name" to "ali", "last name" to "sl shehri"))
    // هاذي طريقة اضافة الكي مع القيمه حقته
    println(myMap)
    myMap.remove("0")
    myMap.remove("1")
    myMap.remove("2")
}