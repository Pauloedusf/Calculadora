package Defaut;

import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    
	Scanner scan = new Scanner (System.in);
    Numero n1 = new Numero();
    Numero n2 = new Numero();
    Numero res = new Numero();
    String opc;
    String soma = "soma";
    String multiplicacao = "multiplicacao";
    String subtracao = "subtracao";
    String divisao = "divisao";
    
    System.out.println("Digite a operação: ");
    opc = scan.next();
    
      if(opc.equals(soma) ) {
        System.out.println("Digite o primeiro valor: ");
        n1.setValor(scan.nextInt());
        System.out.println("Digite o segundo valor: ");
        n2.setValor(scan.nextInt());
        res.setValor(n1.getValor()+ n2.getValor());
        System.out.println("O resultado da operação desejada foi: " + res.getValor());
      } else  {
    	  if (opc.equals(multiplicacao)) {
    	    System.out.println("Digite o primeiro valor: ");
    	    n1.setValor(scan.nextInt());
    	    System.out.println("Digite o segundo valor: ");
    	    n2.setValor(scan.nextInt());
    	    res.setValor(n1.getValor()* n2.getValor());
    	    System.out.println("O resultado da operação desejada foi: " + res.getValor());
          } else {
    	      if (opc.equals(divisao)) {
        		System.out.println("Digite o primeiro valor: ");
        	    n1.setValor(scan.nextInt());
        	    System.out.println("Digite o segundo valor: ");
          	    n2.setValor(scan.nextInt());
        	    res.setValor(n1.getValor()/ n2.getValor());
        	    System.out.println("O resultado da operação desejada foi: " + res.getValor());
    	      } else {
    	    	  if(opc.equals(subtracao)) {
    	    	    System.out.println("Digite o primeiro valor: ");
    	    	    n1.setValor(scan.nextInt());
    	    	    System.out.println("Digite o segundo valor: ");
    	    	    n2.setValor(scan.nextInt());
    	    	    res.setValor(n1.getValor()- n2.getValor());
    	    	    System.out.println("O resultado da operação desejada foi: " + res.getValor());
    	    	  }
    	      }
            }
        }
 }
}
	
