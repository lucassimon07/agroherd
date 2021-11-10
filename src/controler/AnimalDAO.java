package controler;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import factory.ConnectionFactory;
import model.Animal;

 
public class AnimalDAO {
 Animal animal = new Animal();
    
public void save(Animal animal){
 
 /*
 * Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar
 * na base de dados
 */
 
 String sql = "INSERT INTO Animal(cod_animal, datanascimento_animal, peso_animal, proddia_animal, prodmes_animal, classe_animal, status_animal)" +
 " VALUES(?,?,?,?,?,?,?)";
 Connection conn = null;
 PreparedStatement pstm = null;
 
 try {
 //Cria uma conexão com o banco
 conn = ConnectionFactory.createConnectionToPostgreSql();
 
 //Cria um PreparedStatment, classe usada para executar a query
pstm = conn.prepareStatement(sql);
 
pstm.setInt(1, animal.getCod_animal());
pstm.setDate(2, new Date(animal.getDatanascimento_animal().getTime()));
pstm.setFloat(3, animal.getPeso_animal());
pstm.setFloat(4, animal.getProddia_animal());
pstm.setFloat(5, animal.getProdmes_animal());
pstm.setString(6, animal.getClasse_animal());
pstm.setString(7, animal.getStatus_animal());


 //Adiciona o valor do terceiro parâmetro da sql

 
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

 
 public void removeById(int id){
 
 String sql = "DELETE FROM animal WHERE  cod_animal= ?";
 
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

 public void update(Animal animal){
 
 String sql = "UPDATE animal SET datanascimento_animal=?, peso_animal=?, proddia_animal=?,"
         + "prodmes_animal=?, classe_animal=?, status_animal=?, observacoes_animal=? WHERE cod_animal ="+animal.getCod_animal()+";";
 
 
 Connection conn = null;
 PreparedStatement pstm = null;
 
 try {
 //Cria uma conexão com o banco
 conn = ConnectionFactory.createConnectionToPostgreSql();
 
 //Cria um PreparedStatment, classe usada para executar a query
 pstm = conn.prepareStatement(sql);
 
pstm.setDate(1, new Date(animal.getDatanascimento_animal().getTime()));
pstm.setFloat(2, animal.getPeso_animal());
pstm.setFloat(3, animal.getProddia_animal());
pstm.setFloat(4, animal.getProdmes_animal());
pstm.setString(5, animal.getClasse_animal());
pstm.setString(6, animal.getStatus_animal());
pstm.setString(7, animal.getObservacoes_animal());


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
 public List<Animal> getAnimaisPorNome(String nome){
 String sql = "SELECT * FROM animal where nome like ='"+nome+"'";
 
 List<Animal> animais = new ArrayList<Animal>();
 
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
 
 Animal animal = new Animal();
 
 //Recupera o id do banco e atribui ele ao objeto
 animal.setCod_animal(rset.getInt("id"));
 
 //Recupera o nome do banco e atribui ele ao objeto
 animal.setPeso_animal(rset.getFloat("peso"));
 
 //Recupera a idade do banco e atribui ele ao objeto
 animal.setDatanascimento_animal(rset.getDate("data nascimento"));
 
 
 
 //Adiciono o contato recuperado, a lista de contatos
 animais.add(animal);
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
 
 return animais;
 }
 
 
 public List<Animal> getAnimais(){
 
 String sql = "SELECT * FROM animal";
 
 List<Animal> animais = new ArrayList<Animal>();
 
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
  
     Animal animal = new Animal();

 //Recupera o id do banco e atribui ele ao objeto
 animal.setCod_animal(rset.getInt("cod_animal"));
 
 //Recupera o nome do banco e atribui ele ao objeto
 animal.setPeso_animal(rset.getFloat("peso_animal"));
  //Recupera o id do banco e atribui ele ao objeto
 animal.setProdmes_animal(rset.getFloat("prodmes_animal"));
 
 //Recupera o nome do banco e atribui ele ao objeto
 animal.setProddia_animal(rset.getFloat("proddia_animal"));
  //Recupera o id do banco e atribui ele ao objeto
 animal.setClasse_animal(rset.getString("classe_animal"));
 
 //Recupera o nome do banco e atribui ele ao objeto
 animal.setStatus_animal(rset.getString("status_animal"));
  //Recupera o id do banco e atribui ele ao objeto
 animal.setDatanascimento_animal(rset.getDate("datanascimento_animal"));
 

 
 //Adiciono o contato recuperado, a lista de contatos
 animais.add(animal);
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
 
 return animais;
 }
 
 public List<Animal> getAnimaisPorClasse(String classe){
 
 String sql = "SELECT * FROM animal where classe_animal = '"+classe+"';";
 
 List<Animal> animais = new ArrayList<Animal>();
 
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
  
     Animal animal = new Animal();

 //Recupera o id do banco e atribui ele ao objeto
 animal.setCod_animal(rset.getInt("cod_animal"));
 
 //Recupera o nome do banco e atribui ele ao objeto
 animal.setPeso_animal(rset.getFloat("peso_animal"));
  //Recupera o id do banco e atribui ele ao objeto
 animal.setProdmes_animal(rset.getFloat("prodmes_animal"));
 
 //Recupera o nome do banco e atribui ele ao objeto
 animal.setProddia_animal(rset.getFloat("proddia_animal"));
  //Recupera o id do banco e atribui ele ao objeto
 animal.setClasse_animal(rset.getString("classe_animal"));
 
 //Recupera o nome do banco e atribui ele ao objeto
 animal.setStatus_animal(rset.getString("status_animal"));
  //Recupera o id do banco e atribui ele ao objeto
 animal.setDatanascimento_animal(rset.getDate("datanascimento_animal"));
 
 //Adiciono o contato recuperado, a lista de contatos
 animais.add(animal);
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
 
 return animais;
 }
 
}
