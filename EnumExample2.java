enum Learning2 {
    COREJAVA(1), COLLECTIONS(2), GENERICS(3), JSPANDSERVLETS(4), MUILTITHREADING(5);

    public int value;

    private Learning2(int value) {
        this.value = value;
    }
}

public class EnumExample2 {
    public static void main(String[] args) {
        Learning2 learn = Learning2.COREJAVA;
        switch (learn) {
            case COLLECTIONS:
                System.out.println("Step 2 : Learning Collections framework");
                break;
            case COREJAVA:
                System.out.println("Step 1 : learning Core Java");
                break;
            case GENERICS:
                System.out.println("Step 3 : Learning Generics ");
                break;
            case JSPANDSERVLETS:
                System.out.println("Step 4 : Learning JSP and Servlets");
                break;
            case MUILTITHREADING:
                System.out.println("Step 5 : Learning MuiltThreading");
                break;
            default:
                System.out.println("Element not in the enumarated list");
                break;
        }
        for (Learning2 temp : Learning2.values()) {
            System.out.println(temp.ordinal());
        }
    }
}
