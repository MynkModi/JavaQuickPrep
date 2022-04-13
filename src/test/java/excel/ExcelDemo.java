package excel;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.*;

public class ExcelDemo {

   public static void main(String[] args) throws Exception
   {

       //File myFile1= new File("C:\\eclipse-workspace\\MyLearning\\src\\Test1.xlsx");
       File myFile1= new File("src\\Test1.xlsx");
       FileInputStream fIO=new FileInputStream(myFile1);
       //FileOutputStream fOP=new FileOutputStream(myFile1);
       
       
       XSSFWorkbook workbook =new XSSFWorkbook(fIO);
       //XSSFSheet worksheet = workbook.createSheet("TestABC");
/*     XSSFRow row=worksheet.createRow(1);
       XSSFCell cell=row.createCell(2);
       cell.setCellValue("Test123");*/
       
       XSSFSheet worksheet = workbook.getSheet("TestABC");
       
       /*XSSFCellStyle myStyl1=workbook.createCellStyle();
       XSSFColor myClr1=new XSSFColor(Color.BLUE);
       XSSFFont myFont1= workbook.createFont();
       
       myFont1.setColor(myClr1);
       
       myStyl1.setFont(myFont1);*/
       
       
       
     /*  XSSFRow row=worksheet.getRow(0);
       XSSFCell cell=row.getCell(0);
       cell.setCellStyle(myStyl1);
       */
       
        //System.out.println(cell);
       
   /*    for(int i=0;i<=4;i++)
       {
           XSSFRow row=worksheet.createRow(i);
           for (int j=0;j<=4;j++)
           {
               XSSFCell cell=row.createCell(j);
               cell.setCellValue("Row" + i +" Cell" +j);
           }
           
       }*/
       
           int rowCount=worksheet.getLastRowNum();
           XSSFRow row1=worksheet.getRow(0);
           int colCount=row1.getLastCellNum();

           System.out.println(rowCount +" " + colCount);
           
               for(int i=0;i<=rowCount;i++)
           {
               XSSFRow row=worksheet.getRow(i);
               for (int j=0;j<colCount;j++)
               {
                   XSSFCell cell=row.getCell(j);
                   System.out.print(" " +cell);
           
               }
               System.out.println(System.lineSeparator());
               
           }
                
      /* FileOutputStream fOP=new FileOutputStream(myFile1);
       workbook.write(fOP);
       fOP.flush();
       fOP.close();*/
   
       System.out.println("File Generated");
       
//       FileInputStream/FileOutputStream
//       FileScanner
//       BufferedReader
       

   }

}

