public class Aula7 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("BOB", "França", 1.75f, 68.9f, 31, 11, 2, 1);
        l[1] = new Lutador("CADU", "Brasil", 1.68f, 57.8f, 29, 14, 2, 3);
        l[2] = new Lutador("STEPHEN", "EUA", 1.65f, 80.9f, 35, 12, 2, 1);
        l[3] = new Lutador("RICHARD", "Austrália", 1.93f, 81.6f, 28, 13, 0, 2);
        l[4] = new Lutador("PEDRO", "Brasil", 1.70f, 119.3f, 37, 5, 4, 3);
        l[5] = new Lutador("PITTER", "EUA", 1.81f, 105.7f, 30, 12, 2, 4);

        Luta UFC = new Luta();
        UFC.marcaLuta(1[4], 1[5]);
        System.out.println(" ");

        UFC.marcaLuta(1[1], 1[5]);
        UFC.lutar();
        System.out.println(" ");
    }
}
