package br.com.cursojava.aula001;

public class Priscilla {
	
	public static String nome = "Meu nome � Priscilla.";
	public static String idade = "Minha idade � 25 anos.";
	public static String time = "Eu n�o tenho time de futebol.";

	public static String Escreve(){
		
		return nome + "\n" + idade + "\n"  +time;
		
	}
	
	public static void main(String[] args){
		System.out.println(Escreve());
	}
}
