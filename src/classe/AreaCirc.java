package classe;

public class AreaCirc {
	double raio;
	static double pi = 3.14;
	
	
	AreaCirc(){		
	}
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	double area() {
		return raio * Math.pow(pi,2);
	}
	

}
