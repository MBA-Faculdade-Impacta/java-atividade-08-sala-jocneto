package br.com.impacta.lab

public class PessoaFisica implements Pessoa{

private String documento;
private String tipo;

public String setDocumento(String documento){
  this.documento = documento;
}

public String setTipo(String tipo){
  this.tipo = tipo;
}

public String falarDocumento(){
  return this.documento;
  }
public String getTipo{
  return this.tipo;
}

}