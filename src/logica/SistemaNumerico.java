/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package logica;

/**
 *
 * @author Vinni@
 */
public enum SistemaNumerico {
    Binario(1), Octal(2), Decimal(3), Hexadecimal(4);
    private int codigo;
    SistemaNumerico(int codigo){
        this.codigo =codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    
            
}
