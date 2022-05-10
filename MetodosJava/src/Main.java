
public class Main {

	public static void main(String[] args) {
		Calculadora.somar(1, 2);
		Calculadora.subtrair(5, 2);
		Calculadora.multiplicar(3, 4);
		Calculadora.dividir(9,3);
		
		
		Mensagem.obterMensagem(10);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(19);
		
		Emprestimo.calcular(1000, 3);
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(3200, 2);
		
		Quadrilatero.area(3);
		Quadrilatero.area(5d, 6d);
		Quadrilatero.area(7, 8, 9);
		Quadrilatero.area(5f, 5f);
	}
}
