/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package importacion;
import entidades.Equipo;
import entidades.Partido;
import entidades.Pronostico;
import entidades.Ronda;
import entidades.ResultadoEnum;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeerArchivos{
    
    public static void main(String[] args) {
        
    
        Path filePath = Paths.get("C:\\Users\\Milagros\\Java\\workspaceargprog\\PronosticosDeportivos\\Archivos\\resultados.txt");
        Charset charset = StandardCharsets.UTF_8;
        
        try {
            List<String> lines = Files.readAllLines(filePath, charset);
            for(String line: lines) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.format("I/O error: %s%n", ex);
        }
        
        Path filePath2 = Paths.get("C:\\Users\\Milagros\\Java\\workspaceargprog\\PronosticosDeportivos\\Archivos\\pronosticos.txt");
        Charset charset2 = StandardCharsets.UTF_8;
        try {
            List<String> lines = Files.readAllLines(filePath2, charset2);
            for(String line: lines) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.format("I/O error: %s%n", ex);
        }
        
        
        //Lectura del fichero
        
         
       
    }
    
}