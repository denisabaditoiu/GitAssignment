import java.util.ArrayList;

public class CreatieLiterarara implements CalculeazaMediaNote {
	protected String denumireCarte;
	protected String descriereCarte;
	protected ArrayList<Integer> listaNoteCarte=new ArrayList<>();
	
	public CreatieLiterarara(String denumireCarte, String descriereCarte, ArrayList<Integer> listaNoteCarte) {
		super();
		this.denumireCarte = denumireCarte;
		this.descriereCarte = descriereCarte;
		this.listaNoteCarte = listaNoteCarte;
	}
	
	public float calculeazaSumaNote() {
		int sumaNote=0;
		for(int i = 0; i < listaNoteCarte.size(); i++) {
			sumaNote += listaNoteCarte.get(i);
		}
		return sumaNote;
	}

	@Override
	public float calculeazaMediaNote() {
		return calculeazaSumaNote()/listaNoteCarte.size();
	}
}
