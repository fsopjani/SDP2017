package abstractfactory

/**
  * Created by fatos on 11/04/2017.
  */
class LondonErrorXMLParser extends XMLParser{
  override def parse: String = "London Parsing Error XML... \nLondon Error XML Message"
}

class LondonFeedbackXML extends XMLParser{
  override def parse: String = "London Parsing Feedback XML... \nLondon Feedback XML Message"
}


class LondonOrderXMLParser extends XMLParser {
  override def parse: String = "London Parsing Order XML... \nLondon Order XML Message"
}

class LondonResponseXMLParser extends XMLParser{
  override def parse: String = "London Parsing Response XML... \nLondon Response XML Message"
}