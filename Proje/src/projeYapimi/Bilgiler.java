package projeYapimi;

public class Bilgiler {

	public String adSoyad;

	public String tc;

	public String telefon;

	public String yil;

	String isim (String adSoyad) {

		return this.adSoyad = adSoyad;
	
	}

	 public boolean tcKontrol(String tc) {
         // TC Kimlik Numarası 11 haneli olmalıdır
         if (tc.length() != 11) {
             return false ;
         }else {
        	 
        	 return true;
        	 
         }
	 }

	
	 public boolean yilKontrol(String yil) {
		 
		 if (yil.length() != 4) {
             return false ;
         }else {
        	 
        	 return true;
        	 
         }
		 
	 }
	 

	public boolean telefonKontrol(String telefonNo) {
		
		if(telefonNo.length()!=11) {
			
			return false;
			
		}else {
			
			return true;
			
		}
		
	}
	
	
	
	

}
