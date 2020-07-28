class InnerClass {
    val I = "AAA"

    //这种是嵌套类，拿不到外部类的任何东西，和外部类没有任何关系
    //可以随意嵌套，只是写在这里，但和外部类没有任何关系，就像方法的嵌套
    class sub{
        fun show(){
            println()
        }
    }

    //加上inner这样才是内部类
    inner class sub1{
        fun show(){
            println(I)
        }
    }
}