package main;

public class main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Ivan");
        employees.add("Slava");
        employees.add("Gosha");
        employees.add("Micha");
        employees.add("Sveta");
        employees.add("Nina");
        employees.add("Kolya");
        //        employees.remove("Ivan");


      for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
