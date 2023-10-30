import java.util.Scanner;

public class Cuenta {
    String titular;
    Double valorInicial;
    Scanner sc = new Scanner(System.in);

    //constructores

    public Cuenta() {
        setTitular();
        setvalorInicial();
    }


    //gets y sets

    public String getTitular() {
        return titular;
    }

    public void setTitular() {
        System.out.println("ingresar el nombre de el titular de la cuenta");
        this.titular = sc.nextLine();
    }

    public Double getvalorInicial() {
        return valorInicial;
    }

    public void setvalorInicial() {
        System.out.println("ingresar la cantidad que deseas iniciar");
        this.valorInicial = Double.parseDouble(sc.nextLine());
    }


    //metodos

    public void metodoIngresarCantidad(){
        System.out.println("cuanto deseas ingresar a la cuenta");
        Double valor = Double.parseDouble(sc.nextLine());
        if (valor < 0){
            System.out.println("no puedes poner una cantidad menor a 0");
        }else {
            this.valorInicial = getvalorInicial() + valor;
            System.out.println("la cantidad total que tienes es " + valorInicial);
        }
    }

    public void retirarCantidad(){
        System.out.println("cuanto deseas retirar");
        Double valor = Double.parseDouble(sc.nextLine());
        if (valor > valorInicial){
            System.out.println("no puedes sobre pasar la cantidad que tienes");
        }else {
            this.valorInicial = getvalorInicial() - valor;
            System.out.println("el total que queda es " + valorInicial);
        }
    }
}