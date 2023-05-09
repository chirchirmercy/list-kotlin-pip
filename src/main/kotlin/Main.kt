fun main(){

    sum()
    num()
    ascending()
    personobjects()
   println(names("faith","tania","sonia"))
}

//
//1. Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
 fun sum(){
     var numbers= arrayOf(32,17,4,213,43,90,31,3,73,11,158,62)
     val sum=numbers[2]+numbers[5]

println(sum)

 }

//(ii) prints out the index of 158 (1 point)
fun num(){
    var numbers= arrayOf(32,17,4,213,43,90,31,3,73,11,158,62)

    println(numbers.indexOf(158))

}


//(iii) prints out the elements in ascending order. (1 point)
fun ascending() {
    var numbers = arrayOf(32, 17, 4, 213, 43, 90, 31, 3, 73, 11, 158, 62)
    val sortAsc = numbers.sorted()
    println(sortAsc)

}

//2. Given a list of Person objects, each with the attributes, name,
// age, height, and weight. Sort the list in order of descending age (2 points)

data class person(val name:String,val age:Int,val height:Double,val weight:Double)
 fun personobjects(){
     val personA=person("mercy",20,30.0,10.7)
     val personB=person("caren",30,20.7,8.5)
     val peronList= listOf(personA,personB)
     println(peronList.sortedByDescending { person ->person.age  })

 }


//3. Create a function that takes in 3 names and returns a string array containing all 3 names. (2 points)
 fun names(name1:String,name2:String,name3:String):String{

         var names= arrayOf(name1,name2,name3)
     return names.contentToString()


 }
//4. Write a function that takes in a list of Car objects each with a registration
// and mileage attribute and returns the average mileage of all the vehicles in the list. (3 points)

//data class car(var registration:String,var mileage:Int)
//fun averagemileae():Double{
//    val totalMileage=car.tesla(0)
//
//
//}
