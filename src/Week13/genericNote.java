package Week13;

public class genericNote {
    public static void main(String[] args) {
        //creating instance
        genericArray intMethod = new genericArray();
        //second instance
        genericArray genericMethod = new genericArray();

        int intArray[] = {2,9,5,4,7};
        double doubleArray[] = {1,2,2,9,3,5,4,4,7,7};
        char charArray[] = {'L', 'I', 'V', 'H', 'E'};
        String stringArray[] = {"Hello", "from", "The", "Other", "Side"};

        Integer[] intarray = {2,9,5,4,7};
        Double[] doublearray = {1.2,2.9,3.5,4.4,7.7};
        Character[] chararray = {'L', 'I', 'V', 'H', 'E'};
        String[] stringarray = {"Hello", "from", "The", "Other", "Side"};


        //using instance to access print array method
        intMethod.printArray(intArray);

        //pass in the arrays into generic method

        System.out.println();
        System.out.println("Integer array: ");
        genericMethod.printArrayGenerics(intarray);
        System.out.println("Double array: ");
        genericMethod.printArrayGenerics(doublearray);
        System.out.println("Character array: ");
        genericMethod.printArrayGenerics(chararray);
        System.out.println("String array: ");
        genericMethod.printArrayGenerics(stringarray);
    }
}
