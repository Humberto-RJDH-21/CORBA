/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corba.servidor;

import example.fibonacciPOA;

/**
 *
 * @author humberto
 */
public class Impl extends fibonacciPOA {

    @Override
    public String generar(int numero) {
        String cadena = "";
        for (int i = 1; i <= numero; i++) {
            
            cadena += fibonacci(i) + " ";
        }
        return cadena;
    }

    int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);  //función recursiva
        } else if (n == 1) {  // caso base
            return 1;
        } else if (n == 0) {  // caso base
            return 0;
        } else { //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

}
