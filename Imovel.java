//OBJTEO DO IMÓVEL, CRIA O NUMERO DO IMÓVEL E O NÚMERO DE QUARTOS.

public class Imovel{

    private int numero;
    private int nroquartos; //Impossível colocar implementar "nro quartos" pois nome da variável não pode ter espaço.

    public Imovel() {

        this.numero = 0;
        this.nroquartos = 0;

    }

    public int getNumero() {

        return this.numero;

    }

    public void setNumero(int numero) {

        this.numero = numero;

    }

    public int getNroquartos() {

        return this.nroquartos;

    }

    public void setNroquartos(int nroquartos) {

        this.nroquartos = nroquartos;

    }

}