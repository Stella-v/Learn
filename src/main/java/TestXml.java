import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class TestXml {
    public static void main(String[] args) {
        SAXReader saxReader = new SAXReader();
        List<StudentPojo> stuList = new ArrayList<StudentPojo>();
        try {
            Document doc = saxReader.read(new File("src/test.xml"));
            Element rootElement = doc.getRootElement();
            List<Element> subElements = rootElement.elements();
            for (Element subElement : subElements) {
                //String ElementName = subElement.getName();
                StudentPojo stu = new StudentPojo();
                String attrValue = subElement.attributeValue("level");
                stu.setLevel(attrValue);
                List<Element> stuProperties = subElement.elements();
                for (Element stuProperty : stuProperties) {
                    String proValue = stuProperty.getStringValue();
                    String propertyName = stuProperty.getName();
                    if(propertyName.equals("name")){
                        stu.setName(proValue);
                    }else if(propertyName.equals("gender")){
                        stu.setGender(proValue);
                    }else if(propertyName.equals("id")){
                        stu.setId(proValue);
                    }

                }
                stuList.add(stu);


            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
