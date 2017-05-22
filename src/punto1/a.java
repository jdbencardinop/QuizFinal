package punto1;

/**
 *
 * @author Bencardino Perdomo
 */
public abstract class a {
    abstract void a1();
    abstract void a2();
    public static void a3() {
        System.out.println("a3 funciona");
    }
}

abstract class b extends a {
    @Override
    public void a1() {
        System.out.println("funciona b1");
    } 
}

class c extends b {    
    public c() {
        System.out.println("se creo un tipo c");
    }
    protected static void c1(){
        System.out.println("funciona c1");
    }
    @Override
    public void a2() {
        System.out.println("funciona c2");
    }
    
}

abstract class d extends c{
    protected abstract void d1();

    @Override
    public abstract void a2();        
}