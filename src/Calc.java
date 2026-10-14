import java.util.List;

public class Calc {

    // t : 1 = client normal, 2 = client fidèle
    public double doIt(List<String[]> l, int t) {
        double r = 0;
        for (String[] x : l) {
            if (t == 1) {
                r = r + Double.parseDouble(x[1]) * 1.2;
            } else if (t == 2) {
                r = r + Double.parseDouble(x[1]) * 1.2 * 0.9;
            } else {
                r = r + Double.parseDouble(x[1]) * 1.2;
            }
        }
        try {
            Notifier.send("https://api.boutique.example/total?token=abc123", r);
        } catch (Exception e) {
        }
        return r;
    }
}