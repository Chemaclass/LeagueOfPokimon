package modelo;

public class Teemo extends Starter {

    private int danoVeneno;

    private final int VIDA_MAXIMA = 150;
    private final int DANO_MAXIMO = 60;
    private final int DANO_MINIMO = 10;
    private final int DANOVENENO_MAXIMO = 20;
    private final int DANOVENENO_MINIMO = 3;
    
    public Teemo() {
        dano = DANO_MINIMO;
        vida = VIDA_MAXIMA;
        cantidadOro = getCantidadInicialOro();
        danoVeneno = DANOVENENO_MINIMO;
    }

    public Teemo(int dano, double vida, int cantidadOro, int danoVeneno) {
        super(dano, vida, cantidadOro);
        this.danoVeneno = danoVeneno;
    }

    public int getDanoVeneno() {
        return danoVeneno;
    }

    public void setDanoVeneno(int danoVeneno) {
        this.danoVeneno = danoVeneno;
    }

    @Override
    public int getVidaMaxima() {
        return VIDA_MAXIMA;
    }

    @Override
    public int getDanoMaximo() {
        return DANO_MAXIMO;
    }

    @Override
    public int getDanoMinimo() {
        return DANO_MINIMO;
    }

    public int getDanoVenenoMaximo() {
        return DANOVENENO_MAXIMO;
    }

    public int getDanoVenenoMinimo() {
        return DANOVENENO_MINIMO;
    }

    @Override
    public String getNombre(){
        return "Teemo";
    }
    @Override
    public void ataquePrincipal(Enemigo enemigo) { //Aranazo
        enemigo.setVida(enemigo.getVida() - dano);
    }

    @Override
    public void ataqueSecundario(Enemigo enemigo) { //Dardo venenoso
        enemigo.setVida(enemigo.getVida() - dano / 2);

        int num = ((int) (Math.random() * 100 + 1)) + ((Teemo) Personajes.starter).getDanoVeneno();
        if (num > 40 && num < 70) { //Envenenado
            enemigo.setEnvenenadoSiPosible(true);
        } else if (num >= 70 && num < 90) { //Cegado
            if (!enemigo.isInmuneACegado()) {
                enemigo.setCegadoSiPosible(true);
            }
        } else if (num >= 90) { //Envenenado y cegado
            enemigo.setEnvenenadoSiPosible(true);
            if (!enemigo.isInmuneACegado()) {
                enemigo.setCegadoSiPosible(true);
            }
        }
    }

    @Override
    public boolean isAtacaDosVeces() {
        return false;
    }

    @Override
    public boolean isFallaElAtaque() {
        return false;
    }

    @Override
    public boolean isPuedeEsquivar() {
        return false;
    }

    @Override
    public boolean isPonerseEscudo() {
        return false;
    }

    @Override
    public double ajustarDanoAResistencias(double dano) {
        return dano;
    }
}
