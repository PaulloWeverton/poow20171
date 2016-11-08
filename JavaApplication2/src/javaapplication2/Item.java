/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Laboratorio
 */
public class Item {
    private int Numero;
    private int Quantidade;
    private int percDesconto;

    /**
     * @return the Numero
     */
    public int getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the Quantidade
     */
    public int getQuantidade() {
        return Quantidade;
    }

    /**
     * @param Quantidade the Quantidade to set
     */
    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    /**
     * @return the percDesconto
     */
    public int getPercDesconto() {
        return percDesconto;
    }

    /**
     * @param percDesconto the percDesconto to set
     */
    public void setPercDesconto(int percDesconto) {
        this.percDesconto = percDesconto;
    }
    
}
