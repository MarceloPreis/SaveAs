package saveXMLorJSON;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.*;


public class SaveAsJSON implements Save {

	@Override
	public boolean salvar(Aluno a) {
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer;
		try {
			writer = new FileWriter("./alunos.json");
			writer.write(gson.toJson(a));
		    writer.close();
		    return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

}
