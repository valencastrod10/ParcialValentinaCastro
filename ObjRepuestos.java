
import java.util.Scanner;

public class ObjRepuestos {

  String Nombre;
  String Descripcion;
  double Precio;
  int disponible;
  public ObjRepuestos(String nombre, String descripcion, double precio, int disponible) {
    Nombre = nombre;
    Descripcion = descripcion;
    Precio = precio;
    this.disponible = disponible;
  }
  public ObjRepuestos() {
  }
  public String getNombre() {
    return Nombre;
  }
  public void setNombre(String nombre) {
    Nombre = nombre;
  }
  public String getDescripcion() {
    return Descripcion;
  }
  public void setDescripcion(String descripcion) {
    Descripcion = descripcion;
  }
  public double getPrecio() {
    return Precio;
  }
  public void setPrecio(double precio) {
    Precio = precio;
  }
  public int getDisponible() {
    return disponible;
  }
  public void setDisponible(int disponible) {
    this.disponible = disponible;
  }

  



    
}
