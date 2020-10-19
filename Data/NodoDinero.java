/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/*
 *
 * @author ANDRES
 */
public class NodoDinero extends Nodo{
    String kind;
    String fecha;
    NodoDinero previous = null;
    NodoDinero next = null;

    public String getKind() {
        return kind;
    }

    public String getFecha() {
        return fecha;
    }

    public NodoDinero(int amount,String kind,String fecha) {
        super(amount);
        this.kind = kind;
        this.fecha = fecha;
    }
    
    
    
}
