public class Mago{
public String nome;
public int resistencia;
public int forca;
public int inteligencia;
public int vida =10*resistencia;
public int magia =10*inteligencia;
public int n;
public int dano;

public Mago(String nome, int resistencia, int forca, int inteligencia){
this.nome = nome;
this.resistencia = resistencia;
this.forca = forca;
this.inteligencia = inteligencia;
vida = this.resistencia*10;
magia = this.inteligencia*10;
}

public String toString(){
return nome;
}

public int atacar(int n){
    this.n=n;
    return forca*n;
}

public String moveParaFrente(){
    return nome+" move para frente.";
}

public String receberDano(int dano){
    String resposta;
    if(vida>0){
     this.vida=vida-dano;
     resposta = nome+" está com "+ vida +" pontos de vida.";   
    }else{
        resposta = nome+" está morto.";
    }
    
    return resposta;
}

public int bolaDeFogo(int n){
    this.magia=magia-10;
    return this.inteligencia*n;
}

}