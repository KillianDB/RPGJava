public class Mago {
    public String nome;
    public int resistencia;
    public int forca;
    public int inteligencia;
    public int vida = 10 * resistencia;
    public int magia = 10 * inteligencia;
    public int n;
    public int dano;

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
        return nome;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getForca() {
        return forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getVida() {
        return vida;
    }

    public int getMagia() {
        return magia;
    }

    public int atacar(int n) {
        this.n = n;
        return forca * n;
    }

    public String moveParaFrente() {
        return nome + " move para frente.";
    }

    public String receberDano(int dano) {
        String resposta;
        if (vida > 0) {
            this.vida = vida - dano;
            resposta = nome + " está com " + vida + " pontos de vida.";
        } else {
            resposta = nome + " está morto.";
        }

        return resposta;
    }

    public int bolaDeFogo(int n) {
        this.magia = magia - 10;
        return this.inteligencia * n;
    }

    public String energiaRefletora(int dano) {
        this.vida = vida + ((dano / 3) * 2);
        this.n = dano;
        return nome+ " usou Energia Refletora, recuperando 66% da vida perdida nessa rodada e concedendo a si o mesmo o dano aplicado nessa rodada.";
    }

    public String transformacao(int n) {
        setForca(this.forca + n);
        setResistencia(this.resistencia + n);
        return nome + " usou transformação, adiquirindo n pontos a mais de força e resistencia.";
    }

    public String congelamento() {
        return this.nome+" foi congelado por uma rodada e não poderá jogar.";
    }

    public String invocacaoElemental() {
       Mago novo = new Mago("Rodolfo", 4, 3, 3);
        return nome + " invocou um mago elemental para auxilia-lo na batalha. Nome: "+novo.nome+", força: "+novo.forca+", resistencia: "+novo.resistencia+", inteligencia: "+novo.inteligencia;
    }

    public String maldicao(Mago alvo, int n) {
        int duracao=0;
        this.n=n;
        for (int rodada = 1; rodada <= duracao; rodada++) {
            alvo.receberDano(n);
            duracao++;
        }
        return alvo + " foi amaldiçoado e receberá " + n + " de dano no começo de cada nova rodada.";
    }
}