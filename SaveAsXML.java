package saveXMLorJSON;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

public class SaveAsXML implements Save {

	@Override
	public boolean salvar(Aluno a) {
		try {
			FileOutputStream fos = new FileOutputStream(new File("./alunos.xml"));
			XMLEncoder encoder = new XMLEncoder(fos);
			encoder.writeObject(a);
			encoder.close();
			fos.close();
			return true;
		}catch (IOException ex) {
			ex.printStackTrace();
			return false;
		}
	}
}
