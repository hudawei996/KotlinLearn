//要父类是open的才能继承
class Student(id: Int) : Person(id) {
    //在kotlin中全部都是没有默认值的

    //在Java中成员有默认值，但是方法内部没有默认值

    var sex: Char = 'M'
    var age: Int = 0
    //lateinit 懒加载 在没有赋值的时候使用，否则报错
    lateinit var name: String

    override fun getLayoutID(): Int {
        TODO("Not yet implemented")
    }

    override fun initView(): Int {
        TODO("Not yet implemented")
    }
}