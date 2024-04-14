package aplicacion;

import palabras.CalculadoraDistancias;

public class Principal{
    public static void main(String[] args){
        System.out.println("La distancia entre las palabras trote y postre es " + 
                            CalculadoraDistancias.calcularDistancia("trote", "postre"));
    }
}
