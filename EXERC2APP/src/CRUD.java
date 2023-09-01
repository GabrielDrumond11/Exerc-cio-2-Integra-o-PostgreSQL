import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class CRUD {
	public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost/seuBancoDeDados", "seuUsuario", "suaSenha");
            XDAO xDAO = new XDAO(conexao);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("MENU:");
                System.out.println("1. Listar");
                System.out.println("2. Inserir");
                System.out.println("3. Atualizar");
                System.out.println("4. Excluir");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        List<X> listaX = xDAO.listarTodos();
                        
                        break;
                    case 2:
                       
                        break;
                    case 3:
                       
                        break;
                    case 4:
                       
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        conexao.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
