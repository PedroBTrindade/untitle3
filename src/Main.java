import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String m="""
                Escolha uma das opções!!!
                
                [1 ]Disney Chanel
                
                [2]Disney XD
                
                [3]Disney Jr
                
                """;
        System.out.println(m);
        m=s.nextLine();
        switch (m){
            case "1":
                System.out.println("Escolha intrigante, esse canal agora é inexistente");

                break;
            case "2":
                System.out.println("Esse ERA muito bom");
                break;
            case "3":
                System.out.println("Isso FOI infância");
                break;




        }


    }
}