package com.mycompany.consumodeautomovel;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsumoDeAutomovel {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        
        System.out.println("Insira a distância percorrida: ");
        int distancia = sc.nextInt();
        
        System.out.println("Insira o total de combustivel gasto: ");
        double combustivelGasto = sc.nextDouble();
        
        double ConsumoMedio = distancia/combustivelGasto;
        
        System.out.println("O consumo médio do seu veículo é: "+df.format(ConsumoMedio)+"km/l");
        
    }
}
