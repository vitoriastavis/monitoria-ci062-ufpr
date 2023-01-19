package PadraoFactory;

public class Moto implements Veiculo
{
private String placa;

public String getPlaca()
{
    return placa;
}
public void setPlaca(String placa)
{
    this.placa = placa;
}

public Moto(String placa){
    this.setPlaca(placa);
}
// Implementar métodos get/set
public void buscar(String nomeC){
    System.out.println(this.placa + " buscando " + nomeC);
}
public void parar(){
    System.out.println(this.placa + " parado");
}
}