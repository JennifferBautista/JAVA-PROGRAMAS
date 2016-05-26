package cadena;

public class cadena {
	String cad;

	 public cadena(){
	    	this.cad = cad;	
	    	System.out.println("Inicio Constructor");
	    }
	 protected void finalize(){
		 System.out.println("FINAL");
		}
		public String get_cad(){
			return this.cad;
		}
		public void set_cadena(String cad){
			this.cad = cad;
		}
		public boolean testCad() {
			if(this.cad.length()< 2){
				return false;
			}
			String new_cad = this.cad.substring(0,2);
			if(new_cad.equals("ca"))
				return true;
				return false;
		}
		
	}


