public class TestingPolimorfismo {
public static void main (String[] args){

    
    FiguraGeometrica unaFiguraGeometrica = new FiguraGeometrica("Rombo");
System.out.println();
unaFiguraGeometrica.setArea(12.45);

//Ejemplo de polimorfismo estatico
//El programador indica cual metodo usar segun los parametros que envie


System.out.println(unaFiguraGeometrica.toString());
System.out.println("Area de la figura: " +
unaFiguraGeometrica.toString(true));

Circulo circulo1 = new Circulo("circulo",10.5);


//ejemplo de polimorfismo dimanico
//java detecta que objeto es para llamar al metodo apropiado

double a = circulo1.getArea();
circulo1.setArea(a);
System.out.println("info de circulo: "+ circulo1.toString());

Triangulo triangulo1 = new Triangulo("Triangulo 1",25,15);
double b = triangulo1.getArea();
triangulo1.setArea(b);
System.out.println("info de triangulo1: "+ triangulo1.toString());

Triangulo triangulo2 = new Triangulo("Triangulo2",10,9,6);
double c = triangulo2.getPerimetro();
triangulo2.setPerimetro(c);
System.out.println("info de triangulo2: "+ triangulo2.toString());
}
}