package TareaED04;

/**
 * Clase CCuenta
 * 
 * Contiene la información de las cuentas
 * @author Camilo-ED04
 * @vesion 1.0
 */

public class CCuenta {
    
    // Metodos publicos
    
    /**
     * Devuelve el nombre de la cuenta
     * @return nombre cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la cuenta
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cuenta
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Modifica la cuenta
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modifica el saldo de la cuenta
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interes
     * @return tipo de interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Modifica el tipo de interes
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    //Atributos
    /**
     * Nombre de la cuenta
     */
    private String nombre;
    /**
     * Numero de la cuenta
     */
    private String cuenta;
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    /**
     * interes de la cuenta
     */
    private double tipoInterés;

    public CCuenta()
    {
    }
    // El valor de la variables introducidas
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    //Nos muestra el estado del saldo
    public double estado()
    {
        return getSaldo();
    }
    // La cantidad de ingreso y sus excepciones
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    // La cantidad a retirar y sus excepciones
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
