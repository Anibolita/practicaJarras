public class Jarra {//variables de instancia
private int cantidad;
private int capacidad;
public Jarra(int capacidadInicial){
if(capacidadInicial<=0){
throw new RuntimeException("ERROR: no se pueden crear jarras “ +
"con capacidad menor o igual que cero.");
}
this.capacidad=capacidadInicial;
}
// Aquí vendrán después los métodos creados en la siguiente fase
public bool llena(){
return this.cantidad=this.capacidad;
}
public bool vacia(){
return this.cantidad=0;
}
public bool llena(){
    return this.cantidad=this.capacidad;
}
    public bool vacia(){
        return this.cantidad=0;
    }
public void llenaDesde(Jarra j){
while((this.cantidad<this.capacidad)&&(j.cantidad>0)){
this.cantidad++;
j.cantidad--;
}
}
public String toString(){
return ("("+this.capacidad+","+this.cantidad+")");
}
public void metodoComunitario(){
//Bombo quiere que cambie
// Comentario incluido para pruebas
System.out.println("Aqui escribimos todos");
System.out.println("Anibal");
System.out.println("Bombo");
}
}
public Object clone() throws CloneNotSupportedException {
return (Jarra) super.clone();
}
public bool equals(Jarra otraJarra){
bool eqs = false;
if (null == otraJarra){ eqs = false; }
else if (this == otraJarra){ eqs = true; }
else if (otraJarra instanceOf Jarra.class){
eqs = this.capacidad == otraJarra.capacidad &&
this.cantidad == otraJarra.cantidad;
} else { eqs = false; }
return eqs;
}