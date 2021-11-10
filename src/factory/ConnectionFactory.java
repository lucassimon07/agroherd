
package factory;
 
import java.sql.Connection;
import java.sql.DriverManager;
 
public class ConnectionFactory {
 
   //Nome do usuário do mysql
   private static final String USERNAME = "postgres";
 
   //Senha do mysql
   private static final String PASSWORD = "masterkey";
 
   //Dados de caminho, porta e nome da base de dados que irá ser feita a conexão
   private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/vacas";
   /**
   * Cria uma conexão com o banco de dados MySQL utilizando o nome de usuário e senha fornecidos
   * @param username
   * @param senha
   * @return uma conexão com o banco de dados
   * @throws Exception
   */
   public static Connection createConnectionToPostgreSql() throws Exception{
      Class.forName("org.postgresql.Driver"); //Faz com que a classe seja carregada pela JVM
 
      //Cria a conexão com o banco de dados
      Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
 
      return connection;
   }
   public static void main(String[] args) throws Exception{
 
      //Recupera uma conexão com o banco de dados
      Connection con = createConnectionToPostgreSql();
 
      //Testa se a conexão é nula
      if(con != null){
         System.out.println("Conexão obtida com sucesso!" + con);
         con.close();
      }
 
   }
}
