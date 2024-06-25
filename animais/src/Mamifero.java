public class Mamifero extends animais{
    int patas;
    double peso; 

    public Mamifero(){

    }

public Mamifero (int patas, double peso){
    this.patas=patas;
    this.peso=peso;
}

public int getPatas() {
    return patas;
}

public void setPatas(int patas) {
    this.patas = patas;
}

public double getPeso() {
    return peso;
}

public void setPeso(double peso) {
    this.peso = peso;
}
}
