package Utils;

import java.io.*;
import java.nio.file.*;

/**
 * Questa è una classe di utilità per ridefinire i metodi principali di Java e
 * creare nuovi metodi personalizzati
 */
public class MyIo {

	public static void pl(Object p) {
		System.out.println(p);
	}

	public static void saluta(Object p) {
		System.out.println("Ciao " + (String) p + "!\n");
	}
	
	/**
	 * @param path = Percorso relativo
	 */
	public static void readF(String path) {
        Path filePath = Paths.get(path);

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (NoSuchFileException e) {
            System.out.println("Errore: Il file '" + filePath.toAbsolutePath() + "' non esiste.");
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        }
    }
		
//	public static void readF(String path) {
//		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path))) {
//			int byteLetto;
//			while ((byteLetto = bis.read()) != -1) {
//				System.out.print(byteLetto + " ");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
//	public static void writeF(String path, Object file) {
//		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path))) {
//            bos.write((int) file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//	}
}
