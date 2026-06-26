package DecisionControlStructure;
public class NestedifElse {
    public static void main(String[] args){
        int number = 10;
        int numbertwo = 15;

        if(number == 100){
            if(numbertwo > 16){
                System.out.print("\nPROGRAM CHOOSE OPERATION A");
            }else if (numbertwo < 16){
                System.out.print("\nPROGRAM CHOOSE OPERATION B");
            }else{
                System.out.print("\nPROGRAM CHOOSE OPERATION C");
            }
        }
        else{
            if(numbertwo > 16){
                System.out.print("\nPROGRAM CHOOSE OPERATION A");
            }else if (numbertwo < 16){
                System.out.print("\nPROGRAM CHOOSE OPERATION B");
            }else{
                System.out.print("\nPROGRAM CHOOSE OPERATION C");
            }

        }
    }
}
