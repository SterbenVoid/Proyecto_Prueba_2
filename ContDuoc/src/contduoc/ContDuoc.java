package contduoc;
import java.util.Scanner;
public class ContDuoc {

    
    public static void main(String[] args) {

        //Menu Inicial
       
        
        Scanner entrada = new Scanner(System.in);  
        int opcion;
        Empleado persona = null;
        do{
            System.out.println("====== MENU ======  ");
        System.out.println("1. Crear Empleado con su tipo de cargo.");
        System.out.println("2. Listar informacion del empleado y ejecutar metodos personalizados.");
        System.out.println("3. Salir");    
        System.out.print("Elija la opción: ");    
            opcion=entrada.nextInt();
            switch(opcion){
                
                
            
            //INGRESO DE DATOS DEL EMPLEADO
case 1 :{
                System.out.println("======== REGISTRO DE EMPLEADO ==========");
                
                //NOMBRE DEL EMPLEADO
                System.out.println("Ingrese su primer nombre: ");
                String Nombres = entrada.next();
        
                //APELLIDOS DEL EMPLEADO
                System.out.println("Ingrese su apellido paterno: ");
                String apPaterno=entrada.next();
        
                System.out.println("Ingrese su apellido materno: ");
                String apMaterno=entrada.next();
                
                //RUN DEL EMPLEADO
                System.out.println("Ingrese su run (sin digito verificador y puntos): ");
                int rut=entrada.nextInt();
        
                System.out.println("Ingrese su dv (sin guion): ");
                String dv=entrada.next();
        
                //FECHA DE NACIMIENTO DEL EMPLEADO DEL EMPLEADO
                System.out.println("Ingrese dia de nacimiento: ");
                int dianac=entrada.nextInt();
                while(0==dianac || dianac>=32){
                    System.out.println("DEBE SER ENTRE 1 Y 31");
                    dianac=entrada.nextInt();}
        
                System.out.println("Ingrese mes de nacimiento: ");
                int mesnac=entrada.nextInt();
                while(0==mesnac || mesnac>=13){
                    System.out.println("DEBE SER ENTRE 1 Y 12");
                    mesnac=entrada.nextInt();}
        
                System.out.println("Ingrese año de nacimiento: ");
                int anonac=entrada.nextInt();
                while(anonac>=2005){
                    System.out.println("DEBE SER MENOR A 2004");
                    anonac=entrada.nextInt();}
        
                
                //TIPO DE CARGO DEL EMPLEADO
                System.out.println("Ingrese su tipo de cargo numerico:(1.- Ayudante contador,2.- Contador General,3.- Contador Tributario,4.- Personal Administrativo) ");
                int tipocargo=entrada.nextInt();
                
                //VALIDACION TIPO DE CARGO 
                Validacion valida = new Validacion();
                String cargo=valida.validarTipoCargo(tipocargo);
                
                //SUELDO BRUTO DEL EMPLEADO 
                System.out.println("Ingrese su sueldo bruto: ");
                int sueldobruto=entrada.nextInt();
                while (sueldobruto<=0){
                    System.out.println("DEBE SER MAYOR A 0");
                    sueldobruto=entrada.nextInt();}
                
                //HORAS TRABAJADAS DEL EMPLEADO
                System.out.println("Ingrese la cantidad de horas trabajadas: ");
                int cantidadhoras=entrada.nextInt();
            
                while(0==cantidadhoras || cantidadhoras>=181){
                
                    System.out.println("DEBE SER ENTRE 0 Y 180");
                
                    cantidadhoras=entrada.nextInt();}
            
                //FECHA DE CONTRATACIÓN DEL EMPLEADO
                System.out.println("Ingrese dia de contratacion: ");
                int diacontr=entrada.nextInt();
                while(0==diacontr || diacontr>=32){
                    System.out.println("DEBE SER ENTRE 1 Y 31");
                    diacontr=entrada.nextInt();}
        
                System.out.println("Ingrese mes de contratacion: ");
                int mescontr=entrada.nextInt();
                while(0==mescontr || mescontr>=13){
                    System.out.println("DEBE SER ENTRE 1 Y 12");
                    mescontr=entrada.nextInt();}
        
                System.out.println("Ingrese año de contratacion: ");
                int anocontr=entrada.nextInt();
                while(anocontr>=2022){
                    System.out.println("DEBE SER MENOR A 2022");
                    anocontr=entrada.nextInt();}
                
                //VALIDACION DE HORAS TRABAJADAS
                int cantidadhorasnotrabajadas = 180 - cantidadhoras;
                
                //VALIDACION DE DESCUENTO POR HORAS NO TRABAJAS
                int descuentohorasnotrabajadas=valida.calcularDescuentoPorHorasNoTrabajadas(sueldobruto, cantidadhorasnotrabajadas);
                
                //VALIDACION SUELDO IMPONIBLE
                int sueldoimponible=valida.calcularSueldoImponible(sueldobruto, descuentohorasnotrabajadas);
                
                //VALIDACION DESCUENTO PREVISIONAL
                int descuentoprevisional = valida.calcularDescuentoPrevisionales(sueldoimponible);
                
                //VALIDACION DE SUELDO LIQUIDO
                int sueldoliquido=valida.calcularSueldoLiquido(sueldoimponible, descuentoprevisional);
                
                
                
                
                //CREACION DE NUEVO EMPLEADO
               
                
                
                persona=new Empleado(Nombres,apPaterno,apMaterno,dv,cargo,rut,tipocargo,sueldobruto,cantidadhoras,dianac,mesnac,anonac,diacontr,mescontr,anocontr,descuentohorasnotrabajadas,sueldoimponible, descuentoprevisional,sueldoliquido);    
                System.out.println("Ingrese caracter para continuar: ");
                String salir = entrada.next();
                
                
                break;}

case 2 :{       
    
                if(persona==null){
                    System.out.println("ERROR INGRESE DATOS");
                    System.out.println("Ingrese caracter para continuar: ");
                String salir = entrada.next();
                break;
                
                
                }
                else{ 
                    
                //DATOS DEL EMPLEADO INGRESADO
                Validacion valida = new Validacion();
                valida.listar(persona);
               
                
                
                
                System.out.println("Ingrese caracter para continuar: ");
                String salir = entrada.next();
                break;}
                
          //SALIDA  
}case 3 : {
    
           
    
            
                System.out.println("Ingrese caracter para continuar: ");
                String salir = entrada.next();
                break;}
 
            
                    
        }
        }while(opcion!=3);
                }
}


              