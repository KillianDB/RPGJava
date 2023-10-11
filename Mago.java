import java.util.Random;

public class Mago {
    private String nome;
    private int resistencia;
    private int forca;
    private int inteligencia;
    private int vida = 10 * resistencia;
    private int magia = 10 * inteligencia;
    private Random n = new Random();

    public Mago(String nome, int resistencia, int forca, int inteligencia) {
        this.nome = nome;
        this.resistencia = resistencia;
        this.forca = forca;
        this.inteligencia = inteligencia;
        vida = this.resistencia * 10;
        magia = this.inteligencia * 10;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public String getNome() {
        return this.nome;
    }

    public int getResistencia() {
        return this.resistencia;
    }

    public int getForca() {
        return this.forca;
    }

    public int getInteligencia() {
        return this.inteligencia;
    }

    public int getVida() {
        return this.vida;
    }

    public int getMagia() {
        return this.magia;
    }

    public int atacar() {
        int ataque = this.forca * n.nextInt(10)+1;
        return ataque;
    }

    public String moveParaFrente() {
        return this.nome + " move para frente.";
    }

    public String receberDano(int dano) {
        String resposta;
        if (this.vida > 0) {
            this.vida = this.vida - dano;
            resposta = this.nome + " está com " + this.vida + " pontos de vida.";
        } else {
            resposta = this.nome + " está morto.";
        }

        return resposta;
    }

    public int bolaDeFogo() {
        this.magia = this.magia - 10;
        int danoBolaDeFogo = this.inteligencia * n.nextInt(10)+1;
        return danoBolaDeFogo;
    }

    public String energiaRefletora(int dano) {
        this.vida = this.vida + ((dano / 3) * 2);
        return this.nome+ " usou Energia Refletora, recuperando 66% da vida perdida nessa rodada e concedendo a si o mesmo o dano aplicado nessa rodada.";
    }

    public String transformacao() {
        setForca(this.forca + n);
        setResistencia(this.resistencia + n);
        return this.nome + " usou transformação, adiquirindo n pontos a mais de força e resistencia.";
    }

    public String congelamento() {
        return this.nome+" foi congelado por uma rodada e não poderá jogar.";
    }

    //criar outra classe para criar outro personagem de ajuda, lacaio por exemplo
    public String invocacaoElemental() {
       Mago novo = new Mago("Rodolfo", 4, 3, 3);
        return this.nome + " invocou um mago elemental para auxilia-lo na batalha. Nome: "+this.nome+", força: "+this.forca+", resistencia: "+this.resistencia+", inteligencia: "+this.inteligencia;
    }

    public String maldicao(Mago alvo) {
        int duracao=0;
        for (int rodada = 1; rodada <= duracao; rodada++) {
            alvo.receberDano(n.nextInt(10)+1);
            duracao++;
        }
        return alvo + " foi amaldiçoado e receberá " + n + " de dano no começo de cada nova rodada.";
    }
}
