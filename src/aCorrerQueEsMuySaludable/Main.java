package aCorrerQueEsMuySaludable;

public class Main {
	public static void main(String[] args) {
		int numero = 1;
		Torneo t = new Torneo("./lote_de_pruebas/Inputs/" + numero + ".in",
				"./lote_de_pruebas/Outputs/" + numero + ".out");
		t.cargarTorneo();
	}
}
