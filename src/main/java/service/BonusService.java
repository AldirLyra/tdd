package service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.model.Funcionario;

public class BonusService 
{
	
	public BigDecimal calcularBonus(Funcionario funcionario) 
	{
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		
		if(valor.compareTo(new BigDecimal("1000")) > 0) 
		{
			throw new IllegalArgumentException("Funcion�rio com o sal�rio maior do que R$10,000 n�o pode receber b�nus!");
		}
		
		return valor.setScale(2, RoundingMode.HALF_UP);
	}
}