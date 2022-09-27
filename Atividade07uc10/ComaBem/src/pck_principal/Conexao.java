package pck_principal;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*classe de conexao com o banco de dados*/
public class Conexao {
    private String caminho = "jdbc:mysql://localhost:3306/comabem"; //endereco do arquivo
    private String usuario = "root"; //usuario no banco de dados
    private String senha = "1553"; //senha do usuario
    public Connection conn; //atributo de conexao


    public void conexao() //método para abrir a conexao com o banco de dados
    {

        try //bloco para realização caso não aconteçam erros
        {
            conn=DriverManager.getConnection(caminho,usuario,senha);
            System.out.println("CONECTADO COM SUCESSO");
        }
        catch (SQLException ex) //bloco para realização caso aconteçam erros
        {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
            System.out.println("ERRO DE CONEXAO");
        }
    }

    public void desconecta() //método para fechar a conexão com o banco de dados
    {
        try //bloco para realização caso não aconteçam erros
        {
            conn.close();
            System.out.println("DESCONECTADO COM SUCESSO");
        }
        catch(SQLException ex) //bloco para realização caso aconteçam erros
        {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
            System.out.println("ERRO AO FECHAR CONEXAO");
        }

    }
    //método main apenas para executar a classe isoladamente e testar a conexao
    /*public static void main(String[] args) {
        Conexao obj_conexao = new Conexao();
        obj_conexao.conexao();
    }
    */
}