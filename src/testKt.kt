import java.lang.Integer.parseInt

fun main(args: Array<String>) {
    println("hello world")

    Greeter("World!").greet()

    println(sum(1, 3))

    vars(1, 2, 3, 4, 5)

    //lambda（匿名函数）
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(sumLambda(1, 4))

    //常量Value
    val a: Int = 1;
    val str: String = "abv"
    val b = 1
    val c: Int = 2
    //变量variable
    var x = 5
    x += 1

    //字符串模板
    var aa = 1
    aa = 2
    val s1 = "a is $aa"
    println(s1)
    //可以直接对字符串进行操作
    aa = 3
    val s2 = "${s1.replace("is", "was")},but now is $aa"
    println(s2)

    //null检查机制
    //类型后面加？表示可以为空
    /*var age: String? = "23"
    //抛出空指针异常
    val ages = age!!.toInt()
    //不做处理返回null
    val ages1 = age?.toInt()
    //age为空返回-1
    val ages2 = age?.toInt() ?: -1*/

    /*if (args.size < 2) {
        print("two integers expected")
        return
    }
    val x1 = parseInt(args[0])
    val y1 = parseInt(args[1])
    //直接使用x*y会导致错误，因为他们可能为null
    if (x1 != null && y1 != null) {
        //在进行过null值的检测之后，x和y的类型会被自动转成非null变量
        print(x1 * y1)
    }*/


    //区间
    for (i in 1..15) print("$i,")
    println()

    //这样看起来是倒着输出，其实会啥都不打印
    for (i in 4..1) print("$i,")
    println()

    for (m in 1..10) {
        print("$m,")
    }
    println()

    for (i in 1..6 step 2) {
        print("$i,")
    }
    println()

    for (i in 10 downTo 1 step 2) {
        print("$i,")
    }
    println()

}

//名叫obj的变量是一种Any类型的参数
//任何一种数据类型都是Any的子类
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }

    return null

}

class Greeter(val name: String) {
    fun greet() {
        println("hello ,$name")
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

//可变长参数的函数
fun vars(vararg v: Int) {
    for (vt in v) {
        println(vt)
    }
}



