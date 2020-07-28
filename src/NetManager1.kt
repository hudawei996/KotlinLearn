class NetManager2 {

    companion object {
        private var instance: NetManager2? = null

        fun getInstance(): NetManager2? {
            if (instance == null) {
                instance = NetManager2()
            }
            //第二种补救：我来负责 instance肯定不为null
            //return instance !!

            //如果是null，也返回去了(fun那行最后加了问号）
            return instance
        }
    }

    fun show(name: String) {
        println("show:$name")
    }
}

fun main() {
    //客户端来做补救措施
    val netManager2 = NetManager2.getInstance()
    netManager2?.show("MMMM")
}