package study;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXMLFileDOMExample {
   public static final String FileName = "staff.xml";

    public static void main(String[] args) {
        try {
          final File xmlFile = new File(System.getProperty("user.dir")
                  +  File.separator+FileName);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc  = db.parse(xmlFile);
            doc.getDocumentElement().normalize();

            System.out.println("Корневой элемент: "+doc.getDocumentElement().getNodeName());
            System.out.println("==================");
            NodeList nodeList = doc.getElementsByTagName("staff");
            for (int i=0;i<nodeList.getLength();i++){
                Node node = nodeList.item(i);
                System.out.println();
                System.out.println("Текущий элемент: "+node.getNodeName());
                if (Node.ELEMENT_NODE == node.getNodeType()){
                    Element element = (Element) node;
                    System.out.println("ID сотрудника: "+element.getAttribute("id"));
                    System.out.println("Имя: "+element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Фамилия: "+element.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Никнейм: "+element.getElementsByTagName("nickname").item(0).getTextContent());
                    System.out.println("Зарплата: "+element.getElementsByTagName("salary").item(0).getTextContent());
                }

            }
         }  catch (ParserConfigurationException | SAXException | IOException ex){

            Logger.getLogger(ReadXMLFileDOMExample.class.getName()).log(Level.SEVERE,null,ex);
        }


    }
}
