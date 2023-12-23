package interpreter.grammar;

public class VariableSingleton {
    private static VariableSingleton instance;
    public int[] x = new int[100];
    public int[] y = new int[100];
    public int[] z = new int[100];
    private VariableSingleton() { }
    public static VariableSingleton getInstance() {
        if(instance == null) {
            instance = new VariableSingleton();
        }
        return instance;
    }

    public int getValue(String varString) {
        int num = Integer.parseInt(varString.substring(1));
        int returnValue = 0;
        switch (varString.charAt(0)) {
            case 'x' -> returnValue = x[num];
            case 'y' -> returnValue = y[num];
            case 'z' -> returnValue = z[num];
        }
        return returnValue;
    }

    public void setValue(String varString, int value) {
        int num = Integer.parseInt(varString.substring(1));
        switch (varString.charAt(0)) {
            case 'x' -> x[num] = value;
            case 'y' -> y[num] = value;
            case 'z' -> z[num] = value;
        }
    }

    public void setX(int index, int value) {
        x[index] = value;
    }
}
