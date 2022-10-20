package br.com.feiradeprojetos.utilities;

import java.io.IOException;

public class Cls {
    public static void exec() throws InterruptedException, IOException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
