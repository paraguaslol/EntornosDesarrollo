
public class pr03 {

	public static void main(String[]args){
		
		String mensaje="APUQTI OSEE  LIT OAM SUGPA OUQ EOCONCZO";
		String mensajeCodificado="";
		String temporal="";	
		
		mensajeCodificado=mensaje.toLowerCase();
		
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


