package tarea.pkg2;

  import java.util.Scanner;
  public class Tarea2 {
          public static void main(String[] args){
          String cadena;
          int resul, a, b;
         
        Scanner cade=new Scanner(System.in);
        System.out.println("Introduzca una cadena");
        cadena = cade.nextLine();
        String[] parts = cadena.split(" ");
       
           String part1 = parts[0];
            String part2 = parts[1];
             String part3 = parts[2];
             
            a= Integer.parseInt(part1);
            b= Integer.parseInt(part3);
         
          if (part2.equals("+")) {
               resul= (a)+(b);
               System.out.println(resul);
            }
                   if(part2.equals("-")){
                      resul= (a)-(b);
                      System.out.println(resul);
                   }
                              if(part2.equals("*")){
                                 resul= (a)*(b);
                                 System.out.println(resul);
                    
                                }
                                      if(part2.equals("/")){
                                         resul= (a)/(b);
                                         System.out.println(resul);
                                        }
                                      
    }
                
}
     
