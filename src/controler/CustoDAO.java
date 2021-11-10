package controler;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Animal;

import model.Custo;

public class CustoDAO {

    public void save(Custo custo) {

        /*
 * Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar
 * na base de dados
         */
        String sql = "INSERT INTO custo(descricao_custo, valor_custo, data_custo, status_custo)"
                + " VALUES(?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //Cria uma conexão com o banco
            conn = ConnectionFactory.createConnectionToPostgreSql();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);

            //Adiciona o valor do primeiro parâmetro da sql
            pstm.setString(1, custo.getDescricao_custo());
            pstm.setFloat(2, custo.getValor_custo());
            pstm.setDate(3, new Date(custo.getData_custo().getTime()));
            pstm.setString(4, custo.getStatus_custo());
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

    public void removeById(int id) {

        String sql = "DELETE FROM custo WHERE cod_custo = ?";

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
        } finally {

            try {
                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

    public void update(Custo custo) {

        String sql = "UPDATE custo SET descricao_custo = ?, valor_custo = ?, data_custo = ?, status_custo"
                + " WHERE cod_custo = '" + custo.getCod_custo() + "';";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //Cria uma conexão com o banco
            conn = ConnectionFactory.createConnectionToPostgreSql();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);

            //Adiciona o valor do primeiro parâmetro da sql
            pstm.setString(1, custo.getDescricao_custo());
            pstm.setFloat(2, custo.getValor_custo());
            pstm.setDate(3, (Date) custo.getData_custo());
            pstm.setString(4, custo.getStatus_custo());
            //Executa a sql para inserção dos dados
            pstm.execute();

        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            //Fecha as conexões
            try {
                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

    public List<Custo> getCustosGeral() {

        String sql = "SELECT * FROM custo";

        List<Custo> custo = new ArrayList<Custo>();

        Connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco de dados
        ResultSet rset = null;

        try {
            conn = ConnectionFactory.createConnectionToPostgreSql();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            //Enquanto existir dados no banco de dados, faça
            while (rset.next()) {

                      Custo custoaux = new Custo();

                //Recupera o id do banco e atribui ele ao objeto
                custoaux.setCod_custo(rset.getInt("cod_custo"));
                custoaux.setDescricao_custo(rset.getString("descricao_custo"));
                custoaux.setData_custo(rset.getDate("data_custo"));

                custoaux.setValor_custo(rset.getFloat("valor_custo"));
                custoaux.setStatus_custo(rset.getString("status_custo"));

                //Adiciono o contato recuperado, a lista de contatos
                custo.add(custoaux);
            }
        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {

                if (rset != null) {

                    rset.close();
                }

                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }

        return custo;
    }

    
    public List<Custo> getCustosAPagar() {

        String sql = "SELECT * FROM custo where status_custo = 'Devendo'";

        List<Custo> custo = new ArrayList<Custo>();

        Connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco de dados
        ResultSet rset = null;

        try {
            conn = ConnectionFactory.createConnectionToPostgreSql();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            //Enquanto existir dados no banco de dados, faça
            while (rset.next()) {

                      Custo custoaux = new Custo();

                //Recupera o id do banco e atribui ele ao objeto
                custoaux.setCod_custo(rset.getInt("cod_custo"));
                custoaux.setDescricao_custo(rset.getString("descricao_custo"));
                custoaux.setData_custo(rset.getDate("data_custo"));

                custoaux.setValor_custo(rset.getFloat("valor_custo"));
                custoaux.setStatus_custo(rset.getString("status_custo"));

                //Adiciono o contato recuperado, a lista de contatos
                custo.add(custoaux);
            }
        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {

                if (rset != null) {

                    rset.close();
                }

                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }

        return custo;
    }

    public List<Custo> getCustosPagos() {

        String sql = "SELECT * FROM custo where status_custo = 'Pago'";

        List<Custo> custo = new ArrayList<Custo>();

        Connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco de dados
        ResultSet rset = null;

        try {
            conn = ConnectionFactory.createConnectionToPostgreSql();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            //Enquanto existir dados no banco de dados, faça
            while (rset.next()) {

                Custo custoaux = new Custo();

                //Recupera o id do banco e atribui ele ao objeto
                custoaux.setCod_custo(rset.getInt("cod_custo"));
                custoaux.setDescricao_custo(rset.getString("descricao_custo"));
                custoaux.setData_custo(rset.getDate("data_custo"));

                custoaux.setValor_custo(rset.getFloat("valor_custo"));
                custoaux.setStatus_custo(rset.getString("status_custo"));

                //Adiciono o contato recuperado, a lista de contatos
                custo.add(custoaux);
            }
        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {

                if (rset != null) {

                    rset.close();
                }

                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }

        return custo;
    }
}
