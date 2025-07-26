public class stringBuilder {


        public static void main(String[] args) {

            String helloWorld = "Hello" + " World";
            //when we concat on on string we need to store it to a variable
            //it wont update the original string
            //string creates a new object in the memory and returns the refrence to this new object
            helloWorld.concat(" and Goodbye");


            StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
            //stringbuilder method returns a StringBuilder refrence, but its a self refrence
            helloWorldBuilder.append(" and Goodbye");

            printInformation(helloWorld);
            printInformation(helloWorldBuilder);

            //here it started with the initial capcity of 16 so when it needs more capacity
            //it will req more and the data needs to be copied frm smaller to larger data so its now 34
            StringBuilder emptyStart = new StringBuilder();
            emptyStart.append("a".repeat(17));
            //here we started with 32 and we used 32 no needed to req more memory
            StringBuilder emptyStart32 = new StringBuilder(32);
            emptyStart32.append("a".repeat(17));

            printInformation(emptyStart);
            printInformation(emptyStart32);

            StringBuilder builderPlus = new StringBuilder("Hello" + " World");
            builderPlus.append(" and Goodbye");

            builderPlus.deleteCharAt(16).insert(16, 'g');
            System.out.println(builderPlus);

            builderPlus.replace(16, 17, "G");
            System.out.println(builderPlus);

            builderPlus.reverse().setLength(7);
            System.out.println(builderPlus);
        }

        public static void printInformation(String string) {

            System.out.println("String = " + string);
            System.out.println("length = " + string.length());
        }

        public static void printInformation(StringBuilder builder) {

            System.out.println("StringBuilder = " + builder);
            System.out.println("length = " + builder.length());
            System.out.println("capacity = " + builder.capacity());
        }


}
