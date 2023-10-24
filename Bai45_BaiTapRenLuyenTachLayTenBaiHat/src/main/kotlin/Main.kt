fun main(args: Array<String>) {
    val s:String = "D:/music/bolero/longme.mp3"
    val songmp3 = s.split("/")
    println(songmp3[songmp3.size-1])
    val song = songmp3[songmp3.size-1].split(".")
    println(song[0])
}