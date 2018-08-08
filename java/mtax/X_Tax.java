//Librerias
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Version;

public class X_Tax {
    
    //Variables y objetos
    private Object id;
    private BigDecimal base;
    private String tax;
    private String typeFactor;
    private BigDecimal tasaOCuota;
    private BigDecimal amount;
    private boolean trasladado;
    private boolean local;
    private boolean active;
    private String createdBy;
    private String updatedBy;
    private Date created;
    private Date updated;
    private String version;

    //constructor
    public X_Tax() {
    }

    
    public Object getId() {
        return id;
    }

    //Metodo setID
    public void setId(Object id) {
        this.id = id;
    }

    public BigDecimal getBase() {
        return base;
    }

    //Metodo setBase
    public void setBase(BigDecimal base) {
        this.base = base;
    }

    public String getTax() {
        return tax;
    }
    
    //Metodo setTax
    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTypeFactor() {
        return typeFactor;
    }

    //metodo setTpeFactor
    public void setTypeFactor(String typeFactor) {
        this.typeFactor = typeFactor;
    }

    public BigDecimal getTasaOCuota() {
        return tasaOCuota;
    }

    
    //Metodo setTasaCouta
    public void setTasaOCuota(BigDecimal tasaOCuota) {
        this.tasaOCuota = tasaOCuota;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    //Metodo setAmount
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isTrasladado() {
        return trasladado;
    }

    //Metodo setTrasladado
    public void setTrasladado(boolean trasladado) {
        this.trasladado = trasladado;
    }
    
    public boolean isLocal() {
        return local;
    }

   //Metodo setLocal
    public void setLocal(boolean local) {
        this.local = local;
    }

    public boolean isActive() {
        return active;
    }

    //Metoodo setActive
    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    //metodo setcreatedby
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    //Metodo setUpdateby 
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getCreated() {
        return created;
    }

    //Metodo setCreated
    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    //Metood setUpdate
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getVersion() {
        return version;
    }

    //Metodo setVersion 
    public void setVersion(String version) {
        this.version = version;
    }
    
}

//vuelvo a comentar el detalle en que en algunos aspectos estamos utilizando el idioma ingles y en otros estamos utilizando español
//seria bueno solo utilizar uno (tiene que ver mucho con el estilo del progrmador) cuuidar mucho los comentarios
//para poder identificarlos de unas manera mas rapida
