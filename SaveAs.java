package saveXMLorJSON;

public class SaveAs {
	protected Save save;
	
	public SaveAs(Save save) {
		this.save = save;
	}
	
	public boolean salvar(Aluno a) {
		return this.save.salvar(a);
	}
}
