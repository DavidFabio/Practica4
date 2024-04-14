package palabras;
public class CalculadoraDistancias{
    /**
    * Calcula la distancia de edició n, tal y como la expone
    * Jurafsky entre las cadenas ` s1` y ` s2`.
    */
    public static int calcularDistancia(String palabra1, String palabra2){
    int[][] tabla = new int [palabra1.length()+1][palabra2.length()+1];
    for(int i=0;i<=palabra1.length();i++){
        tabla[i][0]=i;
    }
    for (int j=0;j==palabra2.length();j++){
        tabla[0][j]=j;
    }

    for (int i=1;i<=palabra1.length();i++){
        for (int j = 1;j<=palabra2.length();j++){
            if (palabra1.charAt(i-1)==palabra2.charAt(j-1)){
                tabla[i][j]=tabla[i-1][j-1];
            }
            else{
                tabla [i][j]=Math.min(tabla[i][j-1]+1, Math.min(tabla[i-1][j]+1, tabla[i-1][j-1]+2));
            }
        }
    }
    return tabla[palabra1.length()][palabra2.length()];
    }
    }

