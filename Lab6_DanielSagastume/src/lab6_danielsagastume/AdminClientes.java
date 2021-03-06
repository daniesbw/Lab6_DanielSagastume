package lab6_danielsagastume;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminClientes {

    private ArrayList<Cliente> clientes = new ArrayList();
    private File file = null;

    public AdminClientes() {
    }

    public AdminClientes(String path) {
        file = new File(path);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    //extra
    public void setPersona(Cliente p) {
        this.clientes.add(p);
    }
    //metodos de administracion

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file, false);
            bw = new BufferedWriter(fw);

            for (Cliente t : clientes) {
                bw.write(t.getUsername() + ";");
                bw.write(t.getContrasenia() + ";");
                bw.write(t.getID() + ";");
                bw.write(t.getNom() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getNacionalidad() + ";");
                bw.write(t.getLugar() + ";");
                bw.write(t.getPuesto() + ";");
                bw.write(t.getDinero() + ";");
                for (int i = 0; i < t.getVin().size(); i++) {
                    bw.write(t.getVin().get(i)+";");
                }
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        clientes = new ArrayList();
        if (file.exists()) {
            try {
                sc = new Scanner(file);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    ArrayList<Integer> vin=new ArrayList();
                    String username=sc.next();
                    String contrasenia=sc.next();
                    int ID=sc.nextInt();
                    String nom=sc.next();
                    String apellido=sc.next();
                    String nacionalidad=sc.next();
                    String lugar=sc.next();
                    String puesto=sc.next();
                    float dinero=sc.nextFloat();
                    while(sc.hasNext()){
                        vin.add(sc.nextInt());
                    }
                    
                    clientes.add(new Cliente(username,
                            contrasenia,
                            ID,
                            nom,
                            apellido,
                            nacionalidad,
                            lugar,
                            puesto,
                            dinero,
                            vin   
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
