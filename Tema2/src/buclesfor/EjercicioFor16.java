package buclesfor;

public class EjercicioFor16 {

    public static void main(String[] args) {
        // 16.- Crea un programa que muestre las diez primeras potencias del número 2 (o sea, 2, 4, 8, 16, etc.).
        int num =2;
        for(int i = 1; i<=10; i++){
            System.out.println(num);
            num = 2*num;
        }
    }

}