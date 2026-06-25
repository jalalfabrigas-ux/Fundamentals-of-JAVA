package DecisionControlStructure;
public class ifElse {
    public static void main(String[] args){

        int number = 15;
        
        
        System.out.print("FIRST OPERATION");
        if(number <= 15){
            System.out.print("\nTHE PROGRAM CHOOSE A");
        }else{
            System.out.print("\nTHE PROGRAM CHOOSE B");
        }
        System.out.println();

        System.out.print("SECOND OPERATION");

        if(number == 10){
            System.out.print("\nTHE PROGRAM2 CHOOSE A");
        }else if(number == 15){
            System.out.print("\nTHE PROGRAM2 CHOOSE B");
        }else{
            System.out.println("\nNUMBER CANNOT FOUND!");
        }
    }
    
}
