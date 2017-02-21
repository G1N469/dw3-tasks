class exerc{
	public static void main(String[] args){
		// print();
		// print2();
		// quebra();
		table();
	}

	public static void print(){
		System.out.print("3f");
	}

	public static void print2(){
		System.out.print("3f");
		System.out.print("eoq");
	}

	public static void quebra(){
		System.out.print("ggggg \n iuasd");
	}

	public static void balancoTrimestral(){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.print(gastosTrimestre);
		int mediaMensal = gastosTrimestre / 3;
		System.out.print("Valor da media mensal = " + mediaMensal);
	}

	public static void imprimeNumeros(){
		int cont = 150;
		while (cont <= 300) {
			System.out.print(cont + ",");
			cont += 1 ;
		}
	}

	public static void soma1000(){
		int sum = 0;
		int cont = 0;
		while (cont <= 1000) {
			sum += cont;
			cont += 1;
		}
		System.out.print(sum);
	}

	public static void multiplos3(){
		int cont = 1;
		while (cont <= 100) {
			if (cont % 3 == 0) {
				System.out.print(cont  + " ");
			}
			cont += 1;
		}
	}

	public static void fatorial(){
		int cont = 1;
		while (cont <= 10) {
			int cont1 = 1;
			int fat = 1;
			while (cont1 <= cont) {
				fat *= cont1;
				cont1 += 1;
			}
			System.out.print(fat+ " ");
			cont += 1;
		}
	}

	public static void fatorialLongo(){
		long cont = 1;
		while (cont <= 40) {
			long cont1 = 1;
			long fat = 1;
			while (cont1 <= cont) {
				fat *= cont1;
				cont1 += 1;
			}
			System.out.print(fat+ " ");
			cont += 1;
		}
	}

	public static void Fibonacci(){
		int x = 0;
		int y = 1;
		int x1 = 0;
		//System.out.print(0);
		while(x < 100){
			x1 = x;
			x = x + y;
			y = x1;
			if(x > 100){
				break;
			}
			System.out.print(x+"\n");	
		}
	}

	public static void conta(){
		int x = 51;
		while (x != 1) {
			if (x % 2 == 0) {
				x /= 2;
			}
			else{
				x = 3 * x + 1;
			}
			System.out.print(x + "=> ");
		}
	}

	public static void table(){
		int i = 10;
		for (int cont = 1; cont <= i ; cont ++) {
			int sum = 1;
			for (int cont1 = 1; cont1 <= cont ; cont1 ++) {
				sum = cont * cont1;
				System.out.print(sum + " ");
			}
			System.out.print("\n");
		}
	}
}