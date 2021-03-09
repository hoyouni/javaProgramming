package days19;

public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.htmll");
	}
}

interface Parseable { 
	void parse(String fileName);
}//구문 분석 작업을 위한 인터페이스


class XMLParser implements Parseable { 
	@Override
	public void parse(String fileName) {
		System.out.println(fileName + "-XML Parsing completed");
	}
}//구문 분석 작업 수행하는 클래스


class HTMLParser implements Parseable {
	@Override
	public void parse(String fileName) {
		System.out.println(fileName + "-HTML parsing completed");
	}
}

class ParserManager {
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			Parseable p = new XMLParser();
			return p;
		} else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

