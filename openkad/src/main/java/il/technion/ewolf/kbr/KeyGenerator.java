package il.technion.ewolf.kbr;

import com.google.inject.Guice;
import com.google.inject.Injector;
import il.technion.ewolf.kbr.openkad.KadNetModule;

import java.io.File;
import java.io.PrintStream;

public class KeyGenerator {

    public static void main(String[] args) throws Exception {

        final KadNetModule module = new KadNetModule()
                .setProperty("openkad.keyfactory.keysize", "7");

        final Injector injector = Guice.createInjector(module);

        final KeyFactory kf = injector.getInstance(KeyFactory.class);

        final PrintStream out = new PrintStream("keys.7");

        for (int i = 0; i < 1000000; ++i) {
            out.println(kf.generate().toBase64());
        }
        final String currentDir = new File(".").getAbsolutePath();
        System.out.println(currentDir);
        out.close();
        System.out.println("DONE !");
    }
}
