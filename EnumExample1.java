enum Learning {
    COREJAVA, COLLECTIONS, GENERICS, JSPANDSERVLETS, MUILTITHREADING
}

public class EnumExample1 {
    public static void main(String[] args) {
        Learning learn = Learning.COREJAVA;
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
    }
}
