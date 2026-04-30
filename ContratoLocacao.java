//OBEJTO DE CONTRATO, AONDE TEMOS OS ATRIBUTOS DE TAXA DE ALOCAÇÃO, VALOR DO ALUGUEL LÍQUIDO, VALOR DO ALUGUEL BRUTO E A SITUAÇÃO QUE SE ENCONTRA.

public class ContratoLocacao {

    public double taxaLocacao;
    private double valorAluguel;
    public int situacao;
    private double valor;

    

    public ContratoLocacao(int situacao){

        if (situacao > 0 && situacao < 3) {

            this.situacao = situacao;

        }
        
        else {

            this.situacao = 1;

        }

    }

    public double getTaxaLocacao() {

        return this.taxaLocacao;

    }

    public void setTaxaLocacao(double taxaLocacao) {

        this.taxaLocacao = taxaLocacao;

    }

    public double getValorAluguel() {

        return this.valorAluguel;

    }

    public void setValorAluguel(double ValorAluguel) {

        this.valorAluguel = ValorAluguel;

    }

    public String getSituacao() {

        if (situacao == 1) {

            return String.format("Rascunho!");

        }

        else if (situacao == 2) {

            return String.format("Iniciado!");

        }

        else if (situacao == 3) {

            return String.format("Assinado");

        }

        else {

            return String.format("Opcao errado!");

        }

    }

    public double getValor() {

        return this.valor;

    }

    /* APÓS INFORMAR O VALOR DO ALUGUEL. */

    public void setValor(double valor) {

        this.valor = valor;

    }

    public void calcularContrato(double percentual) //Imposivel colocar um retorno do tipo double sendo um método set.
 
    {

        if (percentual >= 3 && percentual <= 7) {

            this.taxaLocacao = percentual / 100;

        }

        else {

            this.taxaLocacao = 0.07;

        }

        this.valor = valorAluguel + (valorAluguel * taxaLocacao);

        this.situacao = 2;

    }

}