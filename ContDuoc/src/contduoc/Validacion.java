package contduoc;



//VALIDACIONES DE CONTDUOC

public class Validacion {
    public String validarTipoCargo(int tipoCargo){
        String cargo = null;
        switch(tipoCargo){
            case 1 :
                cargo="Ayudane contador";
                break;
            case 2 :
                cargo="Contador General";
                break;
            case 3 :
                cargo = "Contador Tributario";
                break;
            case 4 :
                cargo="Personal Administrativo";
                break;           
        }
        return cargo;
        
    }
    
    //VALIDACION DESCUENTO POR HORAS NO TRABAJADAS
   public int calcularDescuentoPorHorasNoTrabajadas(int sueldobruto,int horasnotrabajadas){
        int descuentohorasnotrabajadas=(sueldobruto/180)*horasnotrabajadas;
        return descuentohorasnotrabajadas;
        
   }
   
   //VALIDACION CALCULAR SUELDO IMPONIBLE
   public int calcularSueldoImponible(int sueldobruto,int descuentohorasnotrabajadas){
   int sueldoimponible= sueldobruto - descuentohorasnotrabajadas;
   return sueldoimponible;
   } 
   
   //VALIDACION DESCUENTO PREVISIONALES
   public int calcularDescuentoPrevisionales(int sueldoimponible) {
    int descuentoprevisional = (int) (sueldoimponible*0.20);
    return descuentoprevisional;
    }
   
   //VALIDACION SUELDO LIQUIDO 
public int calcularSueldoLiquido(int sueldoimpoible, int descuentoprevisional){
int sueldoliquido=sueldoimpoible-descuentoprevisional;
return sueldoliquido;
    }

public void listar(Empleado persona){
                System.out.println("---------------------DATO EMPLEADO----------------");
                System.out.println("Nombre:                        "+persona.getNombres()+" "+persona.getApPaterno()+" "+persona.getApMaterno());
                System.out.println("Fecha Nacimiento:              "+persona.getDianac()+"/"+persona.getMesnac()+"/"+persona.getAnonac());
                System.out.println("------------------------CARGO---------------------");
                System.out.println("Nombre:                        "+persona.getCargo());
                System.out.println("Sueldo Bruto:                  $"+persona.getSueldobruto());
                System.out.println("Horas Laborales Trabajadas:    "+persona.getCantidadhoras()+" horas");
                System.out.println("Descuento horas no trabajadas: $"+persona.getDescuentohorasnotrabajadas());
                System.out.println("Sueldo imponible:              $"+persona.getSueldoimponible());
                System.out.println("Descuentos Previsionales:      $"+persona.getDescuentoprevisional());
                System.out.println("Sueldo Liquido:                $"+persona.getSueldoliquido());



}

}
 

