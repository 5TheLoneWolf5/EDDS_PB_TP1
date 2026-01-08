package org.example.banco;

import org.example.banco.entity.Conta;
import org.example.banco.service.ContaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class CrudT1Application implements CommandLineRunner {

    private final ContaService contaService;

    public CrudT1Application(ContaService contaService) {
        this.contaService = contaService;
    }

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "mysql");
        SpringApplication.run(CrudT1Application.class, args);
    }

    @Override
    public void run(String... args) {
//        consultarConta();
//        System.out.println("\n");
//        consultarContas();
//        System.out.println("\n");
//        incluirConta();
//        consultarContas();
//        System.out.println("\n");
//        excluirConta();
//        alterarSaldo();
//        System.out.println("\n");
//        consultarContas();
    }

//    public void alterarSaldo() {
//        contaService.alterarSaldoConta(2L, 150D);
//    }
//
//    public void consultarConta() {
//        long id = 1;
//        Optional<Conta> conta = contaService.consultarContaDb(id);
//        System.out.println(conta);
//    }
//
//    public void excluirConta() {
//        long id = 4;
//        contaService.excluirContaDb(id);
//    }
//    public void incluirConta() {
//    	Conta conta = new Conta("Felipe", 400.00);
//        contaService.incluirContaDb(conta);
//    }
//
//    public void consultarContas() {
//        List<Conta> contas = contaService.consultarContasDb();
//        for (Conta conta : contas) {
//            System.out.println(conta);
//        }
//    }
}
