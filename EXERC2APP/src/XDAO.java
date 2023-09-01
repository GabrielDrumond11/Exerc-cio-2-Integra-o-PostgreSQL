import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class XDAO {
    private Connection conexao;

    

    public XDAO(Connection conexao) {
        this.conexao = conexao;
    }

    // Métodos CRUD

    public void inserir(X objetoX) throws SQLException {
      
    }

    public X buscarPorId(int id) throws SQLException {
        
        return null;
    }

    public List<X> listarTodos() throws SQLException {
       
        return new ArrayList<>();
    }

    public void atualizar(X objetoX) throws SQLException {
        
    }

    public void excluir(int id) throws SQLException {
       
    }
}