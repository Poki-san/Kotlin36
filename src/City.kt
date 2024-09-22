data class City(var title: String = "", var populatiom:Int = 0) {
    fun setTitle(_title:String):City = apply { title = _title }
    fun setPoppulation(_population:Int):City = apply { populatiom = _population }
}