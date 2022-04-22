class Prenda{
    TipoPrenda tipoPrenda
    Categoria categoria
    Material material;
    Color color_primario;
    Color color_secundario;

    Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Color colorSecundario){
        Validator.notNull(tipoPrenda)
        Validator.notNull(material)
        Validator.notNull(colorPrimario)

    }

}

class TipoPrenda  {
    Categoria categoria;

    TipoPrenda(Categoria categoria){
        Validator.notEmpty(categoria);
    }

    List<tipoPrenda> tipos;

    void generarTipos(){
        const TipoPrenda zapato = new TipoPrenda(Categoria.CALZADO);
        const TipoPrenda remera = new TipoPrenda(Categoria.SUPERIOR);
        const TipoPrenda pantalon = new TipoPrenda(Categoria.INFERIOR);
        const TipoPrenda pulsera = new TipoPrenda(Categoria.ACCESORIO);

        //o Map
        tipos.addAll(List.of(zapato,remera,pantalon,pulsera));
    }

    void agregarTipo(){}
    
}

enum Categoria {
    SUPERIOR,
    INFERIOR,
    CALZADO,
    ACCESORIO
}

enum Material {
    TELA, CUERO, ECOCUERO, LONA
}

class Color {
    int r, g, b;

    Color (int r, int g, int b)
}

class Atuendo {
    //List<Prenda> prendas;
    
    //ó
    
    Prenda superior;
    Prenda inferior;
    Prenda zapatos;
    Prenda accesorio;
}

class GuardaRopas {
    List<Prendas> todasLasPrendas;
}