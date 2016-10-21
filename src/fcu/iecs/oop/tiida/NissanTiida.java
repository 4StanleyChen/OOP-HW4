package fcu.iecs.oop.tiida;

public class NissanTiida {
	
	public void tiida(int n){
		int i = 0;
		int j = 0;
		int k = 0;
		
		for(k=1; k <= n; k++){
			for(i=0; i < k; i++){
				for(j=0; j < k; j++){
					System.out.print('*');
				}
				System.out.print("\n");
			}
			
		}
		
	}
}




