abstract class Person(id:Int) {//主构造
    //次构造，次构造调用主构造
    constructor(id:Int ,name:String):this(id){

    }

    //次构造，次构造调用主构造
    constructor(id:Int,sex:Char):this(id){

    }

    //次构造，次构造调用主构造
    constructor():this(787){

    }

    abstract fun getLayoutID():Int
    abstract fun initView():Int
}