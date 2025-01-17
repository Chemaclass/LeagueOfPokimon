package modelo;

public class Gnar extends Starter {

    private int resistencia;
    private boolean esMonstruo;
    private int contadorMonstruo;

    private final int VIDA_MAXIMA = 170;
    private final int DANO_MAXIMO = 50;
    private final int DANO_MINIMO = 6;
    private final int RESISTENCIA_MAXIMA = 70;
    private final int RESISTENCIA_MINIMA = 35;
    private final boolean GNAR_ESMONSTRUOPORDEFECTO = false;
    private final int GNAR_CONTADORMONSTRUOPORDEFECTO = 0;

    public Gnar() {
        dano = DANO_MINIMO;
        vida = VIDA_MAXIMA;
        cantidadOro = getCantidadInicialOro();
        esMonstruo = GNAR_ESMONSTRUOPORDEFECTO;
        resistencia = RESISTENCIA_MINIMA;
        contadorMonstruo = GNAR_CONTADORMONSTRUOPORDEFECTO;
    }

    public Gnar(int dano, double vida, int cantidadOro, boolean esMonstruo, int resistencia) {
        super(dano, vida, cantidadOro);
        this.esMonstruo = esMonstruo;
        this.resistencia = resistencia;
    }

    @Override
    public void ataquePrincipal(Enemigo enemigo) {
        if (!isMonstruo()) {
            boomerangMiniGnar(enemigo);
        } else {
            golpeMegaGnar(enemigo);
        }
    }

    private void boomerangMiniGnar(Enemigo enemigo) {
        enemigo.setVida(enemigo.getVida() - dano);
    }

    private void golpeMegaGnar(Enemigo enemigo) {
        enemigo.setVida(enemigo.getVida() - dano * 2);
    }

    @Override
    public void ataqueSecundario(Enemigo enemigo) {
        if (!isMonstruo()) {
            salto(enemigo);
        } else {
            lanzarRoca(enemigo);
        }
    }

    private void salto(Enemigo enemigo) {
        enemigo.setVida(enemigo.getVida() - dano);
    }

    private void lanzarRoca(Enemigo enemigo) {
        enemigo.setVida(enemigo.getVida() - dano * 2);
    }

    public boolean isMonstruo() {
        return esMonstruo;
    }

    public void setEsMonstruo(boolean esMonstruo) {
        this.esMonstruo = esMonstruo;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getContadorMonstruo() {
        return contadorMonstruo;
    }

    public void setContadorMonstruo(int contadorMonstruo) {
        this.contadorMonstruo = contadorMonstruo;
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

    public int getResistenciaMaxima() {
        return RESISTENCIA_MAXIMA;
    }

    @Override
    public String getNombre() {
        if (!esMonstruo) {
            return "Gnar";
        }
        return "MegaGnar";
    }

    @Override
    public boolean isAtacaDosVeces() {
        if (!esMonstruo) {
            int num = (int) (Math.random() * 2 + 1);
            return num == 1;
        }
        return false;
    }

    @Override
    public boolean isFallaElAtaque() {
        if (esMonstruo) {
            int num = (int) (Math.random() * 4 + 1);
            return num == 1;
        }
        return false;
    }

    @Override
    public boolean isPuedeEsquivar() {
        if (!esMonstruo) {
            int num = (int) (Math.random() * 2 + 1);
            return num == 1;
        }
        return false;
    }

    @Override
    public boolean isPonerseEscudo() {
        return false;
    }

    @Override
    public double ajustarDanoAResistencias(double dano) {
        if (!isMonstruo()) {
            return dano - dano * resistencia / 100 / 2;
        }
        return dano - dano * resistencia / 100;
    }
}
