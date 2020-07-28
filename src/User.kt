/**
 * 数据类==JavaBean  data数据类，object单例
 */
data class User (val id:Int, val name:String, val sex:Char)

fun main(){
    val user = User(99,"lisi",'M')

    val(myID,myName,mySex)=user.copy()
    println("myID:$myID, myName:$myName, mySex:$mySex")

    //_不接收数据
    val(_,_,mySex1)=user.copy()
    println("mySex1:$mySex1")
}