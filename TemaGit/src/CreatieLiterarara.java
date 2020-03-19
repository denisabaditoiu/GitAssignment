import java.util.ArrayList;

public class CreatieLiterarar {
	protected String denumireCarte;
	protected String descriereCarte;
	protected ArrayList<Integer> listaNoteCarte=new ArrayList<>();
	
	public CreatieLiterarar(String denumireCarte, String descriereCarte, ArrayList<Integer> listaNoteCarte) {
		super();
		this.denumireCarte = denumireCarte;
		this.descriereCarte = descriereCarte;
		this.listaNoteCarte = listaNoteCarte;
	}
}
