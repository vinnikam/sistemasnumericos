
package logica;

/**
 *
 * @author Vinni
 */
public class OperacionesNumericas {
    
    public String convertirDecBinario(String numero){
        return convertirDecA(numero, 2);
    }
    public String convertirDecHexadecimal(String numero){
       return convertirDecA(numero, 16);
    }
    public String convertirDecOctal(String numero){
        return convertirDecA(numero, 8);
    }
    public String convertirDecA(String numero, int base){
        long numeroDecimal= Long.parseLong(numero.trim());
        String numConvertido = "";
        if (numeroDecimal<base){
            numConvertido = ""+verificaCifra(numeroDecimal);
            return numConvertido;
        }
        while(numeroDecimal>=base){
            long residuo  = numeroDecimal%base;
            numeroDecimal = numeroDecimal/base;
            
            numConvertido= verificaCifra(residuo)+""+numConvertido;
        }
        if (numeroDecimal == base)
            numeroDecimal = 1;
        numConvertido= numeroDecimal+""+numConvertido;
        return numConvertido;
    }
    public String convertirBinarioTo(String numerBinario, int base, int tamano){
        String numOctal = "";
        numerBinario = this.completar(numerBinario, tamano);
        while(numerBinario.length() >0){
            String cifra= numerBinario.substring(numerBinario.length()-tamano, numerBinario.length());
            numOctal= verificarNumOctalHexa(cifra, base)+numOctal;
            numerBinario = numerBinario.substring(0, numerBinario.length()-tamano);
        }
        return numOctal;
    }
    public String convertirBinarioOctal(String numerBinario){
        return convertirBinarioTo(numerBinario, 8, 3);
    }
    public String convertirBinarioHexa(String numerBinario){
        return convertirBinarioTo(numerBinario, 16, 4);
    }
    public String converirBinarioToDecimal(String numero){
        return converirToDecimal(numero, 2);
    }
    public String converirOctalToDecimal(String numero){
        return converirToDecimal(numero, 8);
    }
    public String converirHexaToDecimal(String numero){
        return converirToDecimal(numero, 16);
    }
    public String converirToDecimal(String numero, long base){
        String resultado=""; 
        long numeroDec = 0;
        String cifras[] = numero.split("");
        int pos = cifras.length-1;
        for (int i = 0; i < cifras.length; i++) {
            numeroDec += Math.pow(base, i)* Integer.parseInt(cifras[pos--]);
        }
        return resultado+numeroDec;
    }
    
    private String verificarNumOctalHexa(String numValidar, int base) {
        String complemento= "";
        String complemento1= "";
        if (base == 16){
            complemento = "0";
            complemento1 = "1";
        }
        if (numValidar.equals(complemento+"000"))
            return "0";
        if (numValidar.equals(complemento+"001"))
            return "1";
        if (numValidar.equals(complemento+"010"))
            return "2";
        if (numValidar.equals(complemento+"011"))
            return "3";
        if (numValidar.equals(complemento+"100"))
            return "4";
        if (numValidar.equals(complemento+"101"))
            return "5";
        if (numValidar.equals(complemento+"110"))
            return "6";
        if (numValidar.equals(complemento+"111"))
            return "7";
        
        if (numValidar.equals(complemento+"000"))
            return "8";
        if (numValidar.equals(complemento1+"001"))
            return "9";
        if (numValidar.equals(complemento1+"010"))
            return "A";
        if (numValidar.equals(complemento1+"011"))
            return "B";
        if (numValidar.equals(complemento1+"100"))
            return "C";
        if (numValidar.equals(complemento1+"101"))
            return "D";
        if (numValidar.equals(complemento1+"110"))
            return "E";
        if (numValidar.equals(complemento1+"111"))
            return "F";
        return "";
       
    }

    private String verificaCifra(long residuo) {
        String numero = ""+residuo;
        if (residuo > 9)
        {
            if (residuo == 10)
                numero = "A";
            if (residuo == 11)
                numero = "B";
            if (residuo == 12)
                numero = "C";
            if (residuo == 13)
                numero = "D";
            if (residuo == 14)
                numero = "E";
            if (residuo == 15)
                numero = "F";
}
        return numero;
    }

    private String completar(String numerBinario, int base) {
        int modulo = base - numerBinario.length()%base;
        for (int i = 0; i < modulo; i++) {
                numerBinario= "0"+numerBinario;
        }    
        return numerBinario;
    }
    
}
