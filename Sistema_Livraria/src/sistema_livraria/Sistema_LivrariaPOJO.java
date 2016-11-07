package sistema_livraria;

public class Sistema_LivrariaPOJO {

    //funcionário
    String nome_funcionario;
    String cargo_funcionario;
    int id_funcionario;

    //cliente
    String nome_cliente;
    String email_cliente;
    int telefone_cliente;
    float cpf_cliente;

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getCargo_funcionario() {
        return cargo_funcionario;
    }

    public void setCargo_funcionario(String cargo_funcionario) {
        this.cargo_funcionario = cargo_funcionario;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public int getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(int telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

    public float getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(float cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public String getEndereco_rua() {
        return endereco_rua;
    }

    public void setEndereco_rua(String endereco_rua) {
        this.endereco_rua = endereco_rua;
    }

    public String getEndereco_bairro() {
        return endereco_bairro;
    }

    public void setEndereco_bairro(String endereco_bairro) {
        this.endereco_bairro = endereco_bairro;
    }

    public String getEndereco_complemento() {
        return endereco_complemento;
    }

    public void setEndereco_complemento(String endereco_complemento) {
        this.endereco_complemento = endereco_complemento;
    }

    public int getEndereco_numero() {
        return endereco_numero;
    }

    public void setEndereco_numero(int endereco_numero) {
        this.endereco_numero = endereco_numero;
    }

    public String getEncomenda_nome_produto() {
        return encomenda_nome_produto;
    }

    public void setEncomenda_nome_produto(String encomenda_nome_produto) {
        this.encomenda_nome_produto = encomenda_nome_produto;
    }

    public int getEncomenda_data_entrega() {
        return Integer.parseInt(encomenda_data_entrega) + 30;
    }

    public void setEncomenda_data_entrega(String encomenda_data_entrega) {
        this.encomenda_data_entrega = encomenda_data_entrega;
    }

    public String getEncomenda_data_pedido() {
        return encomenda_data_pedido;
    }

    public void setEncomenda_data_pedido(String encomenda_data_pedido) {
        this.encomenda_data_pedido = encomenda_data_pedido;
    }

    public int getLivro_id() {
        return livro_id;
    }

    public void setLivro_id(int livro_id) {
        this.livro_id = livro_id;
    }

    public String getLivro_nome() {
        return livro_nome;
    }

    public void setLivro_nome(String livro_nome) {
        this.livro_nome = livro_nome;
    }

    public String getLivro_autor() {
        return livro_autor;
    }

    public void setLivro_autor(String livro_autor) {
        this.livro_autor = livro_autor;
    }

    public String getLivro_genero() {
        return livro_genero;
    }

    public void setLivro_genero(String livro_genero) {
        this.livro_genero = livro_genero;
    }

    public float getLivro_preco() {
        return livro_preco;
    }

    public void setLivro_preco(float livro_preco) {
        this.livro_preco = livro_preco;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_nome() {
        return prod_nome;
    }

    public void setProd_nome(String prod_nome) {
        this.prod_nome = prod_nome;
    }

    public float getProd_preco() {
        return prod_preco;
    }

    public void setProd_preco(float prod_preco) {
        this.prod_preco = prod_preco;
    }

    public int getCompra_quantidade() {
        return compra_quantidade;
    }

    public void setCompra_quantidade(int compra_quantidade) {
        this.compra_quantidade = compra_quantidade;
    }

    public float getCompra_preco_total() {
        return compra_preco_total;
    }

    public void setCompra_preco_total(float compra_preco_total) {
        this.compra_preco_total = compra_preco_total;
    }

    //endereço
    String endereco_rua;
    String endereco_bairro;
    String endereco_complemento;
    int endereco_numero;

    //encomenda
    String encomenda_nome_produto;
    String encomenda_data_entrega;
    String encomenda_data_pedido;

    //livro
    int livro_id;
    String livro_nome;
    String livro_autor;
    String livro_genero;
    float livro_preco;

    //outros produtos
    int prod_id;
    String prod_nome;
    float prod_preco;

    //compra de produtos
    int compra_quantidade;
    float compra_preco_total;
}
