//importacion del scanner
import java.util.Scanner;
public class kevin {
public static void main(String[] args) {
//sirve para ingresar y seleccionar valores determinados 
Scanner d = new Scanner(System.in);
//declarando variables
int eleccion , bit;
//Es el Vector
double [] sifra=new double [17];
//MENU 
System.out.println("----------Menu----------");
System.out.println("1. Suma ");
System.out.println("2. Resta ");
System.out.println("3. Multiplicaci�n");
System.out.println("4. Divisi�n ");
System.out.println("5. Ver Bit�cora");
System.out.println("6. Borrar Bit�cora");
System.out.println("7. Salir");
System.out.println("Seleccione una opci�n: ");
eleccion = d.nextInt();
do{
//la condicion de la suma
if(eleccion == 1){
System.out.println(" ");
System.out.println("Opci�n: Suma ");
System.out.println("Ingrese el primer n�mero:");
sifra[1]= d.nextDouble();
System.out.println("Ingrese el segundo n�mero:");
sifra[2]= d.nextDouble();
sifra[3]= sifra[1]+sifra[2];
System.out.println("El resultado es: "+sifra[3]);
System.out.println("Seleccione una opci�n: ");
eleccion = d.nextInt();

}
//la condicion de la resta
if(eleccion == 2){
System.out.println(" ");
System.out.println("Opci�n: Resta ");
System.out.println("Ingrese el primer n�mero:");
sifra[4]= d.nextDouble();
System.out.println("Ingrese el segundo n�mero:");
sifra[5]= d.nextDouble();
sifra[6]= sifra[4]-sifra[5];
System.out.println("El resultado es: "+sifra[6]);
System.out.println("Seleccione una opci�n: ");
eleccion = d.nextInt();

}
//la condicion de la multiplicacion
if(eleccion == 3){
System.out.println(" ");
System.out.println("Opci�n: Multiplicaci�n ");
System.out.println("Ingrese el primer n�mero:");
sifra[7]= d.nextDouble();
System.out.println("Ingrese el segundo n�mero:");
sifra[8]= d.nextDouble();
sifra[9]= sifra[7]*sifra[8];
System.out.println("El resultado es: "+sifra[9]);
System.out.println("Seleccione una opci�n: ");
eleccion = d.nextInt();

}
//la condicion de la division
if(eleccion == 4){
System.out.println(" ");
System.out.println("Opci�n: Divisi�n ");
System.out.println("Ingrese el primer n�mero:");
sifra[10]= d.nextDouble();
System.out.println("Ingrese el segundo n�mero:");
sifra[11]= d.nextDouble();

//aqui en esta condicion marcara el error de dividir por 0
if (sifra[11]==0){
    System.out.println("Error");
}
//aqui en esta condicion nos trabaja de manera correcta la division
if(sifra[11]<0){
sifra[12]=sifra[10]/sifra[11];
System.out.println("El resultado es: "+sifra[12]);
System.out.println("Seleccione una opci�n: ");
eleccion = d.nextInt();

}
if(sifra[11]>0){
sifra[12]=sifra[10]/sifra[11];
System.out.println("El resultado es: "+sifra[12]);

System.out.println("Seleccione una opci�n: ");
eleccion = d.nextInt();
}}
//Bitacora : nos muestra un esquema del proceso realizado en el campo de nuestro programa
if(eleccion == 5){
System.out.println(" ");
System.out.println("Opci�n: Ver Bit�cora");
System.out.println(sifra[1]+"+"+sifra[2]+"="+sifra[3]);
System.out.println(sifra[4]+"-"+sifra[5]+"="+sifra[6]);
System.out.println(sifra[7]+"*"+sifra[8]+"="+sifra[9]);
System.out.println(sifra[10]+"/"+sifra[11]+"="+sifra[12]);
System.out.println("Seleccione una opci�n: ");
eleccion = d.nextInt();

}
//condicion que borra Bitacora cdependiendo la  eleccion de las opciones "regresar a menu" y "volver a menu"
if(eleccion == 6){
System.out.println(" ");
System.out.println("Opci�n: Borrar Bit�cora");
System.out.println("�Esta segur@ que desea borrar la Bit�cora?");
System.out.println("Ingrese '1'(Si) para continuar o '2'(No) para volver a Men� ");
bit=d.nextInt();
// condicion que borra la bitacora
if (bit == 1){
    for(int v=0; v<=12; v++){
    sifra[v]=0;
} 
System.out.println(" opci�n '1'");
System.out.println(" Bit�cora borrada ");    
//condicion que nos vuelve al menu al colocar bit = 2
}
if(bit==2){
System.out.println(" ");
System.out.println("----------Menu----------");
System.out.println("1. Suma ");
System.out.println("2. Resta ");
System.out.println("3. Multiplicaci�n ");
System.out.println("4. Divisi�n ");
System.out.println("5. Ver Bit�cora");
System.out.println("6. Borrar Bit�cora");
System.out.println("7. Salir");
System.out.println("Seleccione una opci�n: ");
eleccion = d.nextInt();    
}}
//condicion que finaliza el programa
if(eleccion== 7){
System.out.println("Hasta la vista baby");
break;
}
//esta condicion nos muestra que si precionamos un numero mayor a 7 nos dice "numero invalido" porque no existe en las opciones definidas
if(eleccion > 7 ){
System.out.println(" ");
System.out.println("Numero Invalido");
System.out.println("----------Menu----------");
System.out.println("1. Suma de dos n�meros");
System.out.println("2. Resta ");
System.out.println("3. Multiplicaci�n ");
System.out.println("4. Divisi�n ");
System.out.println("5. Ver Bit�cora");
System.out.println("6. Borrar Bit�cora");
System.out.println("7. Salir");
System.out.println("Seleccione una opci�n: ");
eleccion = d.nextInt();
}}
while(eleccion <= 7);
}}