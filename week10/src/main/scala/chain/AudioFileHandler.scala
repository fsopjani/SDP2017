package chain

case class AudioFileHandler(s: String) extends Handler {

  var next: Handler = null

  override def setHandler(handler: Handler): Unit = {
    next = handler
  }

  override def process(file: File): Unit = {
    if (file.fileType.equalsIgnoreCase("audio")) {
      println(s"Process and saving audio file... by $getHandlerName")
    }
    else {
      println("Audio Handler forwards request to Video Handler")
      next.process(file)
    }
  }

  override def getHandlerName(): String = {s}
}
