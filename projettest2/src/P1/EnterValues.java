package P1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * Cette classe a pour but d'écrire sur le fichier voeux2 qui est le fichier de voeux des enseignants
 * On récupèrera les données dans la première partie du projet t ensuite on les rentrera dans ce fichier excel
 * pour chaque prof
 * cette fonction ne fonctionne pas encore, et les parties qui ont été mises en commentaire sont des essais 
 * qui n'ont pas aboutis.
 * @author haya
 *
 */
public class EnterValues {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*XSSFWorkbook wb= new XSSFWorkbook();
		
		XSSFSheet sheet= wb.getSheet("Coordonnées");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(2);
		cell.setCellValue("haya");
		
		wb.write(new FileOutputStream("voeux.xlsx"));
		XSSFWorkbook b= new XSSFWorkbook();
		XSSFSheet sheet= b.createSheet("FistExcelSheet");
		XSSFRow row=sheet.createRow(2);
		XSSFCell cell=row.createCell(2);
		cell.setCellValue("haya");
		
		b.write(new FileOutputStream("voeux.xlsx"));
		b.close();*/
		
		FileOutputStream file= new FileOutputStream(new File("voeux2.xlsx"));
		XSSFWorkbook wb= new XSSFWorkbook();
		wb.write(file);
		XSSFSheet sheet= wb.getSheetAt(0);
		java.util.Iterator<Row> ligne=sheet.iterator();
		System.out.println(ligne);
		/*XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(2);
		cell.setCellValue("haya");*/
	}

}
