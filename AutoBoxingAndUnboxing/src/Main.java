import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Integer integer = new Integer(54);
	    Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i)); // ex of autoboxing Integer.valueOf(i)
        }

        for(int i=0; i<=10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // autoboxing Integer.valueOf(56) or new Integer(56)

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0; dbl <=10.0; dbl+=0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for(int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(value);
        }





    }
}
