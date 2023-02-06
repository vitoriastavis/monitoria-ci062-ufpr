package PadraoObserver;

import java.util.Observable;
import java.util.Observer;


public class Assinante1 implements Observer
    {
    Observable revistaInf;
    int edicaoNovaRevista;

    public Observable getRevistaInf() {
        return revistaInf;
    }
    public void setRevistaInf(Observable revistaInf) {
        this.revistaInf = revistaInf;
    }

    public Assinante1(Observable revistaInfo){
        this.setRevistaInf(revistaInfo);
        revistaInf.add(this);
    }
    // Implementar métodos get/set

    public void update(Observable revistaInfo){
        if(revistaInfo instanceof RevistaInformatica){
        RevistaInformatica rev = (RevistaInformatica) revistaInfo;
        this.edicaoNovaRevista = rev.getEdicao();
        System.out.print("Atenção! Edição ” +edicaoNovaRevista+ “disponível");
        }   
    }
}