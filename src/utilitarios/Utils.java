package utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {
    static NumberFormat formatandoValores = new DecimalFormat("R$ #, #00.00");

    public static String doubleToString(Double valor) {
        return formatandoValores.format(valor);
    }
}
