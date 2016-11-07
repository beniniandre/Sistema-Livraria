package sistema_livraria;

import javax.swing.JOptionPane;

public class Sistema_LivrariaDAO {

    Sistema_LivrariaPOJO pojo = new Sistema_LivrariaPOJO();

    public void cadastrarFuncionario() {
        JOptionPane.showMessageDialog(null, "Cadastro de Funcionários");
        String Nome;
        String Cargo;
        String id;
        String rua;
        String bairro;
        String complemento;
        String numero;

        Nome = JOptionPane.showInputDialog(null, "Nome do funcionário: ");
        Cargo = JOptionPane.showInputDialog(null, "Cargo do funcionário: ");
        id = JOptionPane.showInputDialog(null, "ID do funcionário: ");
        rua = JOptionPane.showInputDialog(null, "Rua: ");
        bairro = JOptionPane.showInputDialog(null, "Bairro: ");
        complemento = JOptionPane.showInputDialog(null, "Complemento: ");
        numero = JOptionPane.showInputDialog(null, "Número: ");

        pojo.setNome_funcionario(Nome);
        pojo.setCargo_funcionario(Cargo);
        pojo.setId_funcionario(Integer.parseInt(id));
        pojo.setEndereco_rua(rua);
        pojo.setEndereco_bairro(bairro);
        pojo.setEndereco_complemento(complemento);
        pojo.setEndereco_numero(Integer.parseInt(numero));
    }

    public void mostrarFuncionarioCadastrado() {
        JOptionPane.showMessageDialog(null, "Nome: " + pojo.getNome_funcionario()
                + "\nCargo: " + pojo.getCargo_funcionario()
                + "\nID: " + pojo.getId_funcionario()
                + "\nRua: " + pojo.getEndereco_rua()
                + "\nBairro: " + pojo.getEndereco_bairro()
                + "\nComplemento: " + pojo.getEndereco_complemento()
                + "\nNúmero: " + pojo.getEndereco_numero());
    }

    public void cadastrarCliente() {
        JOptionPane.showMessageDialog(null, "Cadastro de Clientes");
        String Nome;
        String Email;
        String Telefone;
        String CPF;
        String rua;
        String bairro;
        String complemento;
        String numero;

        JOptionPane.showMessageDialog(null, "Ficha Pessoal");
        Nome = JOptionPane.showInputDialog(null, "Nome do cliente: ");
        Email = JOptionPane.showInputDialog(null, "Email do cliente: ");
        Telefone = JOptionPane.showInputDialog(null, "Telefone do cliente: ");
        CPF = JOptionPane.showInputDialog(null, "CPF do cliente: ");
        JOptionPane.showMessageDialog(null, "Endereço");
        rua = JOptionPane.showInputDialog(null, "Rua: ");
        bairro = JOptionPane.showInputDialog(null, "Bairro: ");
        complemento = JOptionPane.showInputDialog(null, "Complemento: ");
        numero = JOptionPane.showInputDialog(null, "Número: ");

        pojo.setNome_cliente(Nome);
        pojo.setEmail_cliente(Email);
        pojo.setTelefone_cliente(Integer.parseInt(Telefone));
        pojo.setCpf_cliente(Float.parseFloat(CPF));
        pojo.setEndereco_rua(rua);
        pojo.setEndereco_bairro(bairro);
        pojo.setEndereco_complemento(complemento);
        pojo.setEndereco_numero(Integer.parseInt(numero));

    }

    public void mostrarClienteCadastrado() {
        JOptionPane.showMessageDialog(null, "Nome: " + pojo.getNome_cliente()
                + "\nEmail: " + pojo.getEmail_cliente()
                + "\nTelefone: " + pojo.getTelefone_cliente()
                + "\nCPF: " + pojo.getCpf_cliente()
                + "\nRua: " + pojo.getEndereco_rua()
                + "\nBairro: " + pojo.getEndereco_bairro()
                + "\nComplemento: " + pojo.getEndereco_complemento()
                + "\nNúmero: " + pojo.getEndereco_numero());

    }

