   // Librerias
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Inicio de la clase 
public class MTax implements Constant {
    
    public MTax(){
        
    }
    
    public static List<String> validate(List<X_Tax> xTaxList) {
        
        List<String> errorList = new ArrayList<>();
        
       List<String> taxCategoryList = MInfoTaxCategory.getTaxCategoryStringList();
        
        if(xTaxList != null && xTaxList.size() > 0) {
            
            List<String> validIds = new ArrayList<>();
            
            
            int cont = 0;   //Declaramos e iniciamos contador
            
            for (X_Tax tax : xTaxList) {
                if(tax.getId() != null){
                    validIds.add(tax.getId().toString());
                }
                
                //Podemos observar que tenemos ciertos
                
               if(tax.getAmount() == null) {
                    errorList.add("El importe es obligatorio");
                }  //Finaliza el If 

                if(tax.getTax() == null) {
                    errorList.add("El impuesto es obligatorio");
                } //Finaliza el If
                
                
                else if(!taxCategoryList.contains(tax.getTax())) {
                    errorList.add("El impuesto no es un dato valido");
                } //Finaliza else/if

                if(tax.isLocal()){
                    if(tax.isTrasladado() && tax.getTaxAmount() == null ) {
                        errorList.add("El importe es obligatorio");
                    
                    } //Finaliza el If anidado
               }  //finaliza if 
                    
               else {
                  if(tax.getTaxAmount() == null ) {
                       errorList.add("El importe es obligatorio");
                   } //finaliza el if anidado
               } // finaliza else 
                
                if(!tax.isLocal()){
                    cont++;
                } // cerramos if 
            } // cerramos for 
            
            if(cont<=0){
                errorList.add("Debe de incluir al menos una tasa no local");
            }
            
            if(validIds.size() > 0){
                    
                    List<X_Tax> xt = TaxsByListId(validIds, false);
                    if(xt.size() != validIds.size()){
                        errorList.add("Existen datos no guardados previamente");
                    }
                    else{
                        HashMap<String, X_Tax> map_taxs = new HashMap<String, X_Tax>();
                        
                        for(X_Tax tax: xt){
                            map_taxs.put(tax.getId().toString(), tax);
                        }
                        
                        for(int i = 0; i < xTaxList.size(); i++){
                            
                            if(xTaxList.get(i).getId() != null){
                                xTaxList.get(i).setCreated(
                                        map_taxs.get(xTaxList.get(i).getId().toString())
                                                .getCreated());
                            } //cerramos if 
                        }  // Cerramos for
                    }  // Cerramos else
            } //cerramos if 
        }//Cerramos If
        
        else {
            errorList.add("El documento no tiene tasas");
        }  //cerramos else 
        
        return errorList;  // regresamos el valor de errorList
    }
    
}  // cierre de main


// Organice un poco el codigo ya que senti que estaba mumy amontonado e inclui comentarios en varias partes del codigo
//ya que era un poco complicado identificar cada parte del codigo 


// puedo observar algunas condiciones la cuales se ven muy complejas en funciones por ejemplo la siguiente
//if(xTaxList != null && xTaxList.size() > 0  podriamos hacer una funcion pasandole esos parametros y que te retorne un true o false 

// en el caso con tanto if anidado podriamos usar un switch.
