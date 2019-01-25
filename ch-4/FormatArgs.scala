def formatArgs(args: Array[String]) = {
    args.mkString(",")
}

val res = formatArgs(Array("1", "2", "3"))

assert(res == "1,2,3")