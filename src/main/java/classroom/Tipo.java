package classroom;

public enum Tipo {
    DISCIPLINAR(10), //10
    FUNDAMENTACION(20), //20
    ELECTIVA(30); //30
	
    private int codigo;
    private Tipo(int codigo) {
        this.codigo = codigo;
    }
}
