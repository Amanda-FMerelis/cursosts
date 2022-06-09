package com.amandamer.cursosts;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amandamer.cursosts.domain.Categoria;
import com.amandamer.cursosts.domain.Cidade;
import com.amandamer.cursosts.domain.Cliente;
import com.amandamer.cursosts.domain.Endereco;
import com.amandamer.cursosts.domain.Estado;
import com.amandamer.cursosts.domain.ItemPedido;
import com.amandamer.cursosts.domain.Pagamento;
import com.amandamer.cursosts.domain.PagamentoComBoleto;
import com.amandamer.cursosts.domain.PagamentoComCartao;
import com.amandamer.cursosts.domain.Pedido;
import com.amandamer.cursosts.domain.Produto;
import com.amandamer.cursosts.domain.enums.EstadoPagamento;
import com.amandamer.cursosts.domain.enums.TipoCliente;
import com.amandamer.cursosts.repositories.CategoriaRepository;
import com.amandamer.cursosts.repositories.CidadeRepository;
import com.amandamer.cursosts.repositories.ClienteRepository;
import com.amandamer.cursosts.repositories.EnderecoRepository;
import com.amandamer.cursosts.repositories.EstadoRepository;
import com.amandamer.cursosts.repositories.ItemPedidoRepository;
import com.amandamer.cursosts.repositories.PagamentoRepository;
import com.amandamer.cursosts.repositories.PedidoRepository;
import com.amandamer.cursosts.repositories.ProdutoRepository;

@SpringBootApplication

public class CursostsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursostsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
