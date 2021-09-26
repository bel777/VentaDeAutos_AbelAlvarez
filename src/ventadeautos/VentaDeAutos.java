/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventadeautos;

import java.util.Scanner;

/**
 *
 * @author Abel del Aguila
 */
public class VentaDeAutos {

    /**
     * @param args the command line arguments
     */
    
    
    /// Esto es para dar el estilo al nombre del programa
    public static void StyleHome(){
        String HomeStyle = """
                           ------------------------------------------- 
                                        VENTA DE VEHICULOS 
                                       --MENU PRINCIPAL-- 
                            ------------------------------------------""";
        System.out.println(HomeStyle);
    }
    /// Esto es para dar el estilo al nombre del programas
    public static void StyleGama(){
        String TituloGama = """
                            ------------------------------------------- 
                                         VENTA DE VEHICULOS 
                                  --SELECCIONAR GAMA DEL VEHICULO-- 
                             ------------------------------------------""";
        System.out.println("\n" + TituloGama);
    }
  
    // Esto es para llamar al Menu de Autos
    public static void MenuAutos(){
        
        System.out.println("""
                \n
                01-. Sedan Economico 
                02-. Sedan  
                03-. Deportivo 
                04-. Hibrido 
                05-. Coupe
                06-. Coupe Deportivo
                07-. Copacto
                08-. Hatchback
                09-. Economico Version Rally
                10-. Regresar a menu principal
                               """);
    }
        // Este el metodo para el menu de Amenidades
    public static void MenuAmenidades(){
        StyleGama();
        System.out.println("""
                
                    Tipos de Amenidades:
                
                01-. Tipo de Transmision 
                02-. Color de pintura Exterior
                03-. Color de Tapicería     
                04-. Aros
                05-. Accesorios Exteriores 
                06-. Accesorios Interiores
                07-. Accesorios Electronicos
                08-. Regresar a Seleccion de Gama de Vehiculo
                               """);
    }
    
