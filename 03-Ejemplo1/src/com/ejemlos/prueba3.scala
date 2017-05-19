package com.ejemlos

object Timer {


        def main(args: Array[String]) {
               for (i <- Array("1","ddd2",3,4,5,6,7)) println(i)
               
               var a = Array(1,2,3)
               
               for (i <- 0 until a.length) {
                        println(s"$i is ${a(i)}")
               }
               
               for {
                  i <- 1 to 3
                  j <- 1 to 5
                  k <- 1 to 10
              } println(s"i = $i, j = $j, k = $k")
              
              
              1.to(3).withFilter(((i) => i.<(4))).foreach(((i) => println(i)))
              

              
        }
}