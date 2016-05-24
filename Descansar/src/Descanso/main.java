package Descanso;

public class main {

	public static void main(String[] args) {
		int vacaciones=0, dia_semana=0;
		Descansar descanso;
		descanso = new Descansar(vacaciones,dia_semana);
		System.out.print(descanso.condicion(vacaciones,dia_semana));

	}

}
