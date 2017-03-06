package P1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**Cette classe m'a permis de tester l'écriture sur un fichier excel
 * elle crée un nouveau fichier .xlsx et elle écrit haya2 à la position 0 ,0
 * @author haya
 *
 */
public class test {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		XSSFWorkbook b= new XSSFWorkbook();
		XSSFSheet sheet= b.createSheet("FistExcelSheet");
		XSSFRow row=sheet.createRow(0);
		XSSFCell cell=row.createCell(0);
		cell.setCellValue("hayatest");
		
		b.write(new FileOutputStream("test2.xlsx"));
		b.close();
		
		
	}
}
