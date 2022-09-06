package saveXMLorJSON;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class Main {

	public static void main(String[] args) {
		Aluno a = new Aluno ("matricula", "13286782963", "20-06-2003", "aluno@aluno.com");
		
		SaveAsJSON json = new SaveAsJSON();
		SaveAsXML xml = new SaveAsXML();
		SaveAs save = new SaveAs(xml);
		System.out.println(save.salvar(a));
		
	}

}
