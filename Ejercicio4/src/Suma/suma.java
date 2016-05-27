package Suma;

import javax.swing.JOptionPane;

public class suma {

	String a,b,c,d;
	int total;
	
	public suma(){
		
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	public void comparar(String a, String b, String c, String d){
		if(!a.equals(b)&&!a.equals(c)&&!a.equals(d)&&!b.equals(c)&&!b.equals(d)&&!c.equals(d))
			this.total += Integer.parseInt(a) + Integer.parseInt(b)+ Integer.parseInt(c)+ Integer.parseInt(d);
		else
			if(a.equals(b)&&!a.equals(c)&&!a.equals(d)&&!b.equals(c)&&!b.equals(d)&&!c.equals(d))
				this.total +=  Integer.parseInt(c)+ Integer.parseInt(d);
			else
				if(!a.equals(b)&&a.equals(c)&&!a.equals(d)&&!b.equals(c)&&!b.equals(d)&&!c.equals(d))
					this.total += Integer.parseInt(b)+ Integer.parseInt(d);
				else
					if(!a.equals(b)&&!a.equals(c)&&a.equals(d)&&!b.equals(c)&&!b.equals(d)&&!c.equals(d))
						this.total += Integer.parseInt(b)+ Integer.parseInt(c);
					else
						if(!a.equals(b)&&!a.equals(c)&&!a.equals(d)&&b.equals(c)&&!b.equals(d)&&!c.equals(d))
							this.total += Integer.parseInt(a) + Integer.parseInt(d);
						else
							if(!a.equals(b)&&!a.equals(c)&&!a.equals(d)&&!b.equals(c)&&b.equals(d)&&!c.equals(d))
								this.total += Integer.parseInt(a) +  Integer.parseInt(c);
							else
								if(!a.equals(b)&&!a.equals(c)&&!a.equals(d)&&!b.equals(c)&&!b.equals(d)&&c.equals(d))
									this.total += Integer.parseInt(a) + Integer.parseInt(b);
								else
									this.total += 0;
		
	}
	
	public void finalize(){
		JOptionPane.showMessageDialog(null,"El programa se va a cerrar");

	}
}
