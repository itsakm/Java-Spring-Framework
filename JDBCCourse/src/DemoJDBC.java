import java.sql.*;
public class DemoJDBC {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*Import package
        Load and regiser
        create connection
        create statement
        execute statement
        process the results
        close
        * */

        String url = "jdbc:mysql://localhost:3306/test"; /*jdbc:postgresql:databasename*/
        String uname = "root";
        String password = "";
        String query = "select * from student";

        Class.forName("com.mysql.jdbc.Driver"); // Load and register the driver
        Connection con = DriverManager.getConnection(url,uname,password); /*url,username,password*/

        System.out.println("Connection Established!!");


        /*Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);*/

    /*    rs.next(); //we have to do this because after executing query it first points to the first row (schema)
        String name = rs.getString("sname");
        System.out.println(name);*/

        /*while(rs.next())
        {
            System.out.println(rs.getInt(1)+"-"+rs.getString(2));
        }
        con.close();

        System.out.printf("Connection closed!!");*/


        /*Prepared Statement*/

        int sid = 1;
        String sname = "ayush";
        String sql = "insert into student values (?,?)";
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);

        st.execute();

        con.close();


    }
}
