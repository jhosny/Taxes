package taxes;
/* Joy Hosny
program to compute taxes for single filers
*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class Taxes {
    public static void main(String[] args) {
    Scanner sdin = new Scanner(System.in);
    System.out.print("Enter your net taxable income: ");
    double income = sdin.nextDouble();
    double tax = 0;
    DecimalFormat df = new DecimalFormat ("$###,###.##");
 
     if (income <= 9275)
         tax = income * 0.10;
     else if ( income <= 37650)
         tax = 9275 * 0.10 + ((income - 9275) * 0.15);
     else if ( income <= 91150)
         tax = 9275 * 0.10 + 37650 * 0.15 + ((income - 37650) * 0.25);
     else if (income <= 190150)
         tax = 9275 * 0.10 + 37650 * 0.15 + 91150 * 0.25 + ((income - 91150) * 0.28);
     // you can keep going with the same statemet and add any income you want.
     /* you can use  else (income >= 350000) to specify from that income and higher, 
     the taxe rate is the same */ 
  
    System.out.println(" Your 2016 tax is "+ df.format(tax));
    }}

