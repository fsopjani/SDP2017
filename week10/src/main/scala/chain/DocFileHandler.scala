package chain

case class DocFileHandler(s: String) extends Handler {

  var next: Handler = null

  override def setHandler(handler: Handler): Unit = {
    next = handler
  }

  override def process(file: File): Unit = {
    if (file.fileType.equalsIgnoreCase("doc")) {
      println(s"Process and saving doc file... by $getHandlerName")
    }
    else {
      println("Doc Handler forwards request to Excel Handler")
      next.process(file)
    }
  }

  override def getHandlerName(): String = {s}
}
