
package logica;

/**
 *
 * @author Vinni
 */
public class OperacionesNumericas {
    
    public String convertirDecBinario(long numeroDecimal){
        String numBinario = "";
        
        while(numeroDecimal>=2){
            long residuo  = numeroDecimal%2;
            numeroDecimal = numeroDecimal/2;
            numBinario= residuo+""+numBinario;
        }
        if (numeroDecimal == 2)
            numeroDecimal = 1;
        numBinario= numeroDecimal+""+numBinario;
        return numBinario;
    }
    public String convertirBinarioOctal(String numerBinario){
        String numOctal = "";
        // dividirlo en grupos de 3
        String num= verificarOctal(numOctal);
        
        return numOctal;
    }

    private String verificarOctal(String numOctal) {
        if (numOctal == "000")
            return "0";
        if (numOctal == "001")
            return "1";
        if (numOctal == "010")
            return "2";
        if (numOctal == "011")
            return "3";
        if (numOctal == "000")
            return "0";
        if (numOctal == "000")
            return "0";
        if (numOctal == "000")
            return "0";
        if (numOctal == "000")
            return "0";
        if(numOctal == "000")
            return "0";
        return "";
       
    }
    
}
