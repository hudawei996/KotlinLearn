import com.sun.tools.corba.se.idl.StringGen

/**
 * kotlin基本数据类型
 */
fun main() {

    var name1 = "nihao"
    var count = 1
    var char1 = 'a'

    println(add(2, 3))
    println(lenMethod(1, 2, 3, 4, 5, 5))

    val name = "HuDaWei"
    val age = 29
    val sex = 'M'
    val info = "ABCDEFG"
    println("name:$name, age:$age, sex$sex, info:$info")

//自己不用关心换行，不用自己调整
    val infoMessage = """
        
        AAAAAAAAAA
        BBBBBBBBBB
        CCCCCCCCCC
    """.trimIndent()
    println(infoMessage)

    //不去掉行前的空格
    val infoMessage1 = """
        
        AAAAAAAAAA
        BBBBBBBBBB
        CCCCCCCCCC
    """
    println(infoMessage1)

    var money = 99999.99
    println("$$money")

    val price = """
        $$money
    """.trimIndent()
    println(price)

    var info123: String? = null
    //如果info123是null，就不执行.length
    println(info123?.length)
    //我自己负责info 不会为null == （不管null不null必须执行）==Java
    //println(info123!!.length)

    if (info123 != null) {
        println(info123.length)
    }

    println(testMethod("sz"))

    println(info123?.length ?: "你狠牛逼")

    for (i in 1..9) {
        println(i)
    }

    //9..1不会输出任何东西，1..9才会输出，或者你改成downTo
    for (i in 9 downTo 1) {
        println(i)
    }

    //用区间做判断
    val value = 88
    if (value in 1..100) {
        println("value在范围1..100内")
    }


    for (i1: Int in 1..20 step 2) {
        println(i1)
    }

    println()
    for (i in 1 until 10) {
        println(i)
    }

    println()
    val number3 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    for (number in number3) {
        println(number)
    }

    //循环
    var items = listOf<String>("李四", "张三", "王五")
    for (item in items) {
        println(item)
    }
    //默认名字就是it
    items.forEach {
        print(it)
    }
    //如果想自己取名字，就要加上aaa ->下面使用的名字就是aaa
    items.forEach { aaa ->
        print(aaa)
    }

    println()
    for (index in items.indices) {
        println("下标$index, 对应的值：${items[index]}")
    }

    //和Java的区别，就是变量的类型都是var,不变类型的都是val
    //不用写 new
    val person = Student(23)
    val pseron2 = Student2()
}

fun testMethod(name: String): Int? {
    if (name == "sz") {
        return 9999
    }
    return null
}

fun add(number1: Int, number2: Int): Int {
    return number1 + number2;
}

fun add1(number1: Int, number2: Int) = number1 + number2

fun add2(number1: Int, number2: Int) = "aAA"

fun lenMethod(vararg value: Int) {
    for (i in value) {
        println(i)
    }
}