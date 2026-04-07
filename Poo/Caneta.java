public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("A cor da caneta é " + this.cor);
        System.out.println("A ponta da caneta é " + this.ponta);
        System.out.println("A carga da caneta é de " + this.carga + " porcento");
        System.out.println("A caneta está tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true){
            System.out.println("ERRO! A caneta está tampada ");
        } else {
            System.out.println("Rabiscando... ");
        }
    }

    void tampar() {
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }

}
