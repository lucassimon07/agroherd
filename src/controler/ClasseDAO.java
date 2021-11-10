package controler;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import model.Classe;

 
public class ClasseDAO {
 Classe classe = new Classe();
    
public void save(Classe classe){
 
 /*
 * Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar
 * na base de dados
 */
 
 String sql = "INSERT INTO classe(classe)" +
 " VALUES(?)";
 
 Connection conn = null;
 PreparedStatement pstm = null;
 
 try {
 //Cria uma conexão com o banco
 conn = ConnectionFactory.createConnectionToPostgreSql();
 
 //Cria um PreparedStatment, classe usada para executar a query
 pstm = conn.prepareStatement(sql);
 
 //Adiciona o valor do primeiro parâmetro da sql
 pstm.setString(1, classe.getClasse_abc());
 
 
 //Executa a sql para inserção dos dados
 pstm.execute();
 
 } catch (Exception e) {
 
 e.printStackTrace();
 }finally{
 
 //Fecha as conexões
 
 try{
 if(pstm != null){
 
 pstm.close();
 }
 
 if(conn != null){
 conn.close();
 }
 
 }catch(Exception e){
 
 e.printStackTrace();
 }
 }
 }
}
 /*public void removeById(int id){
 
 String sql = "DELETE FROM contatos WHERE id = ?";
 
 Connection conn = null;
 PreparedStatement pstm = null;
 
 try {
 conn = ConnectionFactory.createConnectionToPostgreSql();
 
 pstm = conn.prepareStatement(sql);
 
 pstm.setInt(1, id);
 
 pstm.execute();
 
 } catch (Exception e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 }finally{
 
 try{
 if(pstm != null){
 
 pstm.close();
 }
 
 if(conn != null){
 conn.close();
 }
 
 }catch(Exception e){
 
 e.printStackTrace();
 }
 }
 }
 
 public void update(Classe classe){
 
 String sql = "UPDATE contatos SET nome = ?, idade = ?, dataCadastro = ?" +
 " WHERE id = ?";
 
 Connection conn = null;
 PreparedStatement pstm = null;
 
 try {
 //Cria uma conexão com o banco
 conn = ConnectionFactory.createConnectionToPostgreSql();
 
 //Cria um PreparedStatment, classe usada para executar a query
 pstm = conn.prepareStatement(sql);
 
 //Adiciona o valor do primeiro parâmetro da sql
 pstm.setString(1, classe.getClasse_abc());
 
 

 
 //Executa a sql para inserção dos dados
 pstm.execute();
 
 } catch (Exception e) {
 
 e.printStackTrace();
 }finally{
 
 //Fecha as conexões
 
 try{
 if(pstm != null){
 
 pstm.close();
 }
 
 if(conn != null){
 conn.close();
 }
 
 }catch(Exception e){
 
 e.printStackTrace();
 }
 }
 }
 
 public List<Classe> getClasses(){
 
 String sql = "SELECT * FROM contatos";
 
 List<Classe> classe = new ArrayList<Classe>();
 
 Connection conn = null;
 PreparedStatement pstm = null;
 //Classe que vai recuperar os dados do banco de dados
 ResultSet rset = null;
 
 try {
 conn = ConnectionFactory.createConnectionToPostgreSql();
 
 pstm = conn.prepareStatement(sql);
 
 rset = pstm.executeQuery();
 
 //Enquanto existir dados no banco de dados, faça
 while(rset.next()){
 
 Classe classes = new Classe();
 
 //Recupera o id do banco e atribui ele ao objeto
 classes.setClasse_abc(rset.getString("id"));
 
 
 
 
 
 //Adiciono o contato recuperado, a lista de contatos
 classe.add(classes);
 }
 } catch (Exception e) {
 
 e.printStackTrace();
 }finally{
 
 try{
 
 if(rset != null){
 
 rset.close();
 }
 
 if(pstm != null){
 
 pstm.close();
 }
 
 if(conn != null){
 conn.close();
 }
 
 }catch(Exception e){
 
 e.printStackTrace();
 }
 }
 
 return classe;
 }
}
*/