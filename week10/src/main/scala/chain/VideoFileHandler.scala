package chain

case class VideoFileHandler(s: String) extends Handler {

  var next: Handler = null

  override def setHandler(handler: Handler): Unit = {
    next = handler
  }

  override def process(file: File): Unit = {
    if (file.fileType.equalsIgnoreCase("video")) {
      println(s"Process and saving video file... by $getHandlerName")
    }
    else {
      println("Video Handler forwards request to Image Handler")
      next.process(file)
    }
  }

  override def getHandlerName(): String = {s}
}
