package Persona;

public class main {

	public static void main(String[] args) {
		persona_clase objeto1 = new persona_clase("0804471548", "JENNIFFER", "BAUTISTA ANGULO", 1995, "0990986293", "QUITO", 0);
		persona_clase objeto2 = new persona_clase("0854646460", "FRANCHESKA", "VERA ORTIZ", 1982, "0939180823", "GUAYAQUIL", 1);
		persona_clase objeto3 = new persona_clase("0689403034", "LEONIDAS", "DELGADO UGALDE", 1971, "0923343289", "CUENCA", 1);
		persona_clase objeto4 = new persona_clase("022234o452", "NATHALI", "MEJIA CRUEL", 1995, "0988084703", "ESMERALDAS", 0);
		
		System.out.println("-----PERSONA 1-----");
		System.out.print(objeto1.mostrarDatos(objeto1));
        objeto1.vive_Esmeraldas("QUITO");
        objeto1.mas_30(1995);
        objeto1.Casado(0);
         
        System.out.println("-----PERSONA 2-----");
        System.out.print(objeto2.mostrarDatos(objeto2));
        objeto2.vive_Esmeraldas("GUAYAQUIL");
        objeto2.mas_30(1982);
        objeto2.Casado(1);

        System.out.println("-----PERSONA 3-----");
        System.out.print(objeto3.mostrarDatos(objeto3));
        objeto3.vive_Esmeraldas("CUENCA");
        objeto3.mas_30(1971);
        objeto3.Casado(1);
        
        System.out.println("-----PERSONA 4-----");
        System.out.print(objeto4.mostrarDatos(objeto4));
        objeto4.vive_Esmeraldas("ESMERALDAS");
        objeto4.mas_30(1995);
        objeto4.Casado(0);
	}


}
