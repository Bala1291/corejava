package com.xml.keerti;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Test6 {
	
	public static void main(String argv[]) {

		  try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("company");
			doc.appendChild(rootElement);

			// staff elements
			Element staff = doc.createElement("Staff");
			rootElement.appendChild(staff);

			// set attribute to staff element
			Attr attr = doc.createAttribute("id");
			attr.setValue("1");
			staff.setAttributeNode(attr);

			// shorten way
			// staff.setAttribute("id", "1");

			// firstname elements
			Element firstname = doc.createElement("firstname");
			firstname.appendChild(doc.createTextNode("Lakshmi"));
			staff.appendChild(firstname);

			// lastname elements
			Element lastname = doc.createElement("lastname");
			lastname.appendChild(doc.createTextNode("Prasanna"));
			staff.appendChild(lastname);

			// nickname elements
			Element nickname = doc.createElement("nickname");
			nickname.appendChild(doc.createTextNode("Keerthi"));
			staff.appendChild(nickname);

			// salary elements
			Element salary = doc.createElement("salary");
			salary.appendChild(doc.createTextNode("100000"));
			staff.appendChild(salary);

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("D:\\Test\\file.xml"));
			
			// write the content into xml file
						TransformerFactory transformerFactory1 = TransformerFactory.newInstance();
						Transformer transformer1 = transformerFactory.newTransformer();
						DOMSource source1 = new DOMSource(doc);
						StreamResult result1 = new StreamResult(new File("D:\\Test\\file1.xml"));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);
			transformer.transform(source, result1);

			System.out.println("Files saved!");
			ZipFolder zf = new ZipFolder();
		    
		    String folderToZip = "D:/Test";
		    String zipName = "D:/Test.zip";
		            zf.zipFolder(Paths.get(folderToZip), Paths.get(zipName));

		  } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		  } catch (TransformerException tfe) {
			tfe.printStackTrace();
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
class ZipFolder {

	void zipFolder(final Path sourceFolderPath, Path zipPath) throws Exception {
		final ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipPath.toFile()));
		Files.walkFileTree(sourceFolderPath, new SimpleFileVisitor<Path>() {

			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

				zos.putNextEntry(new ZipEntry(sourceFolderPath.relativize(file).toString()));
				Files.copy(file, zos);

				zos.closeEntry();
				return FileVisitResult.CONTINUE;
			}
		});
		zos.close();
	}

}

