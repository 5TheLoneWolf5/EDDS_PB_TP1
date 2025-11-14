package org.example.banco.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="conta")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double saldo;

    public Conta(String nome, Double saldo) {
    	this.nome = nome;
    	this.saldo = saldo;
	}

	@Override
    public String toString() {
        return id + " - " + nome + " - " + saldo;
    }
	
	public String getNome() {
		return this.nome;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
