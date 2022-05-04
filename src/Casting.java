public class Casting {
    public static void main(String[] args) {
        double var1 = 112.35;
        int var2 = (int)var1;
        System.out.println("Double: " + var1);
        System.out.println("int: " + var2);

        String var3 = "49";
        int var4 = Integer.parseInt(var3);
        System.out.println("The string value is: " + var3);
        System.out.println("The integer value is: " + var4);
    }

}