    public void cadastrarProduto() {
        JOptionPane.showMessageDialog(null, "Cadastro de Produtos");
        String id;
        String Nome;
        String preco;

        Nome = JOptionPane.showInputDialog(null, "Nome do produto: ");
        preco = JOptionPane.showInputDialog(null, "Preço do produto: ");
        id = JOptionPane.showInputDialog(null, "ID do produto: ");

        pojo.setProd_nome(Nome);
        pojo.setProd_preco(Float.parseFloat(preco));
        pojo.setProd_id(Integer.parseInt(id));

    }

    public void mostrarProdutoCadastrado() {
        JOptionPane.showMessageDialog(null, "Nome: " + pojo.getProd_nome()
                + "\nPreço: " + pojo.getProd_preco()
                + "\nID: " + pojo.getProd_id());

    }

    public void cadastrarLivro() {
        JOptionPane.showMessageDialog(null, "Cadastro de Livros");
        String id;
        String nome;
        String autor;
        String genero;
        String preco;

        nome = JOptionPane.showInputDialog(null, "Nome do livro: ");
        autor = JOptionPane.showInputDialog(null, "Autor do livro: ");
        genero = JOptionPane.showInputDialog(null, "Gênero do livro: ");
        preco = JOptionPane.showInputDialog(null, "Preço do livro: ");
        id = JOptionPane.showInputDialog(null, "ID do livro: ");

        pojo.setLivro_nome(nome);
        pojo.setLivro_autor(autor);
        pojo.setLivro_genero(genero);
        pojo.setLivro_preco(Float.parseFloat(preco));
        pojo.setLivro_id(Integer.parseInt(id));

    }

    public void mostrarLivroCadastrado() {
        JOptionPane.showMessageDialog(null, "\nID: "
                + "Nome: " + pojo.getLivro_nome()
                + "\nAutor: " + pojo.getLivro_autor()
                + "\nGênero: " + pojo.getLivro_genero()
                + "\nPreço: " + pojo.getLivro_preco() + pojo.getLivro_id());
    }

    public void compraLivro() {
        JOptionPane.showMessageDialog(null, "Livro a ser comprado: " + pojo.getLivro_nome());
        String qtde = JOptionPane.showInputDialog(null, "Quantos livros deseja comprar: ");
        pojo.setCompra_quantidade(Integer.parseInt(qtde));
        pojo.setCompra_preco_total(pojo.getCompra_quantidade() * pojo.getLivro_preco());

        String dataPedido = JOptionPane.showInputDialog(null, "Data de compra do produto: ");
        pojo.setEncomenda_data_pedido(dataPedido);
        pojo.setEncomenda_nome_produto(pojo.getLivro_nome());
        pojo.setEncomenda_data_entrega(dataPedido);

        JOptionPane.showMessageDialog(null, "Preço total do livro: " + pojo.getCompra_preco_total()
                + "\nData do Pedido: " + pojo.getEncomenda_data_pedido()
                + "\nNome do livro: " + pojo.getEncomenda_nome_produto()
                + "\nData de Entrega: " + pojo.getEncomenda_data_entrega());

    }

    public void compraOutroProduto() {
        JOptionPane.showMessageDialog(null, "Produto a ser comprado: " + pojo.getProd_nome());
        String qtde = JOptionPane.showInputDialog(null, "Quantos produtos deseja comprar: ");
        pojo.setCompra_quantidade(Integer.parseInt(qtde));
        pojo.setCompra_preco_total(pojo.getCompra_quantidade() * pojo.getProd_preco());

        String dataPedido = JOptionPane.showInputDialog(null, "Data de compra do produto: ");
        pojo.setEncomenda_data_pedido(dataPedido);
        pojo.setEncomenda_nome_produto(pojo.getProd_nome());
        pojo.setEncomenda_data_entrega(dataPedido);

        JOptionPane.showMessageDialog(null, "Preço total do produto: " + pojo.getCompra_preco_total()
                + "\nData do Pedido: " + pojo.getEncomenda_data_pedido()
                + "\nNome do produto: " + pojo.getEncomenda_nome_produto()
                + "\nData de Entrega (data atual + 30 dias): " + pojo.getEncomenda_data_entrega());
    }
}
