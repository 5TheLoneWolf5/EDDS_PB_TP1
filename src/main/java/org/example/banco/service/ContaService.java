package org.example.banco.service;

import org.example.banco.repository.ContaRepository;
import org.springframework.stereotype.Service;
import org.example.banco.entity.Conta;
import java.util.List;

@Service
public class ContaService {
    private ContaRepository contaRepository;

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public void alterarConta(Long id, Double saldo) {
        try {
            Conta conta = contaRepository.findById(id).get();
            conta.setSaldo(saldo);
            contaRepository.save(conta);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void excluirContaDb(Long id) {
        contaRepository.deleteById(id);
    }

    public List<Conta> consultarContasDb() {
        return contaRepository.findAll();
    }

    public Conta consultarContaDb(Long id) {
        return contaRepository.findById(id).get();
    }

    public void incluirContaDb(String nome, Double saldo) {
        Conta conta = new Conta(null, nome, saldo);
        contaRepository.save(conta);
    }
}
