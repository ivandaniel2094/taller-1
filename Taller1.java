import java.text.DecimalFormat;
import java.util.Scanner;

public class Taller No.1 {
	
	public static void main(String[] args) {
		//PUNTO 2.A--------------------------------------------------------------------------------

		float RadCirc;
		double AreaCirculo;
		double DiametroCirculo;
		double LongitudCirculo;
		DecimalFormat decimales = new DecimalFormat("0.00");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el valor del radio de la circunferencia:");
		
		RadCirc = entrada.nextFloat();
		
		AreaCirculo = 3.14 * Math.pow(RadCirc, 2);
		DiametroCirculo = RadCirc * 2;
		LongitudCirculo = 2 * 3.14 * RadCirc;
		
		System.out.println("\nEl área de la circunferencia es de " + decimales.format(AreaCirculo));
		System.out.println("El diametro de la circunferencia es de " + decimales.format(DiametroCirculo));
		System.out.println("La longitud de la circunferencia es de " + decimales.format(LongitudCirculo));
		
		//PUNTO .B--------------------------------------------------------------------------------
		
		float BaseTriangulo;
		float AlturaTriangulo;
		float AreaTriangulo;
		Scanner EntradaBase = new Scanner(System.in);
		Scanner EntradaAltura = new Scanner(System.in);
		
		System.out.println("Ingrese la base del triangulo:");
		BaseTriangulo = EntradaBase.nextFloat();
		System.out.println("\n Ingrese la altura del triangulo:");
		AlturaTriangulo = EntradaAltura.nextFloat();
		AreaTriangulo = BaseTriangulo * AlturaTriangulo /2;
		
		System.out.println("\n El area del triangulo es: " + decimales.format(AreaTriangulo));
		System.out.println("La grafica del triangulo es: \n" + "    *\n   * *\n  * * *\n * * * *\n* * * * *\n");
		
		//PUNTO .C--------------------------------------------------------------------------------
		
		int HorasDiurnas;
		int HorasNocturnas;
		int HorasDominicales;
		int HorasFestivos;
		Scanner entradaHorasDiurnas = new Scanner(System.in), entradaHorasNocturnas = new Scanner(System.in), 
				entradaHorasDominicales = new Scanner(System.in), entradaHorasFestivo = new Scanner(System.in);
				
		int valorHorasDiurnas;
		double valorHorasNocturnas;
		double valorHorasDominicales;
		double valorHorasFestivos;
		double totalSalario;
		
		System.out.println("Ingrese las horas diurnas:");
		horasDiurnas = entradaHorasDiurnas.nextInt();
		
		System.out.println("\n Ingrese las horas nocturnas:");
		horasNocturnas = entradaHorasNocturnas.nextInt();
		
		System.out.println("\n Ingrese las horas dominicales:");
		horasDominicales = IngresoHorasDominicales.nextInt();
		
		System.out.println("\n Ingrese las horas festivos:");
		horasFestivos = entradaHorasFestivo.nextInt();
		
		valorHorasDiurnas = horasDiurnas * 2500;
		valorHorasNocturnas = (2500 * horasNocturnas * 0.35) + 2500 * horasNocturnas;
		valorHorasDominicales = (2500 * horasDominicales * 0.50) + 2500 * horasDominicales;
		valorHorasFestivos = (2500 * horasFestivos * 0.75) + 2500 * horasFestivos;
		totalSalario = valorHorasDiurnas + valorHorasNocturnas + valorHorasDominicales + valorHorasFestivos;
		
		System.out.println("\nValor horas diurnas: $" + valorHorasDiurnas);
		System.out.println("Valor horas nocturnas: $" + Math.round(valorHorasNocturnas));
		System.out.println("Valor horas dominicales: $" + Math.round(valorHorasDominicales));
		System.out.println("Valor horas festivos: $" + Math.round(valorHorasFestivos));
		System.out.println("Total salario: $" + Math.round(totalSalario));
		
		//PUNTO .D--------------------------------------------------------------------------------
		
		int num;
		int resultado;
		Scanner entradaNumero = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el numero a multiplicar");
		
		num = entradaNumero.nextInt();
		System.out.println("\n La tabla de multiplicar del numero " + num + " es:\n");
		
		for(int m = 1; m <= 10; c++) {
			resultado = num * m;
			System.out.println(numero + " x " + m + " = " + resultado);
		}
		
		//PUNTO .E--------------------------------------------------------------------------------
		
		int ValDolar;
		int CantDolar;
		Scanner entradaDolar = new Scanner(System.in), entradaCantidad = new Scanner(System.in);
		int TotalDolar;
		
		System.out.println("Ingrese el valor del dolar:");
		
		ValDolar = entradaDolar.nextInt();
		
		System.out.println("\n Ingrese la cantidad de dolares:");
		
		cantDolar = entradaCantidad.nextInt();
		TotalDolar = valDolar * cantDolar;
		
		System.out.println("\n Total de dinero en dolares: " + TotalDolar);
		
		//PUNTO 3.A--------------------------------------------------------------------------------
		
		int Negativo;
		Scanner entradaNum = new Scanner(System.in);
		
		System.out.println("Ingrese un numero:");
		
		Negativo = entradaNum.nextInt();
		
		if(Negativo < 0) {
			System.out.println("\nEl numero " + Negativo + " es negativo.");
		}else {
			System.out.println("\nEl numero " + Negativo + " es positivo.");
		}
		
		//PUNTO .B--------------------------------------------------------------------------------
		
		int Valor;
		int Primo = 0;
		Scanner entradaPrimo = new Scanner(System.in);
		
		System.out.println("Por favor ingrese un numero");
		
		Valor = entradaPrimo.nextInt();
		
		for(int i = 1; i < Valor; i++) {
			if(Valor % i == 0) {
				Primo++;
			}
		}
		
		if(Primo >= 2) {
			System.out.println("\nEl numero " + Valor + " no es un numero primo");
		}else {
			System.out.println("\nEl numero " + Valor + " es un numero primo");
		}
		
		//PUNTO .C--------------------------------------------------------------------------------
		
		int numEntero;
		Scanner entradaNumE = new Scanner(System.in);
		
		System.out.println("Por favor ingrese un numero entero:");
		
		numEntero = entradaNumE.nextInt();
		
		if(numEntero % 2 == 0) {
			System.out.println("\nEl numero " + numEntero + " es un numero par");
		}else {
			System.out.println("\nEl numero " + numEntero + " no es un numero par");
		}
		
		//PUNTO .D--------------------------------------------------------------------------------
		
		int NumEnt;
		double resultadoNum;
		Scanner entradaNum = new Scanner(System.in);
		
		System.out.println("Ingrese un número entero");
		
		NumEnt = entradaNum.nextInt();
		
		if(NumEnt % 2 == 0) {
			resultadoNum = Math.pow(NumEnt, 2);
			System.out.println("\n El resultado de elevar " + NumEnt + " al cuadrado es: " + Math.round(resultadoNum));
		}else {
			resultadoNum = Math.pow(numE, 3);
			System.out.println("\n El resultado de elevar " + NumEnt + " al cubo es: " + Math.round(resultadoNum));
		}
		
		//PUNTO .E--------------------------------------------------------------------------------
		
		int num1, num2, num3;
		Scanner entradaNum1 = new Scanner(System.in), entradaNum2 = new Scanner(System.in), entradaNum3 = new Scanner(System.in);
		
		System.out.println("Por favor ingrese tres numeros:");
		
		num1 = entradaNum1.nextInt();
		num2 = entradaNum2.nextInt();
		num3 = entradaNum3.nextInt();
		
		if(num1 > num2 && num2 > num3) {
			System.out.println("El maximo de los tres numero es: " + num1);
		}else if(num1 < num2 && num2 < num3) {
			System.out.println("El maximo de los tres numero es: " + num3);
		}else {
			System.out.println("El maximo de los tres numero es: " + num2);
		}
		
		//PUNTO .F--------------------------------------------------------------------------------
		
		int Num4, Num5, Num6;
		Scanner entradaNumero1 = new Scanner(System.in), entradaNumero2 = new Scanner(System.in), entradaNumero3 = new Scanner(System.in);
		
		System.out.println("Por favor ingrese tres numeros:");
		
		Num4 = entradaNumero1.nextInt();
		Num5 = entradaNumero2.nextInt();
		Num6 = entradaNumero3.nextInt();
		
		if(Num4 > Num5 && Num5 > Num6) {
			System.out.println("Numeros ordenados: " + Num4 + ", " + Num5 + ", " + Num6);
		}else if(Num4 > Num6 && Num6 > Num5) {
			System.out.println("Numeros ordenados: " + Num4 + ", " + Num6 + ", " + Num5);
		}else if(Num4 < Num5 && Num4 > Num6) {
			System.out.println("Numeros ordenados: " + Num5 + ", " + Num4 + ", " + Num6);
		}else if(Num6 < Num5 && Num4 < Num6) {
			System.out.println("Numeros ordenados: " + Num5 + ", " + Num6 + ", " + Num4);
		}else if(Num4 < Num5 && Num5 < Num6) {
			System.out.println("Numeros ordenados: " + Num6 + ", " + Num5 + ", " + Num4);
		}else if(Num4 < Num6 && Num4 > Num5) {
			System.out.println("Numeros ordenados: " + Num6 + ", " + Num4 + ", " + Num5);
		}
		
		//PUNTO .G--------------------------------------------------------------------------------
		
		String cadena;
		int Cant = 0;
		Scanner entradaCadena = new Scanner(System.in);
		
		System.out.println("Ingrese un texto:");
		
		cadena = entradaCadena.nextLine();
		
		for(int f = 1; f <= cadena.length(); f++) {
			cant++;
		}
		System.out.println("\n La cantidad de caracteres contenido en el texto " + cadena + " es: " + cant);
	}
}
