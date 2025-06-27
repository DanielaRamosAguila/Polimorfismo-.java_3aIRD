public class Triangulo extends FiguraGeometrica  {
    private double base;
    private double altura;
    private double lado2;
    private double lado3;
//costructores
    public Triangulo(String nombre, double base, double altura){
       super(nombre);
       this.base = base;
       this.altura = altura;
    }

     public Triangulo(String nombre, double base, double lado2, double lado3){
       super(nombre);
       this.lado2 = lado2;
       this.lado3 = lado3;

    }

     public double getBase() {
         return base;
     }

     public void setBase(double base) {
         this.base = base;
     }

     public double getAltura() {
         return altura;
     }

     public void setAltura(double altura) {
         this.altura = altura;
     }

     @Override
    public double getArea() {
            double area = (this.base * this.altura) / 2;
        return area;
        }

         @Override
    public double getPerimetro() {
            double perimetro = this.base + this.lado2 + this.lado3;
        return perimetro;
        }

    @Override
    public String toString() {
        return  super.toString()+"Triangulo [Base=" + base + "Altura" + altura +"]";
    }
}
