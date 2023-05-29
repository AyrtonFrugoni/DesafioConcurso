package entities;

public class Pessoa {

	    private String nome;
	    private double notaEtapa1;
	    private double notaEtapa2;

	    public Pessoa(String nome, double notaEtapa1, double notaEtapa2) {
	        this.nome = nome;
	        this.notaEtapa1 = notaEtapa1;
	        this.notaEtapa2 = notaEtapa2;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public double getNotaEtapa1() {
	        return notaEtapa1;
	    }

	    public double getNotaEtapa2() {
	        return notaEtapa2;
	    }
	}


