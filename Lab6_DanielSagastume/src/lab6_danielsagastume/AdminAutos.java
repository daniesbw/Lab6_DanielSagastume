package lab6_danielsagastume;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminAutos {

    private ArrayList<Auto> autos = new ArrayList();
    private File archivo = null;

    public AdminAutos(String path) {
        this.archivo = new File(path);
    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Auto t : autos) {
                bw.write(t.getVin() + ";");
                bw.write(t.getMarca() + ";");
                bw.write(t.getModelo() + ";");
                bw.write(t.getCarroceria() + ";");
                bw.write(t.getCant_pasajero() + ";");
                bw.write(t.getMaletero() + ";");
                bw.write(t.getColor() + ";");
                bw.write(t.getPrecio() + ";");
                bw.write(t.getPotencia() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        autos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    autos.add(new Auto(sc.nextInt(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.nextInt(),
                            sc.nextFloat(),
                            sc.next(),
                            sc.nextFloat(),
                            sc.nextFloat()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
