package org.example.banco;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.example.banco.entity.Conta;
import org.example.banco.repository.ContaRepository;
import org.example.banco.service.ContaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ContaServiceTests {
	
	@Mock
	private ContaRepository contaRepository;
	
	@InjectMocks
	private ContaService contaService;
	

	/**
	 * Test method for {@link org.example.banco.service.ContaService#ContaService(org.example.banco.repository.ContaRepository)}.
	 */
	@Test
	void testContaService() {
		Conta contaMockada = new Conta("LP", 100D);
		when(contaRepository.findById(1L)).thenReturn(Optional.of(contaMockada));
		assertEquals(contaService.consultarContaDb(1L).getNome(), "LP");
	}

}
