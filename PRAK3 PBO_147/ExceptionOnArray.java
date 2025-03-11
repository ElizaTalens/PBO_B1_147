/* Nama File : ExceptionOnArray.java
 * Deskripsi : Berisi atribut dan method dalam class ExceptionOnArray
 * Pembuat : Eliza Talent Sirait
 * Tanggal : 10 Maret 2025
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}