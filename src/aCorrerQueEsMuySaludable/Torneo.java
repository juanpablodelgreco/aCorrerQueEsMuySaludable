package aCorrerQueEsMuySaludable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Torneo {
	private Carrera[] carreras;
	private int cantCarrerasF;
	private int cantCarrerasM;
	private int cantCorredoresLlegaron;
	private int cantCorredores;
	private String inputPath;
	private String outputPath;

	public Torneo(String input, String output) {
		this.inputPath = input;
		this.outputPath = output;
	}

	public void cargarTorneo() {
		try {
			int i = 0, j = 0, nroCarrera = 0, nroCorredor = 0;
			Scanner sc = new Scanner(new File(inputPath));
			cantCorredores = sc.nextInt();
			cantCarrerasF = sc.nextInt();
			cantCarrerasM = sc.nextInt();
			cantCorredoresLlegaron = sc.nextInt();
			carreras = new Carrera[cantCarrerasF + cantCarrerasM];
			Corredor[] corredores = new Corredor[cantCorredores];
			for (i = 0; i < (cantCarrerasF + cantCarrerasM); i++) {
				Carrera c;
				if (i < cantCarrerasF) {
					c = new Carrera(sc.nextInt(), sc.nextInt(), "F");
				} else {
					c = new Carrera(sc.nextInt(), sc.nextInt(), "M");
				}
				carreras[i] = c;
			}
			for (i = 0; i < cantCorredores; i++) {
				Corredor co = new Corredor(sc.nextInt(), sc.next());
				for (j = 0; j < carreras.length; j++) {
					if (co.getEdad() >= carreras[j].getEdadDesde() && co.getEdad() <= carreras[j].getEdadHasta()
							&& co.getSexo().compareTo(carreras[j].getSexo()) == 0) {
						co.setNroTorneo(j + 1);
						corredores[i] = co;
					}
				}
			}
			for (i = 0; i < cantCorredoresLlegaron; i++) {
				nroCorredor = sc.nextInt();
				nroCarrera = corredores[nroCorredor - 1].getNroTorneo();
				if (carreras[nroCarrera - 1].getGanadores().size() < 3) {
					carreras[nroCarrera - 1].getGanadores().add(nroCorredor);
				}
			}
			obtenerResultados();
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void obtenerResultados() {
		try {
			PrintWriter pw = new PrintWriter(new File(outputPath));

			for (int i = 0; i < carreras.length; i++) {
				if (i < this.cantCarrerasF)
					pw.print((i + 1) + " ");
				else
					pw.print(((i + 1) - this.cantCarrerasF) + " ");

				for (int j = 0; j < 3; j++) {
					if (carreras[i].getGanadores().size() > j) {
						if (j != 2)
							pw.print(carreras[i].getGanadores().get(j) + " ");
						else
							pw.println(carreras[i].getGanadores().get(j));
					} else {
						if (j != 2)
							pw.print(0 + " ");
						else
							pw.println(0);
					}

				}
			}
			pw.close();
			System.out.println("Se creo el archivo " + outputPath + " con exito!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
