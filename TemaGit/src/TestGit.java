import java.util.ArrayList;

public class TestGit {

	public static void main(String[] args) {
		System.out.println("Hello Git! Denumirea proiectului de licenta este: 'Aplicatie web pentru promovarea si diseminarea creatiilor literare'");
		ArrayList<Integer> listaNoteCarte = new ArrayList<Integer>();
		listaNoteCarte.add(10);
		listaNoteCarte.add(9);
		listaNoteCarte.add(10);
		CreatieLiterarara creatieLiterara=new CreatieLiterarara("Fluturi", "Dezvoltare personala", listaNoteCarte);
		creatieLiterara.calculeazaSumaNote();
		System.out.println(creatieLiterara.calculeazaMediaNote());
	}

}
