class NetManager {
    object Holder {
        val instance = NetManager()
    }

    //kotlin 看不到static ，但是可以用派生操作，和构造函数一起生成
    companion object {
        fun getInstance(): NetManager {
            return Holder.instance
        }

        fun getInstance1(): NetManager = Holder.instance
    }

    fun show(name:String){
        println("show:$name")
    }
}

fun main(){
    val net = NetManager.getInstance()
    net.show("kt David")
}