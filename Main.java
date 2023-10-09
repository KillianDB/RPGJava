public class Main {
    public static void main(String[] args) {
        Mago alvo = new Mago("Jorge", 4, 2, 4);

        Mago mago = new Mago("Wicky", 3, 2, 5);

        mago.setNome("Wicky");
        
        mago.setResistencia(3);
        
        mago.setForca(2);
        
        mago.setInteligencia(5);
        
        System.out.println("O mago "+mago.getNome()+" tem "+mago.getMagia()+" de magia, "+mago.getForca()+" de força, "+mago.getInteligencia()+" de inteligencia, "+mago.getResistencia()+" de resistencia e "+mago.getVida()+" de vida.");

         int ataque = mago.atacar(9);
        System.out.println("O Mago "+ mago.getNome() + " causou " + ataque + " de dano com ataque básico.");
        
        System.out.println(mago.moveParaFrente());
        
        System.out.println(mago.receberDano(6));

        int danoCausado = mago.bolaDeFogo(5);
        System.out.println("O Mago "+ mago.getNome() + " causou " + danoCausado + " de dano com Bola de Fogo.");
    
        System.out.println(mago.energiaRefletora(6));

        System.out.println(mago.transformacao(3));

        System.out.println(alvo.congelamento());

        System.out.println(mago.invocacaoElemental());
        
        System.out.println(mago.maldicao(alvo, 2));
    }
}