    // Esta mi clase principal, donde sucede la Magia
    // Esta fue creada, para poder llamar libremente los demas metodos
    public static void MainAutos(){
 
        // TODO code application logic here
        
        //creo el Scanner pare recibir datos
        Scanner leer = new Scanner(System.in);
        int leerOpcion = 0;
       
        // llamo el stilo
        StyleHome();
        // Presento las opciones que existen
        System.out.println("1.- Seleccionar Automovil \n"  
                            + "2.- Salir ");
        System.out.println("Ingrese la opcion que desea Ejecutar");
        leerOpcion = leer.nextInt(); // recibe lo que se quiere ejecutar
        
        // Si el cliente ingresa una opcion erronea, devuelve esto
        while(leerOpcion > 2){
            System.out.println("Error: La Opcion ingresad no es Valida \n");
            System.out.println("Ingrese una opcion Valida");
            leerOpcion = leer.nextInt();
        }
        
        // Si la opcion es valida Me ejecutara este codigo
        if(leerOpcion == 1){  
            // llamo el metodo donde esta el estilo del programa
            StyleGama();
            // llamo el metodo donde esta el Menu
            MenuAutos();
            // Solicito que ingresen el auto desado
            System.out.println("Elija un Auto");
            leerOpcion = leer.nextInt();
            
            
            // creo bucle, por si la opcion seleccionada no existe
            while(leerOpcion > 10){
                System.out.println("Error: La Opcion ingresad no es Valida ");
                System.out.println("Ingrese una opcion Valida");
                leerOpcion = leer.nextInt();
            }
            // si el cliente quiere regresar, lo regreso al menu principal
            if(leerOpcion == 10){
                MainAutos();
            } // esto es para que me devuelva al menu principal
            
            if(leerOpcion < 10){
                 //variables para el vehiculo
                    String vehiculo = null;
                    double precio = 0;
                    int autoGama = 0;
                //Si la opcion ingresa es correcta, verifico cual ingreso
                
                //Pido confirmacion del vehiculo que el cliente quiere
                System.out.println("Por Favor confirme nuevamente el auto que desea?");
                autoGama = leer.nextInt();
                
                //Declaro Variables que me dira la Gama que el el cliente ingreso
                String SelectionMade = "\n Usted Selecciono la Gama: ";
                String AmenidadesQ = "\n Desea agregar amenidades? \n 1-. Si \n 2-. No";
                
                //Verifico que Modelo de Auto el cliente solicito
                switch(autoGama){
                    case 1:
                        vehiculo = " Sedan Economio ";
                        precio = 18940.00;
                        break;
                    case 2:
                        vehiculo = " Sedan ";
                        precio = 23570.00;
                        break;
                    case 3:
                        vehiculo = " Deportivo ";
                        precio = 24100.00;
                        break;
                    case 4:
                        vehiculo = " Hibrido ";
                        precio = 25100.00 ;
                        break;
                    case 5:
                        vehiculo = " Coupe ";
                        precio = 19350.00;
                        break;
                    case 6:
                        vehiculo = " Coupe Deportivo ";
                        precio = 24100.00;
                        break;
                    case 7:
                        vehiculo = " Copacto ";
                        precio = 16190.00;
                        break;
                    case 8:
                        vehiculo = " Hatchback ";
                        precio = 20150.00;
                        break;
                    case 9:
                        vehiculo = " Economico Version Rally ";
                        precio = 34700.00;
                        break;
                    case 10:
                        if(autoGama == 10){
                           MainAutos();
                          }
                        break;       
                }
                //declaro variable para poder verificar si la opcion ingresa de valida
                int Sino;
                
                // llamo el metodo donde tengo el estilo del Menu
                StyleGama();
                // imprimo el Auto que el cliente solicito 
                //junto con la opcion si el cliente quiere agregar amenidades
                System.out.println(SelectionMade + vehiculo + AmenidadesQ);
                Sino = leer.nextInt();
                
                //validar si quiere agregar amenidades
                // mientras que la opcion que cliente ingrese sea incorrecta
                // recivira un mensaje de opcion invalida
                while(Sino != 1 && Sino != 2){
                System.out.println("Ingrese una opcion Valida");
                Sino = leer.nextInt();
                }
                
                // si la opcion ingresa es valida, valido cual es
                if(Sino == 1){
                    // si el cleinte quiere agregar amenidades
                    // llamo el metodo donde esta el menu de las amenidades
                    MenuAmenidades();
                    
                    // declaro variables que me ayudaran para determinar las amenidades
                    String TipoDTTxt = null; // ==> Nombre de la Amenidad
                    double priceTDT = 0;   // ==> guardar el precio de la amenidad
                    int TipoA = 0; // variable para leer la amenidad que el cliente quiere
                    int TipodT; // esta la usare en mi segundo metodo de Switch.
                    
                    System.out.println("Seleccione la ocpion que se desea Ejecutar");
                    TipoA = leer.nextInt();
                    
                    
                    switch(TipoA){
                        case 1:
                            StyleGama();
                            // llamo el vehiculo seleccionado anteriorment
                            System.out.println(SelectionMade + vehiculo);
                            // menu de amenidades
                            System.out.println("""
                                               Tipo de Transmision: \n
                                               01.-Manual            US$  00.00 
                                               02.-CVT               US$ 800.00 
                                               03.-Manual con Turbo  US$  00.00 
                                               04.-CVT con Turbo     US$ 800.00 \n                                               
                                               """);
                                               
                                               System.out.println("Seleccione la ocpion que se desea Ejecutar");
                                               TipodT = leer.nextInt();
                                               
                                               // verificar cual el la amenidad que se desea
                                               switch(TipodT){
                                                   case 1:
                                                       TipoDTTxt = "Manual";
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 2:
                                                       TipoDTTxt = "CVT";
                                                       priceTDT = 800.00;
                                                       break;
                                                    case 3:
                                                       TipoDTTxt = "Manual con Turbo";
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 4:
                                                       TipoDTTxt = "CVT con Turbo";
                                                       priceTDT = 800.00;
                                                       break;
                                               }                   
                            break;
                            case 2:
                            
                            StyleGama();
                            System.out.println(SelectionMade + vehiculo);
                            // menu de amenidad
                            System.out.println("""
                                               Color de Pintura Exterior: \n
                                               01.-Cosmic Blue                 US$  00.00 
                                               02.-Burgundy Night              US$  00.00 
                                               03.-CrystalBlack                US$  00.00 
                                               04.-Modern Steel                US$  00.00
                                               05.-Taffeta White               US$  00.00
                                               06.-Energy Green                US$  00.00
                                               07.-Kona Coffee                 US$  00.00
                                               08.-Orange Fury                 US$  00.00
                                               09.-Helios Yellow               US$  00.00
                                               10.-Sonic Gray                  US$  00.00
                                               11.-Polished Metal              US$  00.00
                                               """);
                                               
                                               System.out.println("Seleccione la ocpion que se desea Ejecutar");
                                               TipodT = leer.nextInt();
                                               // que amenidad quiere
                                               switch(TipodT){
                                                   case 1:
                                                       TipoDTTxt = "Cosmic Blue";
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 2:
                                                       TipoDTTxt = "Burgundy Night";
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 3:
                                                       TipoDTTxt = "CrystalBlack";
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 4:
                                                       TipoDTTxt = "Modern Steel";
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 5:
                                                       TipoDTTxt = "Taffeta White";
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 6:
                                                       TipoDTTxt = "Energy Green";
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 7:
                                                       TipoDTTxt = "Kona Coffee";
                                                       priceTDT = 00.00;
                                                       break;
                                                     case 8:
                                                       TipoDTTxt = "Orange Furye";
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 9:
                                                       TipoDTTxt = "Helios Yellow";
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 10:
                                                       TipoDTTxt = "Sonic Gray";
                                                       priceTDT = 00.00;
                                                       break; 
                                                    case 11:
                                                       TipoDTTxt = "Polished Metal";
                                                       priceTDT = 00.00;
                                                       break;
                                               }              
                            break;
                            case 3:
                            StyleGama();
                            System.out.println(SelectionMade + vehiculo);
                            System.out.println("""
                                               Color de Tapiceria: \n
                                               01.-Gray Cloth                     US$  00.00 
                                               02.-Black Cloth                    US$  00.00 
                                               03.-Black/Gray Cloth               US$  00.00 
                                               04.-Red/Black Suede Effect-Fabric  US$  00.00                                              
                                               """);
                                               
                                               System.out.println("Seleccione la ocpion que se desea Ejecutar");
                                               TipodT = leer.nextInt();
                                               switch(TipodT){
                                                   case 1:
                                                       TipoDTTxt = "Gray Cloth\n";
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 2:
                                                       TipoDTTxt = "Black Cloth";
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 3:
                                                       TipoDTTxt = "Black/Gray Cloth";
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 4:
                                                       TipoDTTxt = "Red/Black Suede Effect-Fabric";
                                                       priceTDT = 00.00;
                                                       break;
                                               }                                                    
                            break;
                            case 4:
                            StyleGama();
                            System.out.println(SelectionMade + vehiculo);
                            System.out.println("""
                                               Aros: \n
                                               01.-15"                     US$  00.00 
                                               02.-16"                     US$  00.00 
                                               03.-17"                     US$  00.00 
                                               04.-18"                     US$  00.00                                              
                                               04.-19"                     US$  00.00                                              
                                               """);
                                               
                                               System.out.println("Seleccione la ocpion que se desea Ejecutar");
                                               TipodT = leer.nextInt();
                                               switch(TipodT){
                                                   case 1:
                                                       TipoDTTxt = """
                                                                   15"
                                                                   """;
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 2:
                                                       TipoDTTxt = """
                                                                   16"
                                                                   """;
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 3:
                                                       TipoDTTxt = """
                                                                   17"
                                                                   """;
                                                       priceTDT = 1688.00;
                                                       break;
                                                    case 4:
                                                       TipoDTTxt = """
                                                                   18"
                                                                   """;
                                                       priceTDT = 1700.00;
                                                       break;
                                                    case 5:
                                                       TipoDTTxt = """
                                                                   19"
                                                                   """;
                                                       priceTDT = 3011.00;
                                                       break;
                                               }                                                 
                            break;
                            case 5:
                            StyleGama();
                            System.out.println(SelectionMade + vehiculo);
                            System.out.println("""
                                               Accesorios Exteriores: \n
                                               01.- Body Side Molding                   217.00
                                               02.- Car Cover                           230.00
                                               03.- Decklid Spoiler                     299.99
                                               04.- Door Edge Film                       42.00
                                               05.- Door Edge Guards                     84.00
                                               06.- Door Trim Chrome                    285.00
                                               07.- Door Visor                          185.00
                                               08.- Front Fender Emblems                 50.00
                                               09.- Rear Bumper Applique                 70.00
                                               10.- Fog Lights                          325.00
                                               11.- Nose Mascs                          158.00
                                               12.- Moonrof Visor                       138.00
                                               13.- Splash Guard Set                    104.00
                                               14.- Dust Cover                          350.00
                                               15.- Door Mirror Cover - Carbon Fiber    520.00
                                                                                            
                                               """);
                                               
                                               System.out.println("Seleccione la ocpion que se desea Ejecutar");
                                               TipodT = leer.nextInt();
                                               switch(TipodT){
                                                   case 1:
                                                       TipoDTTxt = "Body Side Molding";
                                                       priceTDT = 230.00;
                                                       break;
                                                    case 2:
                                                       TipoDTTxt = "Car Cover";
                                                       priceTDT = 299.99;
                                                       break;
                                                    case 3:
                                                       TipoDTTxt = "Decklid Spoiler";
                                                       priceTDT = 42.00;
                                                       break;
                                                    case 4:
                                                       TipoDTTxt = "Door Edge Film";
                                                       priceTDT = 84.00;
                                                       break;
                                                    case 5:
                                                       TipoDTTxt = "Door Trim Chrome";
                                                       priceTDT = 285.00;
                                                       break;
                                                    case 6:
                                                       TipoDTTxt = "Door Visor";
                                                       priceTDT = 185.00;
                                                       break;
                                                    case 7:
                                                       TipoDTTxt = "Door Edge Film";
                                                       priceTDT = 00.00;
                                                       break;
                                                    case 8:
                                                       TipoDTTxt = "Front Fender Emblems";
                                                       priceTDT = 50.00;
                                                       break;
                                                    case 9:
                                                       TipoDTTxt = "Rear Bumper Applique";
                                                       priceTDT = 70.00;
                                                       break;
                                                    case 10:
                                                       TipoDTTxt = "Fog Lights";
                                                       priceTDT = 325.00;
                                                       break;
                                                    case 11:
                                                       TipoDTTxt = "Nose Mascs ";
                                                       priceTDT = 158.00;
                                                       break;
                                                    case 12:
                                                       TipoDTTxt = "Moonrof Visor";
                                                       priceTDT = 138.00;
                                                       break;
                                                    case 13:
                                                       TipoDTTxt = "Splash Guard Set";
                                                       priceTDT = 104.00;
                                                       break;
                                                    case 14:
                                                       TipoDTTxt = "Dust Cover";
                                                       priceTDT = 350.00;
                                                       break;
                                                    case 15:
                                                       TipoDTTxt = "Door Mirror Cover - Carbon Fiber";
                                                       priceTDT = 520.00;
                                                       break;
                                               }                                                           
                            break;
                            case 6:
                            StyleGama();
                            System.out.println(SelectionMade + vehiculo);
                            System.out.println("""
                                               Accesorios  Interiores: \n
                                               01.- All-Seasons Floor Mats       142.00
                                               02.- Automatic-Dimming Mirror     219.00
                                               03.- Cargo Hook                    12.00
                                               04.- Cargo Net                     49.00
                                               05.- Console Illumination         250.00
                                               06.- Cargo Organizer               87.00
                                               07.- Door Panel Protector         149.00
                                               08.- Armrest Compartiment         337.00
                                               09.- Door Sill Trim-Illuminated   290.00
                                               10.- Cargo Cover                  166.00
                                               11.- Cargo Liner                  187.00   
                                                                                            
                                               """);
                                               
                                               System.out.println("Seleccione la ocpion que se desea Ejecutar");
                                               TipodT = leer.nextInt();
                                               switch(TipodT){
                                                   case 1:
                                                       TipoDTTxt = "All-Seasons Floor Mats ";
                                                       priceTDT = 142.00;
                                                       break;
                                                    case 2:
                                                       TipoDTTxt = "Automatic-Dimming Mirror";
                                                       priceTDT = 219.00;
                                                       break;
                                                    case 3:
                                                       TipoDTTxt = "Cargo Hook";
                                                       priceTDT = 12.00;
                                                       break;
                                                    case 4:
                                                       TipoDTTxt = "Cargo Net ";
                                                       priceTDT = 49.00;
                                                       break;
                                                    case 5:
                                                       TipoDTTxt = "Console Illumination";
                                                       priceTDT = 250.00;
                                                       break;
                                                    case 6:
                                                       TipoDTTxt = "Cargo Organizer";
                                                       priceTDT = 87.00;
                                                       break;
                                                    case 7:
                                                       TipoDTTxt = "Door Panel Protector";
                                                       priceTDT = 149.00;
                                                       break;
                                                    case 8:
                                                       TipoDTTxt = "Armrest Compartiment";
                                                       priceTDT = 337.00;
                                                       break;
                                                    case 9:
                                                       TipoDTTxt = "Door Sill Trim-Illuminated";
                                                       priceTDT = 290.00;
                                                       break;
                                                    case 10:
                                                       TipoDTTxt = "Cargo Cover";
                                                       priceTDT = 166.00;
                                                       break;
                                                    case 11:
                                                       TipoDTTxt = "Cargo Liner ";
                                                       priceTDT = 187.00;
                                                       break;
                                               }                                                         
                            break;
                            case 7:
                            StyleGama();
                            System.out.println(SelectionMade + vehiculo);
                            System.out.println("""
                                               Accesorios Electrónicos: \n
                                               01.- Wireless Phone Charger      305.00
                                               02.- USB Charger - 2.1 Amp.      120.00
                                               03.- Puddle Light                185.00
                                               04.- Parking Sensors             514.00                                        
                                               """);
                                               
                                               System.out.println("Seleccione la ocpion que se desea Ejecutar");
                                               TipodT = leer.nextInt();
                                               switch(TipodT){
                                                   case 1:
                                                       TipoDTTxt = "Wireless Phone Charger ";
                                                       priceTDT = 305.00;
                                                       break;
                                                    case 2:
                                                       TipoDTTxt = "USB Charger - 2.1 Amp.";
                                                       priceTDT = 120.00;
                                                       break;
                                                    case 3:
                                                       TipoDTTxt = "Puddle Light";
                                                       priceTDT = 185.00;
                                                       break;
                                                    case 4:
                                                       TipoDTTxt = "Parking Sensors";
                                                       priceTDT = 514.00;
                                                       break;
                                               }                                                    
                            break;
                    } // Aqui Termina el Swicth Case Principal de Amenidades
                    
                    
                    StyleGama();
                    // variable para el total
                    double total = precio + priceTDT;
                    // muestro la descripcion del Total y el total
                    System.out.println(
                        "\n Gama Seleccionada: " + vehiculo  + "      " + "US$ " + precio 
                        + "\n Amenidades:      " + TipoDTTxt + "      " + "US$ " + priceTDT +
                        "\n                                  __________________________ \n" + 
                        "Total:                                   " + "US$ " + total 
                    );
                    
                    TipoA = leer.nextInt();
                    
                }
                
                // Si el cliente no quiere agregar Amendades, Muestro Esto
                else if(Sino == 2){
                    StyleGama();
                    System.out.println(
                        "\n Gama Seleccionada: " + vehiculo + "\t" + "US$" + precio 
                        + "\n Amenidades: " + "\t" + " Ninguna" +
                        "\n \t \t \t \t______________ \n" + 
                        "Total: \t \t \t \t" + "US$" + precio 
                );
                }
            }
            
        } else if(leerOpcion == 2) {
            System.exit(0);
            } 
    }
    
    
    public static void main(String[] args) {
        // Aqui llamo la clase donde tengo todo el Codigo
        MainAutos();
    }
    

}
/*

        
*/