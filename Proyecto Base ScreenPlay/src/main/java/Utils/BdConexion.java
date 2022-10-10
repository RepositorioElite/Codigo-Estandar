package Utils;
/*
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class BdConexion {

//Coneccion con base de datos Oracle

        public static void main( String []arg ){
            try
            {

                DriverManager.registerDriver( new oracle.jdbc.driver.OracleDriver() );

                String nombre_servidor = "127.0.0.1";

                String numero_puerto = "1521";

                String sid = "xe";

                String url = "jdbc:oracle:thin:@" + nombre_servidor + ":" + numero_puerto + ":" + sid;

                String usuario = "DBAP1";
                String password = "proyecto1";

                Connection conexion = DriverManager.getConnection( url, usuario, password );
                Statement sentencia = conexion.createStatement();
                ResultSet resultado = sentencia.executeQuery( "SELECT * FROM TIPO_OPERACION" );

                while ( resultado.next() )
                {
                    System.out.println ( resultado.getInt( 1 ) + "\t" + resultado.getString( 2 ) );
                }
                sentencia.close();
            }catch( Exception e ){
                e.printStackTrace();
            }
        }
    }
*/
