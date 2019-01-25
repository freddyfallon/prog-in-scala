import ChecksumAccumulator.calculate

object Summer {
    def main(args: Array[String]) = {
        for (arg <- args)
            println(s"${arg}: ${calculate(arg)}")
    }
}