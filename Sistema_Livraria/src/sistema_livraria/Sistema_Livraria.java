package sistema_livraria;

import javax.swing.JOptionPane;

public class Sistema_Livraria {

    public static void main(String[] args) {
        Sistema_LivrariaDAO dao = new Sistema_LivrariaDAO();

        String op1;
        String opCadastro;
        String opCompra;
        while (true) {

            op1 = JOptionPane.showInputDialog("Qual das opções você deseja: \n 1) Cadastro de Produtos \n 2) Cadastro de Funcionários \n 3) Cadastrar Cliente \n 4) Outras opções");
            switch (op1) {
                case "1":

                    opCadastro = JOptionPane.showInputDialog(null, "Você deseja cadastrar: \n 1) Livros \n 2) Outros produtos");
                    if ("1".equals(opCadastro)) {
                        dao.cadastrarLivro();
                    } else if ("2".equals(opCadastro)) {
                        dao.cadastrarProduto();
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                    }
                    break;
                    
                case "2":
                    dao.cadastrarFuncionario();
                    break;
                    
                case "3":
                    dao.cadastrarCliente();
                    break;
                    
                case "4":
                    opCompra = JOptionPane.showInputDialog(null, " 1) Comprar Livro \n 2) Comprar Outro Produto \n 3) Mostrar Cadastro Cliente \n 4) Mostrar Cadastro Funcionário \n 5) Mostrar Livro Cadastrado \n 6) Mostrar Outros Produtos");
                    switch (opCompra) {
                        case "1":
                            dao.compraLivro();
                            break;
                            
                        case "2":
                            dao.compraOutroProduto();
                            break;
                            
                        case "3":
                            dao.mostrarClienteCadastrado();
                            break;
                            
                        case "4":
                            dao.mostrarFuncionarioCadastrado();
                            break;
                            
                        case "5":
                            dao.mostrarLivroCadastrado();
                            break;
                            
                        case "6":
                            dao.mostrarProdutoCadastrado();
                            break;
                           
                        default:
                            JOptionPane.showMessageDialog(null, "Opção Inválida");
                            break;
                    }
            }
        }
    }

}
