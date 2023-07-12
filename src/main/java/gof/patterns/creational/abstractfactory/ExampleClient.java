package gof.patterns.creational.abstractfactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class ExampleClient {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		System.out.println("Using factory class: " + factory.getClass());

		DocumentBuilder builder = factory.newDocumentBuilder();
		System.out.println("Got builder class: " + builder.getClass());

		Document doc = builder.newDocument();
		System.out.println("Got document: " + doc.getClass());

	}

}
