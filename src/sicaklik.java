import java.util.Scanner;

public class sicaklik {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int  heat;
        System.out.print("sıcaklık giriniz:");
        heat=input.nextInt();

        if(heat<5){
            System.out.println("kayak yapabilirsiniz");

        }else if (heat<=25){
            if(heat<=15){
                System.out.println("sinemaya gidebilirsiniz.");

            } if(heat>=10){
                System.out.println("piknik yapabilirsiniz.");

            }

        }else
            System.out.println("yüzme yapabilirsiniz.");


    }
}
