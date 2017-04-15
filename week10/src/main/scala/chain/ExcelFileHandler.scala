package chain

case class ExcelFileHandler(s: String) extends Handler {

  var next: Handler = null

  override def setHandler(handler: Handler): Unit = {
    next = handler
  }

  override def process(file: File): Unit = {
    if (file.fileType.equalsIgnoreCase("excel")) {
      println(s"Process and saving excel file... by $getHandlerName")
    }
    else {
      println("Excel Handler forwards request to Audio Handler")
      next.process(file)
    }
  }

  override def getHandlerName(): String = {
    "Excel Handler"
  }
}
