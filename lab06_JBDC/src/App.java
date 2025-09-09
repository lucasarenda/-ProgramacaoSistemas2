import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
			String url = "postgresql://postgres.pzdgbevzzmevjeejhtdr:123847hduqwhruodsahdq@aws-1-sa-east-1.pooler.supabase.com:6543/postgres";
			String username="postgres";
			String password="123847hduqwhruodsahdq";
			Connection con = DriverManager.getConnection("jdbc:postgresql://aws-1-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.pzdgbevzzmevjeejhtdr&password=123847hduqwhruodsahdq");

            Statement stmt = con.createStatement();

            //Consultando
            ResultSet rs = stmt.executeQuery("SELECT * FROM PROPRIETARIOS");

            while(rs.next()){
                System.out.println(rs.getString("ID"));
            }

            //inserindo
            String sql_insert = "INSERT INTO PROPRIETARIOS (NOME, CPF) VALUES(?,?)";

            PreparedStatement pstmt = con.prepareStatement(sql_insert);

            pstmt.setString(1,  "antonio");
            pstmt.setString(2,"333333333-33");

            int qte = pstmt.executeUpdate();
            if(qte >=1)
                System.out.println("inserido com sucesso");
String sql_update = "UPDATE \"Proprietarios\" SET cpf = ? WHERE nome = ?";

PreparedStatement psmt = con.prepareStatement(sql_update);

pstmt.setString(1, "99999999999");  // novo CPF
pstmt.setString(2, "antonio");       // condição para encontrar o registro

int qe = pstmt.executeUpdate();

if (qe >= 1) {
    System.out.println("Atualizado com sucesso");

    }
    String sql_delete = "DELETE FROM \"Proprietarios\" WHERE nome = ?";

PreparedStatement pst = con.prepareStatement(sql_delete);

pstmt.setString(1, "antonio");  // nome do registro que deseja deletar

int qtd = pstmt.executeUpdate();

if (qte >= 1) {
    System.out.println("Removido com sucesso");
} 
}}