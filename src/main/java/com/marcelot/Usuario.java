package com.marcelot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuario {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	private String nome;
    private String email;
    private Float salario;
    //...
    
    protected Usuario() {}

    public Usuario(String n, String e) {
        this.nome = n;
        this.email = e;
    }

    public Usuario(String n, String e, Float s) {
    	this.nome = n;
        this.email = e;
        this.salario = s;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	@Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', salary='%.2f']",
                id, nome, email, salario);
    }
	

}
