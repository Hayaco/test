package P2;

import org.apache.poi.ss.usermodel.Cell;
import org.omg.CORBA.portable.InputStream;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.SstDocument;

public class TestODS {
	private static final String SpreadsheetDocument = null;

	public static void main(String[] args) throws Exception {
		new TestODS().generateSpreadsheetDocument();
	}

	public void generateSpreadsheetDocument() throws Exception {
		try (InputStream inputStream = (InputStream) TestODS.class.getResourceAsStream("test.ods");
				SstDocument spreadsheetDoc = SpreadsheetDocument.loadDocument(inputStream)) {
			Cell positionCell = spreadsheetDoc.getTableByName("B").getCellByPosition("E1");
			System.out.println(((Object) positionCell).getDisplayText());
			positionCell.setCellValue("ploum");
			spreadsheetDoc.save("demo9s.ods");
		}
	}
}