
public class pr02 {

public static void main(String[]args){
	
	String mensaje="Paquito es el tio mas guapo que conozco";
	String mensajeCodificado="";
	String temporal="";	
	
	mensajeCodificado=mensaje.toUpperCase();
	
	for(int i=0;i<mensajeCodificado.length();i=i+2){
	if(i+1==mensajeCodificado.length()){
		temporal=temporal+mensajeCodificado.charAt(i);
	}else{
		temporal=temporal+mensajeCodificado.charAt(i+1)+mensajeCodificado.charAt(i);
		
	}	
	
	}
	mensajeCodificado=temporal;
	System.out.print(mensajeCodificado);
}

}


