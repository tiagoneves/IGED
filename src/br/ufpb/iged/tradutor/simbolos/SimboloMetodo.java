package br.ufpb.iged.tradutor.simbolos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SimboloMetodo extends SimboloComEscopo {
	
	Map<String, Simbolo> argsOrdenados = new LinkedHashMap<String, Simbolo>();
		
	private boolean estatico;
	
	private int quantidadeVariaveis = 0;
	
	public SimboloMetodo(String nome, Tipo tipoRet, Escopo pai, boolean estatico) {
        super(nome, tipoRet, pai);
    }

    public Map<String, Simbolo> obterMembros() { 
    	return argsOrdenados; 
    }

    /*public String getNome() {
        return nome+"("+stripBrackets(argsOrdenados.keySet().toString())+")";
    }*/

	public boolean isEstatico() {
		return estatico;
	}

	public void setEstatico(boolean estatico) {
		this.estatico = estatico;
	}

	public int getQuantidadeVariaveis() {
		return quantidadeVariaveis;
	}

	public void setQuantidadeVariaveis(int quantidadeVariaveis) {
		this.quantidadeVariaveis = quantidadeVariaveis;
	}

	public void incrementarQuantidadeVariaveis() {
		
		this.quantidadeVariaveis++;
		
	}
	
	public String obterAssinatura(){
		
		String assinatura = nome+"(";
		
		List<String> args = new ArrayList<String>();
		
		args.addAll(argsOrdenados.keySet());
		
		if (!args.isEmpty()){
		
			String fArg = args.remove(0);
			
			SimboloVariavel var = (SimboloVariavel)argsOrdenados.get(fArg);
			
			assinatura += var.getTipo().getNome();
			
			for (String arg : args){
				
				var = (SimboloVariavel)argsOrdenados.get(arg);
				
				assinatura += ","+var.getTipo().getNome();
				
			}
		
		}
		
		return assinatura+")";
		
	}
    
}
