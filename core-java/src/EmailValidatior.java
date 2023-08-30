public class EmailValidatior {
	public static void main(String[] args) {
       String Email="shashankp@gmail.com";
     int iat = Email.indexOf('@');
     int idot = Email.indexOf('.');
     
     if(iat==Email.lastIndexOf('@') && idot == Email.lastIndexOf('.') && iat >= 4 && (idot - iat) >= 3 && (Email.length() - idot) >=2 )
     {
    	 System.out.println("valid mail"); 
     }
     else 
    	 System.out.println("invalid mail");
	}}