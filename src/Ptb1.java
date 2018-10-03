import java.util.Scanner;

public class Ptb1 {
    public static void main(String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a ");
        a = sc.nextDouble();
        System.out.println("Nhap vao so b ");
        b = sc.nextDouble();

        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh vo so nghiem! ");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            if(b==0){
                System.out.println("Phuong trinh co nghiem x = 0 ");
            }else{
                System.out.println("Phuong trinh co nghiem x = " + -b/a);
            }
        }
    }
}
