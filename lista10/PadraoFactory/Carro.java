package PadraoFactory;


public class Carro implements Veiculo
{
private String modelo;

public String getModelo()
{
    return modelo;
}
public void setModelo(String modelo)
{
    this.modelo = modelo;
}

public Carro(String modelo){
    this.setModelo(modelo);
}
// Implementar métodos get/set
public void buscar(String nomeC){
    System.out.println(this.modelo + " buscando " + nomeC);
}
public void parar(){
    System.out.println(this.modelo + " parado");
}
}