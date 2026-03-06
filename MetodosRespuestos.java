import java.util.Scanner;

public class MetodosRespuestos {

    Scanner sc = new Scanner(System.in);
    MetodosRespuestos [][] productos;

    public void inventario(){

        System.out.print("Ingrese filas de la matriz");
        int filas = sc.nextInt();

        System.out.print("Ingrese columnas de la matriz");
        int columnas = sc.nextInt();
        sc.nextLine();

        productos = new MetodosRespuestos[filas][columnas];

        for (int i = 0; i < filas; i++) {
         for( int j = 0; j < columnas; j++){

            productos[i][j] new Producto();

            System.out.println("\nProducto [" + i + "][" + j + "]");
            System.out.print("Nombre: ");
            productos[i][j].nombre = sc.nextLine();
            System.out.print("Descripcion: ");
            productos[i][j].descripcion = sc.nextLine();
            System.out.print(" Precio: ");
            productos[i][j].precio = sc.nextDouble();
            System.out.print("Disponible (1=si, 0=no");
            productos[i][j].disponible = sc.nextInt();
            sc.nextLine();

         }
            
        }

    }
         public void VerDisponibles(){

            int contador = 0;

         System.out.println("\nProductos Disponibles:\n");
          for(int i = 0; i < productos.length; i++)
            for(int j = 0; j< productos[i].length; j++){
              
                if(productos[i][j].disponible == 1 ){
                    


                }
        
            }
            
         }

         }


      



    }

    
}
