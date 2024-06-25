public class animais {

    int id;
    String nome;
    char sexo; 
    String raca; 
    String cor;

    public animais(){

    }

    public animais( int id, String nome, char sexo, String raca, String cor){
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
        this.cor= cor; 

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(String string) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    }

