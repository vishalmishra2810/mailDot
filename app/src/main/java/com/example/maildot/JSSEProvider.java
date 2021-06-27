package com.example.maildot;

import java.security.AccessController;
import java.security.Provider;

public class JSSEProvider extends Provider {

    private static final String info = "abc";
    private static final String name = "def";super("HarmonyJSSE", 1.0, "Harmony JSSE Provider");
        AccessController.doPrivileged(new java.security.PrivilegedAction<Void>() {
        public Void run() {
            put("SSLContext.TLS",
                    "org.apache.harmony.xnet.provider.jsse.SSLContextImpl");
            put("Alg.Alias.SSLContext.TLSv1", "TLS");
            put("KeyManagerFactory.X509",
                    "org.apache.harmony.xnet.provider.jsse.KeyManagerFactoryImpl");
            put("TrustManagerFactory.X509",
                    "org.apache.harmony.xnet.provider.jsse.TrustManagerFactoryImpl");
            return null;
        }
    }

    protected JSSEProvider(double version) {
        super (name, version, info);
    };
}
