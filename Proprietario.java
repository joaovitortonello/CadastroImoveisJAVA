//OBJETO PROPIETÁRIO CRIA SOMENTE O DONO DO IMÓVEL

public class Proprietario {

    public String nome;

    public Proprietario() {

        this.nome = "Desconhecido";
        
    }

    public String getNome() {

        return this.nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

}