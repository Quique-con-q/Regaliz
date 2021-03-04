/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regaliz;

/**
 *
 * @author Elisabet
 */
public  class Regaliz{
	 /**
          * @param
          */
	 private int unidades;
	 private int coste_unidad;
	 private String color;
	 private int unidades_max;
	 
	
	public Regaliz(){}/**Constructor por defecto*/
	
	/**
         * 
         * @param n_unidades
         * @param coste_unidad
         * @param color
         * @param n_unidades_max 
         */
	public Regaliz (int n_unidades, int coste_unidad, String color, int n_unidades_max)	{
	
	this.unidades=n_unidades;
	this.coste_unidad=coste_unidad;
	this.color=color;
	this.unidades_max=n_unidades_max;

}
/**
* 
* @return 
*/
public int obtener_unidades(){return getUnidades();}

/**
 * 
 * @param n_unidades
 * @param dinero
 * @throws Exception 
 */
public void comprar (int n_unidades, int dinero) throws Exception
{
 if (dinero <= 0) {
            throw new Exception("No puedes comprar sin dinero");
        }

        if (dinero <(n_unidades/getCoste_unidad())) {
            throw new Exception("No te llega para la compra");
        }
        
            setUnidades(getUnidades() + n_unidades);  
}/**Realiza la acción de comprar regaliz*/

/**@throws excepcion si la maquina esta llena o superara su capacidad máxima*/
public void recargar(int n_unidades) throws Exception{
	if ((getUnidades()+n_unidades)>getUnidades_max() ){throw new Exception("No se pueden cargar mas unidades de las que caben en la maquina");}	
		
		
	setUnidades(getUnidades() - n_unidades);
	
}

    /**
     * @return the unidades
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades the unidades to set
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return the coste_unidad
     */
    public int getCoste_unidad() {
        return coste_unidad;
    }

    /**
     * @param coste_unidad the coste_unidad to set
     */
    public void setCoste_unidad(int coste_unidad) {
        this.coste_unidad = coste_unidad;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the unidades_max
     */
    public int getUnidades_max() {
        return unidades_max;
    }

    /**
     * @param unidades_max the unidades_max to set
     */
    public void setUnidades_max(int unidades_max) {
        this.unidades_max = unidades_max;
    }    

}
