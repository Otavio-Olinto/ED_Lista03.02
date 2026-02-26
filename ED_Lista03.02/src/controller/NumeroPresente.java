package controller;

public class NumeroPresente {

	public NumeroPresente() {
		super();
	}
	
	public int quantidade(int numAnalisado, int numRequerido) {
		
		int qnt = 0;
		
		// Se o número recebido for menor que 10, logo ele é o útlimo a ser avaliado
		// Portanto esta é a condição de parada
		// Porém ainda há a necessidade de verificar se este número é igual ao requerido
		// Caso seja retorna 1, senão retorna 0.
		if(numAnalisado<10) {
			if(numAnalisado==numRequerido) return 1;
			return 0;
		}
		
		// Para analisar se os demais dígitos são igual ao requerido, iremos verificar
		// O resto da divisão e caso esse resto seja igual ao que queremos, adiciona-se 1
		// A variavel qnt que será somada no retorno a seguir.
		if(numAnalisado%10==numRequerido) qnt++;
		
		// Após analisa um dos dígitos, o próximo será uma casa decima a cima
		// Para tal basta dividir por 10 e enviar só a parte inteira, já que 
		// A parte que geraria a decimal já foi analisada.
		return qnt+quantidade(numAnalisado/10, numRequerido);
	}

}
