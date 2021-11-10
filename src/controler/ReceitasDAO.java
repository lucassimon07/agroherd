package controler;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Receita;

public class ReceitasDAO {

    public void save(Receita receita) {

        /*
 * Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar
 * na base de dados
         */
        String sql = "INSERT INTO receita(descricao_receita, valor_receita, data_receita)"
                + " VALUES(?,?,?)";

            
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //Cria uma conexão com o banco
            conn = ConnectionFactory.createConnectionToPostgreSql();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);
            
            //Adiciona o valor do primeiro parâmetro da sql
            pstm.setString(1, receita.getDescricao_receita());
            pstm.setFloat(2, receita.getValor_receita());
            pstm.setDate(3, (Date) receita.getData_receita());        
            //Executa a sql para inserção dos dados
            pstm.executeUpdate();

        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            //Fecha as conexões
            try {
                if (pstm != null) {

                    pstm.close();
                }
            } catch (Exception e) {

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
 
 public void update(Gasto trato){
 
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
 pstm.setFloat(1, trato.getQnt_racao());
 
 

 
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
 
 public List<Trato> getTratos(){
 
 String sql = "SELECT * FROM contatos";
 
 List<Trato> trato = new ArrayList<Trato>();
 
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
 
 Gasto tratos = new Gasto();
 
 //Recupera o id do banco e atribui ele ao objeto
 tratos.setQnt_racao(rset.getFloat("kg"));
 
 
 
 
 
 //Adiciono o contato recuperado, a lista de contatos
 trato.add(tratos);
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
 
 return trato;
 }
}
*/
