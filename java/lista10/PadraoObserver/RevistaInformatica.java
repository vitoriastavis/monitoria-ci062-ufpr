package PadraoObserver;

import java.util.Observable;

public class RevistaInformatica extends Observable
{
    private int edicao;
    public int getEdicao(){
    return this.edicao;
    }
    public void setEdicao (int novaEdicao){
        if(novaEdicao > 0)
        {
        this.edicao = novaEdicao;
        /* chamada do método para
        notificar os observadores */
        notifyObservers();
        }
    }
}