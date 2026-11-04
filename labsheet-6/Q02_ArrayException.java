public class Q02_ArrayException {     
  public static void main(String[] args) {     
     int[] marks = {80, 75, 90}; 
     try {           
       System.out.println(marks[5]);     
     } catch (ArrayIndexOutOfBoundsException e) {    
       System.out.println("Invalid array index.");   
     }   
  } 
} 