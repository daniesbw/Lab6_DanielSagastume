package lab6_danielsagastume;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reporte {
    private String Clientes;
    private File archivo = null;

    public Reporte(String path) {
        archivo=new File(path);
    }

    public String getClientes() {
        return Clientes;
    }

    public void setClientes(String Clientes) {
        this.Clientes = Clientes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            
                bw.write(Clientes); 
            
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    Clientes=sc.next();
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
