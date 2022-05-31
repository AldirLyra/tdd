package service;

import java.math.BigDecimal;

import br.com.alura.tdd.model.Desempenho;
import br.com.alura.tdd.model.Funcionario;

public class ReajusteService 
{
	public void concederReajuste(Funcionario funcionario, Desempenho desempenho)
	{
		BigDecimal percentual = desempenho.percentualReajuste();
		BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
		funcionario.reajustarSalario(reajuste);
	}
}
