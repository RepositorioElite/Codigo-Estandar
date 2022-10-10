package Utils;

/*
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import java.io.FileInputStream;
import java.util.Iterator;*/

public class LeerEscribirExcel {

    /* Se usa para escribir y leer datos de excel

    public static void main(String args[]){

        try {

            String rutaArchivoExcel = "/ruta/ExcelEjemplo.xlsx";

            FileInputStream inputStream = new FileInputStream(new File(rutaArchivoExcel));

            Workbook workbook = new XSSFWorkbook(inputStream);

            Sheet firstSheet = workbook.getSheetAt(0);

            Iterator iterator = firstSheet.iterator();

            DataFormatter formatter = new DataFormatter();

            while (iterator.hasNext()) {

                Row nextRow = iterator.next();

                Iterator cellIterator = nextRow.cellIterator();

                while(cellIterator.hasNext()) {

                    Cell cell = cellIterator.next();

                    String contenidoCelda = formatter.formatCellValue(cell);

                    System.out.println("celda: " + contenidoCelda);

                }

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}



    public static void insertarRegistro(String strRuta, String strHoja, String strCampo1, String strCampo2, String strValor1, String strValor2) {

        String strQuery = "INSERT INTO " + strHoja + "(" + strCampo1 + ", " + strCampo2 + ") VALUES('" + strValor1 + "', '" + strValor2 + "')";

        try {

            cargarExcel(strRuta).executeUpdate(strQuery);

        } catch (Exception e) {

            throw new RuntimeException("Consulta " + strQuery + " no válida");

        }

    }*/

}
